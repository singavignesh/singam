package org.tcs.se;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Revision {
	public void test1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vignesh\\eclipse\\workspace\\RevisionSelenium\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		System.out.println("Facebook URl entered");
	}
	public static void main(String[] args) {
		Revision st = new Revision();
		st.test1();
	}

}