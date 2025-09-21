package com.springBoot.Test.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.springBoot.Test.FileUpload.FileUploadHelper;

@RestController
public class FileUploadController {
	@Autowired
	private FileUploadHelper fileUploadHelper;
	
	@PostMapping("/upload")
	 public ResponseEntity<String> fileUpload(@RequestParam ("file") MultipartFile file){
		
//		System.out.println(file.getSize());
////		System.out.println(file.getContentType());
////		System.out.println(file.isEmpty());
		try {
			if(file.isEmpty()) {
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("File Not Should Be Empty");
			}
//			if(file.getContentType().equals("image/jpeg")) {
//				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Only jpeg Formate Accepted");
//			}
			 boolean f =fileUploadHelper.uploadFile(file);
			 if(f) {
//				 return ResponseEntity.ok("File Uploaded Succesfully");
				 return ResponseEntity.ok(ServletUriComponentsBuilder.fromCurrentContextPath().path("/image/").path(file.getOriginalFilename()).toUriString());
			 }
			
		} catch (Exception e) {
			 e.printStackTrace();
		}
		
		 return ResponseEntity.ok("Working");
	 }

}
