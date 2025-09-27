package com.Main.Entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class User {
 @NotBlank(message = "User Name Cann't be Empty!!")
 @Size(min = 8 , max = 15 ,message = "UserName must be in between 8-15!!")
 private String username;
 private String password;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
@Override
public String toString() {
	return "User [username=" + username + ", password=" + password + "]";
}
public void setPassword(String password) {
	this.password = password;
}
 
}
