package basic;

import java.io.IOException;

public class ExecuteLibrary {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		Library obj=new Library(); 
		obj.OpenBrowser("https://ads.google.com");
//		obj.LearningAndsupport();
//		obj.RelatedProducts();
//		obj.DevelopersAndPartners();
//		obj.MoreSolution();
//		obj.AboutGoogleAds();
		obj.FollowUs();
		obj.CloseBrowser();
		
	}

}
