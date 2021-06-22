package basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Library
{
	FileInputStream Fis;
	Properties pr;
	WebDriver driver;
	String exp,act;
	ArrayList<String> tab2;
	
	public String OpenBrowser(String URL) throws IOException
	{
		Fis=new FileInputStream("C:\\Users\\SHASHANK\\Desktop\\GoogleAdsA\\GoogleAds\\src\\main\\java\\file\\GoogleData.properties");
		pr=new Properties();
		pr.load(Fis);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		System.out.println(driver.getTitle());
		return "BrowserOpen";
	}
	
	public String AboutGoogleAds() throws InterruptedException
	{
// How it works		
		driver.findElement(By.xpath(pr.getProperty("HowItWOrks"))).click();Thread.sleep(2000);
		
		exp ="How to Use Google Ads to Reach Your Goals | Google Ads";act = driver.getTitle();System.out.println(act);
		
		if(exp.equalsIgnoreCase(act))
		{	System.out.println("Success");}
		else
		{System.out.println("Unsuccessful");}
		
// Overview		
		driver.findElement(By.xpath(pr.getProperty("Overview"))).click();Thread.sleep(2000);
		
		exp ="Get More Customers With Easy Online Advertising | Google Ads";act = driver.getTitle();System.out.println(act);
		
		if(exp.equalsIgnoreCase(act))
		{	System.out.println("Success");}
		else
		{System.out.println("Unsuccessful");}
		
// Cost		
		driver.findElement(By.xpath(pr.getProperty("Cost"))).click();Thread.sleep(2000);
		
		exp ="Set a Flexible Advertising Budget that Works | Google Ads";act = driver.getTitle();System.out.println(act);
		
		if(exp.equalsIgnoreCase(act))
		{	System.out.println("Success");}
		else
		{System.out.println("Unsuccessful");}
		return "AboutGoogleAds Links Pass";
		
	}
	
	public String LearningAndsupport() throws InterruptedException 
	{
// Your Guide to Google Ads
		driver.findElement(By.xpath(pr.getProperty("YourGuidetoGoogleAds"))).click();Thread.sleep(2000);
		tab2=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab2.get(1));

		exp ="Your guide to Google Ads - Google Ads Help"; act = driver.getTitle(); System.out.println(act);
		
		if(exp.equalsIgnoreCase(act))
		{System.out.println("Success");}
		else
		{System.out.println("Unsuccessful");}
		driver.close(); driver.switchTo().window(tab2.get(0));	
		Thread.sleep(2000);
		
// Google Ads Help Center
		driver.findElement(By.xpath(pr.getProperty("GoogleAdsHelpCenter"))).click();Thread.sleep(2000);
		tab2=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab2.get(1));

		exp ="Google Ads Help";act = driver.getTitle();System.out.println(act);
		if(exp.equalsIgnoreCase(act))
		{System.out.println("Success");}
		else
		{System.out.println("Unsuccessful");}
		driver.close();driver.switchTo().window(tab2.get(0));
		
// Primer
		driver.findElement(By.xpath(pr.getProperty("Primer"))).click();Thread.sleep(2000);
		tab2=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab2.get(1));

		exp ="Google Primer App - Learn Business & Marketing Skills";act = driver.getTitle();System.out.println(act);
		
		if(exp.equalsIgnoreCase(act))
		{	System.out.println("Success");}
		else
		{System.out.println("Unsuccessful");}
		driver.close();driver.switchTo().window(tab2.get(0));
		
// Skillshop		
		driver.findElement(By.xpath(pr.getProperty("Skillshop"))).click();Thread.sleep(2000);
		tab2=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab2.get(1));

		exp ="Google Ads : Google";act = driver.getTitle();System.out.println(act);
		
		if(exp.equalsIgnoreCase(act))
		{	System.out.println("Success");}
		else
		{System.out.println("Unsuccessful");}
		driver.close();driver.switchTo().window(tab2.get(0));
		
