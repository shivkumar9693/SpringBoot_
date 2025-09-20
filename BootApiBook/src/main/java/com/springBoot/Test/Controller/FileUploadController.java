package com.springBoot.Test.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileUploadController {
	
	@PostMapping("/upload")
	 public ResponseEntity<String> fileUpload(){
		 return ResponseEntity.ok("Working");
	 }

}
