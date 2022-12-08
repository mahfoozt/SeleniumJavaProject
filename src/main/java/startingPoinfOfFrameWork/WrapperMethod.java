package startingPoinfOfFrameWork;

public interface WrapperMethod {
	
	public void launchBrowser(String url);
	public void enterById(String locatorValue, String data);
	public void enterByName(String locatorValue, String data);	
	public void enterByPartialLinkText(String locatorValue, String data);
	public void enterByXpath(String locatorValue, String data);
	public void enterByCssSelector(String locatorValue, String data);
	public void enterByClassName(String locatorValue);
	
	public void clickByName(String locatorValue);	
	public void clickByClassName(String locatorValue);
	public void clickByLinkText(String locatorValue);
	public void clickByXpath(String locatorValue);
	
	
	public void selectVisibleTextById(String Id, String Value);
	
	public void selectIndexByName(String Name, int Value);
	
	public void getTextById(String Id);
	
	public void closeBrowser();
	
	

}
