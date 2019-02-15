package com.qvision.capacitacion.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage (WebDriver driver) {
		this.driver = driver;
	}
	
	WebElement txtUsername;
	WebElement txtPass;
	WebElement btnIngresar;
	
	
	public void logueo (String user , String pass) {
		
		txtUsername = driver.findElement(By.name("user"));
		txtUsername.sendKeys(user);
		txtPass = driver.findElement(By.xpath("/html/body/center/div/form/table/tbody/tr[2]/td[2]/input"));
		txtPass.sendKeys(pass);
		btnIngresar = driver.findElement(By.xpath("/html/body/center/div/form/table/tbody/tr[3]/td[2]/input"));
		btnIngresar.click();
	}
	
	

}
