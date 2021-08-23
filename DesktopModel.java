package week3.day2;

public class DesktopModel implements HardWare, SoftWare {

	public void hardwareResources(String Processor, float RAM, String systemType) 
	{
		// TODO Auto-generated method stub
		System.out.println("Hardware Details: ");
		System.out.println("Processor : "+Processor);
		System.out.println("RAM : "+RAM);
		System.out.println("System Type : "+systemType);
		
	}

	public void softwareResources(String OS) 
	{
		// TODO Auto-generated method stub
		System.out.println("Software Details: ");
		System.out.println("OS : "+OS);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DesktopModel obj = new DesktopModel();
		obj.hardwareResources("Intel Core Processor", 8, "64-bit");
		obj.softwareResources("Windows");
	}

}
