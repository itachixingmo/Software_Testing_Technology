package software_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Demo {

	public String test(String number,String password,WebDriver driver) {
		driver.get("http://103.120.226.190/selenium-demo/git-repo");
		driver.manage().window().setSize(new Dimension(842, 696));
		driver.findElement(By.name("user_number")).click();
		driver.findElement(By.name("user_number")).sendKeys(number);
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.cssSelector(".btn")).click();
		
		WebElement textShow = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/form/div[5]/code"));
		System.out.println(textShow.getText());
		String queryString = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/form/div[5]/code")).getText();
		System.out.println(queryString);
		if(textShow.getText().equals(password)) {
			System.out.println("Success!"+ queryString);
		}else {
			System.out.println("Failed!");
		}
		//assertThat(password, is(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/form/div[5]/code")));
		driver.close();
		return queryString;
	}

}
