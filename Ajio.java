package week3.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		//1.Go to https://www.redbus.in/ in chrome
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//2. In the search box, type as "bags" and press enter
		driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER);
		
		//3. To the left  of the screen under " Gender" click the "Men"
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		
		Thread.sleep(1000);
		
		//4. Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		
		Thread.sleep(1000);
		//5. Print the count of the items Found. 
		String itemsCount = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println("Count of items found : "+itemsCount);
		
		//6. Get the list of brand of the products displayed in the page and print the list.
		List<WebElement> brandList = driver.findElements(By.xpath("//div[@class='brand']"));
		System.out.println("Brand List Size : " +brandList.size());
		System.out.println("List of Brands");
		for (WebElement brandListname : brandList )
		{
			String brandListnames = brandListname.getText();
			System.out.println(brandListnames);
			
		}
		

		//7. Get the list of names of the bags and print it
		List<WebElement> bagNames = driver.findElements(By.className("name"));
		System.out.println("Bag names size : "+bagNames.size());
		System.out.println("List of Bags");
		for(WebElement bagNames1 : bagNames)
		{
			String bagNamesString = bagNames1.getText();
			System.out.println(bagNamesString);
		}
		
		
	}

}







//7. Get the list of names of the bags and print it