// Skillshop
		driver.findElement(By.xpath(pr.getProperty("Skillshop"))).click();Thread.sleep(2000);
		tab2=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab2.get(1));

		exp ="Google Ads : Google";act = driver.getTitle();System.out.println(act);
				
		if(exp.equalsIgnoreCase(act))
		{	System.out.println("Success");}
		else
		{System.out.println("Unsuccessful");}
		driver.close();driver.switchTo().window(tab2.get(0));		
		return "LearningAndsupport Links Pass";
	}

	public String DevelopersAndPartners() throws InterruptedException
	{

// Google Developers Site		
		driver.findElement(By.xpath(pr.getProperty("GoogleDevelopersSite"))).click();Thread.sleep(2000);
		tab2=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab2.get(1));

		exp ="Google Developers";act = driver.getTitle();System.out.println(act);
		
		if(exp.equalsIgnoreCase(act))
		{	System.out.println("Success");}
		else
		{System.out.println("Unsuccessful");}
		driver.close();driver.switchTo().window(tab2.get(0));
// Google Ads API		
		driver.findElement(By.xpath(pr.getProperty("GoogleAdsAPI"))).click();Thread.sleep(2000);
		tab2=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab2.get(1));

		exp ="Product Overview  |  Google Ads API  |  Google Developers";act = driver.getTitle();System.out.println(act);
		
		if(exp.equalsIgnoreCase(act))
		{	System.out.println("Success");}
		else
		{System.out.println("Unsuccessful");}
		driver.close();driver.switchTo().window(tab2.get(0));
		
// Google Ads Scripts		
		driver.findElement(By.xpath(pr.getProperty("GoogleAdsScripts"))).click();Thread.sleep(2000);
		tab2=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab2.get(1));

		exp ="Google Ads scripts  |  Google Developers";act = driver.getTitle();System.out.println(act);
		
		if(exp.equalsIgnoreCase(act))
		{	System.out.println("Success");}
		else
		{System.out.println("Unsuccessful");}
		driver.close();driver.switchTo().window(tab2.get(0));
//Google Ads Remarketing Tags		
		driver.findElement(By.xpath(pr.getProperty("GoogleAdsRemarketingTags"))).click();Thread.sleep(2000);
		tab2=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab2.get(1));

		exp ="Tag your website for remarketing - Google Ads Help";act = driver.getTitle();System.out.println(act);
		
		if(exp.equalsIgnoreCase(act))
		{	System.out.println("Success");}
		else
		{System.out.println("Unsuccessful");}
		driver.close();driver.switchTo().window(tab2.get(0));
		return "DevelopersAndPartners links Pass";
	}
	
	
	public String RelatedProducts() throws InterruptedException
	{
// Shopping campaigns		
		driver.findElement(By.xpath(pr.getProperty("Shoppingcampaigns"))).click();Thread.sleep(2000);
		tab2=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab2.get(1));

		exp ="Smart Shopping campaigns - Google for Retail";act = driver.getTitle();System.out.println(act);
		
		if(exp.equalsIgnoreCase(act))
		{	System.out.println("Success");}
		else
		{System.out.println("Unsuccessful");}
		driver.close();driver.switchTo().window(tab2.get(0));
// GGoogle My Business		
		driver.findElement(By.xpath(pr.getProperty("GoogleMyBusiness"))).click();Thread.sleep(2000);
		tab2=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab2.get(1));

		exp ="Google My Business – Drive Customer Engagement on Google";act = driver.getTitle();System.out.println(act);
		
		if(exp.equalsIgnoreCase(act))
		{	System.out.println("Success");}
		else
		{System.out.println("Unsuccessful");}
		driver.close();driver.switchTo().window(tab2.get(0));
		
// Chrome	
		driver.findElement(By.xpath(pr.getProperty("Chrome"))).click();Thread.sleep(2000);
		tab2=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab2.get(1));

		exp ="Google Chrome Web Browser";act = driver.getTitle();System.out.println(act);
		
		if(exp.equalsIgnoreCase(act))
		{	System.out.println("Success");}
		else
		{System.out.println("Unsuccessful");}
		driver.close();driver.switchTo().window(tab2.get(0));
// Waze Local ads		
		driver.findElement(By.xpath(pr.getProperty("WazeLocalads"))).click();Thread.sleep(2000);
		tab2=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab2.get(1));

		exp ="Waze Ads - Get noticed by nearby drivers";act = driver.getTitle();System.out.println(act);
		
		if(exp.equalsIgnoreCase(act))
		{	System.out.println("Success");}
		else
		{System.out.println("Unsuccessful");}
		driver.close();driver.switchTo().window(tab2.get(0));
		return "RelatedProducts links Pass";
		
	}
	
	
	public String MoreSolution() throws InterruptedException
	{
// Business Solutions		
		driver.findElement(By.xpath(pr.getProperty("BusinessSolutions"))).click();Thread.sleep(2000);
		tab2=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab2.get(1));

		exp ="Google My Business – Drive Customer Engagement on Google";act = driver.getTitle();System.out.println(act);
		
		if(exp.equalsIgnoreCase(act))
		{	System.out.println("Success");}
		else
		{System.out.println("Unsuccessful");}
		driver.close();driver.switchTo().window(tab2.get(0));
