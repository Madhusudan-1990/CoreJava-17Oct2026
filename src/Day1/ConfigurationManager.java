package Day1;

public class ConfigurationManager 
{
	private static String browser = "chrome";
	private static String baseUrl = "https://google.com";
	private static int implicitWait = 10;
	
	public static  String  getBrowser()
	{
		return browser;
	}
	
	public static String getBaseUrl()
	{
		return baseUrl;
		
	}
	
	public static int getImplicitWait()
	{
		return implicitWait;
	}
	
	
}
