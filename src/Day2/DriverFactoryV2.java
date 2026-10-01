package Day2;

public class DriverFactoryV2 
{
	private final String browserName;
	private final String baseUrl;
	private final int implicitWait;
	private final  boolean headless;
	
	public DriverFactoryV2(String browserName,String baseUrl,int implicitWait,boolean headless)
	{
		this.browserName = browserName;
		this.baseUrl = baseUrl;
		this.implicitWait = implicitWait;
		this.headless = headless;
	}
	
	public String getBrowser()
	{
		return browserName;
	}
	public String getBaseUrl()
	{
		return baseUrl;
		
	}
	public int getImplicitWait()
	{
		return implicitWait;
		
	}
	public boolean getHeadLess()
	{
		return headless;
	}
	
	public void displayConfiguration()
	{
		System.out.println("========================\n"
				+ browserName+" Configuration\n"
				+ "========================");
		
		System.out.println("Browser : "+getBrowser());
		System.out.println("Base URL : "+getBaseUrl());
		System.out.println("Implicit Wait : "+getImplicitWait());
		System.out.println("Headless : "+getHeadLess());
	}
	public static void main(String args[])
	{
		DriverFactoryV2 chromeConfig = new DriverFactoryV2("Chrome", "https://google.com", 10, false);
		chromeConfig.displayConfiguration();
		
		DriverFactoryV2 firefoxConfig = new DriverFactoryV2("FireFox", "https://google.com", 20, true);
		firefoxConfig.displayConfiguration();
	}

}
