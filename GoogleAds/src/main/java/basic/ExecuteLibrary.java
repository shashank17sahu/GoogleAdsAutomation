package basic;

import java.io.IOException;

public class ExecuteLibrary {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		Library obj=new Library(); 
		String ob =obj.OpenBrowser("https://ads.google.com");
		System.out.println(ob);System.out.println();
		
		String rp=obj.RelatedProducts();
		System.out.println(rp);System.out.println();
		
		String dap=obj.DevelopersAndPartners();
		System.out.println(dap);System.out.println();
		
		String las=obj.LearningAndsupport();
		System.out.println(las);System.out.println();
		
		String ms=obj.MoreSolution();
		System.out.println(ms);System.out.println();
		
		String aga=obj.AboutGoogleAds();
		System.out.println(aga);System.out.println();
		
		String HL=obj.HeaderLinks();
		System.out.println(HL);System.out.println();
		
		String IL =obj.InternalLinks();
		System.out.println(IL);
		
		String HB =obj.HeaderButton();
		System.out.println(HB);
		
		String cb=obj.CloseBrowser();
		System.out.println(cb);
		
	}

}
