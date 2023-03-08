package src;

public class ProxyPatternClient {
	
	public static void main(String[] args) 
	{
		OfficeInternetAccess access = new ProxyInternetAccess("Tiago Rogério");
		
		access.grantInternetAccess();
	}


}
