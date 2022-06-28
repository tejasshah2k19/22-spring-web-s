package com.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.bean.ProductBean;
import com.dao.ProductDao;

@Controller
public class ProductController {

	@Autowired
	ProductDao productDao;

	@GetMapping("/newproduct")
	public String newProduct(Model model) {
		model.addAttribute("product", new ProductBean());// no value no error
		return "NewProduct";
	}

	@PostMapping("/saveproduct")
	public String saveProduct(@RequestParam("productImage") MultipartFile file,@ModelAttribute("product") @Valid ProductBean productBean, BindingResult result,
			 Model model) {

		System.out.println(file.getOriginalFilename());
		System.out.println(file.getSize());

		if (result.hasErrors()) {
			model.addAttribute("product", productBean);
			return "NewProduct";
		} else {
			productDao.insertProduct(productBean);
			return "redirect:/listproduct";
		}
	}

	@GetMapping("/listproduct")
	public String listProduct(Model model) {
		List<ProductBean> products = productDao.getAllProducts();
		model.addAttribute("products", products);
		return "ListProduct";
	}

}
