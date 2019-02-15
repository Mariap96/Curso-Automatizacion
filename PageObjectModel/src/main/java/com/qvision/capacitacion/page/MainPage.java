package com.qvision.capacitacion.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
	
	WebDriver driver;
	
	public MainPage (WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public boolean validarIngreso () {
		
		boolean Isvalidate = false;
		
		WebElement lblTitulo = driver.findElement(By.xpath("//*[@id=\"available\"]/h2"));
		try {
		
			if (lblTitulo.isDisplayed()) {
				
				Isvalidate = true;
				
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		return Isvalidate;
		
	}
	
	WebElement txtCorejava;
	WebElement txtRuby;
	WebElement txtCocina;
	WebElement btnAñadir;
	WebElement txtTotal; 
	
	public void ingresarLibros () {
		
		
		txtCorejava = driver.findElement(By.xpath("//*[@id=\"listing\"]/tbody/tr[2]/td[4]/input"));
		txtCorejava.clear();
		txtCorejava.sendKeys("10");
		txtRuby = driver.findElement(By.xpath("//*[@id=\"listing\"]/tbody/tr[3]/td[4]/input"));
		txtRuby.clear();
		txtRuby.sendKeys("5");
		txtCocina = driver.findElement(By.xpath("//*[@id=\"listing\"]/tbody/tr[4]/td[4]/input"));
		txtCocina.clear();
		txtCocina.sendKeys("3");
		btnAñadir = driver.findElement(By.xpath("//*[@id=\"available\"]/input[1]"));
		btnAñadir.click();

	}

	public void validarTotal () {
		
		txtTotal = driver.findElement(By.xpath("//*[@id=\"total\"]"));
		txtTotal.getText();
		
	}
	

}
