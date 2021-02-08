package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	
	@Test(dataProvider="login")
	public void login(String name, String no)
	{
		
		System.out.println(name+""+no);
	}
	
	@DataProvider(name="login")
	public Object[][] getData()
	{
		Object[][] data= {{"Eswar","101"},{"John","102"}};
		return data;
		
	}
	

}