// Google Workspace		
		driver.findElement(By.xpath(pr.getProperty("GoogleWorkspace"))).click();Thread.sleep(2000);
		tab2=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab2.get(1));

		exp ="Google Workspace | Business Apps & Collaboration Tools";act = driver.getTitle();System.out.println(act);
		
		if(exp.equalsIgnoreCase(act))
		{	System.out.println("Success");}
		else
		{System.out.println("Unsuccessful");}
		driver.close();driver.switchTo().window(tab2.get(0));
		
// AdSense		
		driver.findElement(By.xpath(pr.getProperty("AdSense"))).click();Thread.sleep(2000);
		tab2=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab2.get(1));

		exp ="Google AdSense - Earn Money From Website Monetization";act = driver.getTitle();System.out.println(act);
		
		if(exp.equalsIgnoreCase(act))
		{	System.out.println("Success");}
		else
		{System.out.println("Unsuccessful");}
		driver.close();driver.switchTo().window(tab2.get(0));
// AdMob		
		driver.findElement(By.xpath(pr.getProperty("AdMob"))).click();Thread.sleep(2000);
		tab2=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab2.get(1));

		exp ="Mobile App Monetization - Google AdMob";act = driver.getTitle();System.out.println(act);
		
		if(exp.equalsIgnoreCase(act))
		{	System.out.println("Success");}
		else
		{System.out.println("Unsuccessful");}
		driver.close();driver.switchTo().window(tab2.get(0));
		return "MoreSolution Links Pass";
	}
	
	public String HeaderLinks() throws InterruptedException
	{	
// How It Work		
		driver.findElement(By.xpath(pr.getProperty("HeadHowitworks"))).click();Thread.sleep(2000);
		
		exp ="How to Use Google Ads to Reach Your Goals | Google Ads";act = driver.getTitle();System.out.println(act);
		
		if(exp.equalsIgnoreCase(act))
		{	System.out.println("Success");}
		else
		{System.out.println("Unsuccessful");}
		
//Cost
		driver.findElement(By.xpath(pr.getProperty("HeadCost"))).click();Thread.sleep(2000);
		
		exp ="Set a Flexible Advertising Budget that Works | Google Ads";act = driver.getTitle();System.out.println(act);
		
		if(exp.equalsIgnoreCase(act))
		{	System.out.println("Success");}
		else
		{System.out.println("Unsuccessful");}
		
//FAQ		
		driver.findElement(By.xpath(pr.getProperty("FAQ"))).click();Thread.sleep(2000);
		
		exp ="FAQs & Advertising Resources | Google Ads";act = driver.getTitle();System.out.println(act);
		
		if(exp.equalsIgnoreCase(act))
		{	System.out.println("Success");}
		else
		{System.out.println("Unsuccessful");}

// Advance		
		driver.findElement(By.xpath(pr.getProperty("Advance"))).click();Thread.sleep(2000);
		
		exp ="Explore Advanced Advertising Strategies | Google Ads";act = driver.getTitle();System.out.println(act);
		
		if(exp.equalsIgnoreCase(act))
		{	System.out.println("Success");}
		else
		{System.out.println("Unsuccessful");}
		
//Contact		
		driver.findElement(By.xpath(pr.getProperty("Contact"))).click();Thread.sleep(2000);
		
		exp ="Contact Us for Help | Google Ads";act = driver.getTitle();System.out.println(act);
		
		if(exp.equalsIgnoreCase(act))
		{	System.out.println("Success");}
		else
		{System.out.println("Unsuccessful");}
// Case Studies		
		driver.findElement(By.xpath(pr.getProperty("CaseStudies"))).click();Thread.sleep(2000);
		
		exp ="Success Stories & Case Studies | Google Ads";act = driver.getTitle();System.out.println(act);
		
		if(exp.equalsIgnoreCase(act))
		{	System.out.println("Success");}
		else
		{System.out.println("Unsuccessful");}
// Basic of Online marketing
		driver.findElement(By.xpath(pr.getProperty("BasicofOnlineMarketing"))).click();Thread.sleep(2000);
		
		exp ="Tips & Resources for Online Advertising | Google Ads";act = driver.getTitle();System.out.println(act);
		
		if(exp.equalsIgnoreCase(act))
		{	System.out.println("Success");}
		else
		{System.out.println("Unsuccessful");}
// How Google Ads Works
		driver.findElement(By.xpath(pr.getProperty("HowGoogleAdsWorks"))).click();Thread.sleep(2000);
		
		exp ="How Google Ads Works | Google Ads";act = driver.getTitle();System.out.println(act);
		
		if(exp.equalsIgnoreCase(act))
		{	System.out.println("Success");}
		else
		{System.out.println("Unsuccessful");}
// Costs & Budget	
		driver.findElement(By.xpath(pr.getProperty("Costs&budget"))).click();Thread.sleep(2000);
		
		exp ="Costs & Budgets Management for Google Ads | Google Ads";act = driver.getTitle();System.out.println(act);
		
		if(exp.equalsIgnoreCase(act))
		{	System.out.println("Success");}
		else
		{System.out.println("Unsuccessful");}
//Overview		
		driver.findElement(By.xpath(pr.getProperty("HeadOverview"))).click();Thread.sleep(2000);
				
		exp ="Get More Customers With Easy Online Advertising | Google Ads";act = driver.getTitle();System.out.println(act);
				
		if(exp.equalsIgnoreCase(act))
		{	System.out.println("Success");}
		else
		{System.out.println("Unsuccessful");}
		return "Header Links Pass";
	}
	
	public String InternalLinks()
	{
// GetStarted		
		driver.findElement(By.xpath(pr.getProperty("InternalGetStarted"))).click();
		exp ="Google Ads – Sign in";act = driver.getTitle();System.out.println(act);
		
		if(exp.equalsIgnoreCase(act))
		{	System.out.println("Success");}
		else
		{System.out.println("Unsuccessful");}
		driver.navigate().back();
// Learn more about setting a budget		
		driver.findElement(By.xpath(pr.getProperty("LMASAB"))).click();
		exp ="Set a Flexible Advertising Budget that Works | Google Ads";act = driver.getTitle();System.out.println(act);
		
		if(exp.equalsIgnoreCase(act))
		{	System.out.println("Success");}
		else
		{System.out.println("Unsuccessful");}
		driver.navigate().back();
//Learn how Google Ads works		
		driver.findElement(By.xpath(pr.getProperty("LHGAW"))).click();
		exp ="How to Use Google Ads to Reach Your Goals | Google Ads";act = driver.getTitle();System.out.println(act);
		
		if(exp.equalsIgnoreCase(act))
		{	System.out.println("Success");}
		else
		{System.out.println("Unsuccessful");}
		driver.navigate().back();
//Read more case studies		
		driver.findElement(By.xpath(pr.getProperty("RMCS"))).click();
		exp ="Success Stories & Case Studies | Google Ads";act = driver.getTitle();System.out.println(act);
		
		if(exp.equalsIgnoreCase(act))
		{	System.out.println("Success");}
		else
		{System.out.println("Unsuccessful");}
		driver.navigate().back();	
		return "Internal Link Pass";
	}
	public String HeaderButton()
	{
// GetStarted Button		
		driver.findElement(By.xpath(pr.getProperty("GetStartedButton"))).click();
		exp ="Google Ads – Sign in";act = driver.getTitle();System.out.println(act);
		
		if(exp.equalsIgnoreCase(act))
		{	System.out.println("Success");}
		else
		{System.out.println("Unsuccessful");}
		driver.navigate().back();
// Sign In Button		
		driver.findElement(By.xpath(pr.getProperty("SignInButton"))).click();
		exp ="Google Ads – Sign in";act = driver.getTitle();System.out.println(act);
		
		if(exp.equalsIgnoreCase(act))
		{	System.out.println("Success");}
		else
		{System.out.println("Unsuccessful");}
		driver.navigate().back();
		return "Header Button Pass";
	}
	public String CloseBrowser()
	{
		driver.close();
		return "Browser Close";
	}

}
