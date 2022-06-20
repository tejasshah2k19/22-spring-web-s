package com.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bean.UserBean;
import com.dao.UserDao;

//4
@Controller
public class SessionController {

	@Autowired
	UserDao userDao;

	// signup
	// view
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signup() {
		System.out.println("signup()");
		return "Signup";// jsp
	}

	// logic
	@RequestMapping(value = "/saveuser", method = RequestMethod.POST)
	public String saveUser(UserBean userBean, Model model) {
		// request.getParameter("") ;
		// UserBean
		System.out.println(userBean.getEmail());
		System.out.println(userBean.getFirstName());
		model.addAttribute("userBean", userBean);
		userDao.insertUser(userBean);
		return "redirect:/listUsers";
	}

	@GetMapping("/listUsers")
	public String listUsers(Model model) {
		ArrayList<UserBean> users = userDao.getAllUsers();
		model.addAttribute("users",users);
		return "ListUsers";
	}
	// register
	// view
	// logic

	// forgetpassword
	// view
	// logic

	@GetMapping("deleteuser")
	public String deleteUser(@RequestParam("userId") int userId) {
		userDao.deleteUser(userId);
		return "redirect:/listUsers";
	}

}

//session --> loing , register , forgetpassword 

//advjava -> LoginServlet RegisterServlet ForgetPAsswordServlet 
