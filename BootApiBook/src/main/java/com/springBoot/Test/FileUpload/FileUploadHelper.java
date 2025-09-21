package com.springBoot.Test.FileUpload;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {
	
//	private final String upload_dir="C:\\Users\\hp\\OneDrive\\Desktop\\Study Material\\Spring_And SpringBoot\\SpringBoot\\BootApiBook\\src\\main\\resources\\static";
	private final String upload_dir=new ClassPathResource("static/image/").getFile().getAbsolutePath();
	public FileUploadHelper()throws  IOException  {
		 
	}
	
	public boolean uploadFile(MultipartFile file) {
		boolean f=false;
		
		try {
			Files.copy(file.getInputStream(),Paths.get(upload_dir+File.separator+file.getOriginalFilename()),StandardCopyOption.REPLACE_EXISTING );
			f=true;
			
		} catch (Exception e) {
			 e.printStackTrace();
		}
		return f;
	}

}
