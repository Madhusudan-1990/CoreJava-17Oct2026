package Day1;

public class DriverFactory {

	String browserName;
	String baseUrl;
	int implicitWait;
	boolean headlessMode;
	public DriverFactory(String browserName,String baseUrl,int implicitWait,boolean headlessMode)
	{
		this.browserName = browserName;
		this.baseUrl = baseUrl;
		this.implicitWait = implicitWait;
		this.headlessMode = headlessMode;
	}
	
	public void displayConfiguration()
	{
		System.out.println("=============================");
		System.out.println(browserName + " Configuration");
		System.out.println("=============================");
		
		System.out.println("Browser : " +browserName);
		System.out.println("Base URL : " +baseUrl);
		System.out.println("Implicit Wait : " +implicitWait);
		System.out.println("Headless : " +headlessMode);
		
	}
	public static void main(String[] args) 
	{
	
		DriverFactory chrome = new DriverFactory("Chrome", "https://google.com", 10, false);
		chrome.displayConfiguration();
		
		DriverFactory firefox = new DriverFactory("Firefox", "https://google.com", 10, false);
		firefox.displayConfiguration();
	}

}
