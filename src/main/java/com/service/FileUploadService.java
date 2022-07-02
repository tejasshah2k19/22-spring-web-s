package com.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

//@controller repository service 
@Service
public class FileUploadService {

	public String uploadImage(MultipartFile file, String path) {

		try {
			File imgFile = new File(path, file.getOriginalFilename());
//			file.transferTo(imgFile);

			byte b[] = file.getBytes();

			FileOutputStream fos = new FileOutputStream(imgFile);
			fos.write(b);
			fos.close();
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return "/images/"+file.getOriginalFilename();
	}
}
