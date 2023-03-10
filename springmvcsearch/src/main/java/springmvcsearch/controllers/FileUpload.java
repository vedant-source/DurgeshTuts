package springmvcsearch.controllers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUpload {

	@RequestMapping("/uploadDocument")
	public String fileUpload() {
		System.out.println("uploadDocument controller worked...");
		return "imgUpload";
	}

	@RequestMapping(path = "/uploadimage", method = RequestMethod.POST)
	public String imageUpload(@RequestParam("formFile") CommonsMultipartFile file, HttpSession s, Model model) {
		System.out.println("imageUpload controller worked...");
		System.out.println("File Name : "+file.getName());
		System.out.println("File OriginalFilename : "+file.getOriginalFilename());
		System.out.println("File Size : "+file.getSize());
		System.out.println("File Bytes : "+file.getBytes());
		System.out.println("File StorageDescription : "+file.getStorageDescription());
		
		
		byte[] data = file.getBytes();
		
		//saving data to file server
		
		String path = s.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"resources"+File.separator+"image";
		
		//System.out.println(path);
	//	java.io.FileNotFoundException: C:\Users\vedantp\Desktop\springDurgesh\.metadata\.plugins\org.eclipse.wst.server.core
	//   																	\tmp0\wtpwebapps\springmvcsearch\WEB-INF\resources\image (Access is denied)
		
					
		//PROGRAM WORKS AT DIFFERENT FILE LOCATION .
		try {
			FileOutputStream fos = new FileOutputStream(path);
			fos.write(data);
			System.out.println("File Uploaded to server Successfully");
			model.addAttribute("msg", "File Uploaded At Server Successfully");
			model.addAttribute("filename", file.getOriginalFilename());
			fos.close();
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("Error while uploading file to server");
			e.printStackTrace();
		}
		
		return "fileSuccess";
	}

}
