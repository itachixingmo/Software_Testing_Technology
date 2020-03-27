package software_selenium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.JavascriptExecutor;
import java.util.*;

@RunWith(Parameterized.class)
public class TestDemo {
	private String input1;
	private String input2;
	private Demo demo = null;
	
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;
	
	public TestDemo(String input1,String input2){
		this.input1 = input1;
		this.input2 = input2;
	}
	
	@Before
	public void setUp() {
		String driverPath = System.getProperty("user.dir") + "/src/resources/driver/geckodriver.exe";
		System.setProperty("webdriver.firefox.bin","D:/Firefox/firefox.exe"); 
		System.setProperty("webdriver.gecko.driver", driverPath);
		
		driver = new FirefoxDriver();
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();

		demo = new Demo();
	}
	
//	@After
//	public void tearDown() {
//		driver.quit();
//	}
	
	@Parameters
	public static Collection<Object[]> getData(){
		return Arrays.asList(new Object[][]{
			{"3017218053","https://gitee.com/chenkuochih/software_test.git"},
			{"3017218054","https://gitee.com/roshan0/software_test.git"},
			{"3017218055","https://gitee.com/dai88X/software_test.git"},
			{"3017218056","https://github.com/Bing-Max/SoftwareTest.git"},
			{"3017218057","https://github.com/YumengGuo/SoftwareTesting"},
			{"3017218058","https://github.com/howAreYouHkk/SoftwareTestingTechnology"},
			{"3017218059","https://github.com/Eternal144/Software-Testing"},
			{"3017218060","https://gitee.com/HangxueLiu/softwareTest.git"},
			{"3017218061","https://github.com/qq734628996/software-test"},
			{"3017218062","https://github.com/cxdzb/software-testing-technology"},
			{"3017218063","https://github.com/PathfinderTJU/Softwate_test_homework"},
			{"3017218064","https://github.com/Martin12345677/software_testing_technology"},
			{"3017218065","https://gitee.com/panliming0418/softwareTestingTechnology.git"},
			{"3017218066","https://gitee.com/taytaytaytaylor11/SoftwareTesting"},
			{"3017218067","https://gitee.com/surumeng/test3017218067"},
			{"3017218068","https://gitee.com/Sunhanyu/SoftwareTestingTechnology.git"},
			{"3017218069","https://github.com/HaomingSun-1895/Software-Testing-hw.git"},
			{"3017218070","https://github.com/Taoboan1999/Taoboan1999"},
			{"3017218071","https://github.com/tianzhaotju/software_testing"},
			{"3017218072","https://github.com/ZhaomengWang/software_testing"},
			});
	}
		
	@Test
	public void testdemo() {		
		String s2 = demo.test(input1,input2,driver);
		String s1 = this.input2;
		System.out.println(s1.length());
		System.out.println(s2.length());
		
		System.out.println("this.input2"+this.input2);
		System.out.println("test(input1,input2,driver)"+s2);
		assertEquals(s1,s2);
//		assertEquals(s1,s2);
//		assertEquals(s2,s1);
	}
 

}
