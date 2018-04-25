package com.demo.data;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class One {

	public static void main(String[] args) throws IOException {
		FileInputStream fi=new FileInputStream("E://company_workspace//demo//mywebpage.properties");
		Properties p=new Properties();
		p.load(fi);
		WebDriver d=new FirefoxDriver();
		d.manage().window().maximize();
		d.get(p.getProperty("url"));
		d.findElement(By.id(p.getProperty("id_id"))).sendKeys("vara");
		d.findElement(By.id(p.getProperty("pwd_id"))).sendKeys("prasad");
		d.close();

	}

}
