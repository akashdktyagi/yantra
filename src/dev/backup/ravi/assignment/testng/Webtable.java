package dev.backup.ravi.assignment.testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.yaml.snakeyaml.tokens.DirectiveToken;

public class Webtable {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver;
	    System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://money.rediff.com/gainers/bsc/dailygroupa?");
        WebElement table=driver.findElement(By.className("dataTable"));
       //find no of rows with list collection
        List<WebElement> rows=driver.findElements(By.xpath("//*[@class='dataTable']//tr"));
        int rowscount=rows.size();
        System.out.println(rowscount);
        
        List<WebElement> nocloumns=driver.findElements(By.xpath("//*[@class='dataTable']//tr[5]/td[1]"));
        int colcount=nocloumns.size();
        System.out.println(colcount);
        /*for (int col = 0; col <colcount; col++)
        {
        	String Expcolumn="X";
        	String curtext=nocloumns.get(col).getText();
            if(curtext.equalsIgnoreCase("x"))
            {
            	System.out.println("Curant column="+Expcolumn);
            	break;
            }   	        	
			}*/
     /* for (WebElement webElement : nocloumns)
      {
    	  String exptext="77.95";
      	  String curtext=webElement.getText();
        	System.out.println(curtext);
	}*/
        List<WebElement> total_td1= driver.findElements(By.xpath("//*[@class='dataTable']//tr//td[1]/a"));
        int count=total_td1.size();
        System.out.println("total columns in td 1="+count);
        
        for (WebElement ittd : total_td1) 
        {
        	String ss=ittd.getText();// iterate values
        	String expval="Reliance Capital";
        	//System.out.println(ss);
        	if(ittd.getText().equals(expval))
        	{
        		System.out.println(expval);
        	}
        	
		}
       
        
       
       /* // find total no of rows with size() methode
       

        //System.out.println("Row count="+rowscount);
        //WebElement cellclick=driver.findElement(By.xpath("//*[@class='dataTable']//tr[6]/td[4]"));
        WebElement cellclick=driver.findElement(By.xpath("//*[@class='dataTable']//tr[6]/td"));
        Thread.sleep(3000);
        
        //String celltext=cellclick.getText();  //fetch text of anything with gettext()
        //System.out.println("page title="+celltext);*/
        driver.close();
        
        
	}

	
}
