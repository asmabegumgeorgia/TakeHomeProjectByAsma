package Practical2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



public class PropFile {


	public static void main(String[]agrs) throws IOException {
		
	
	doesFileExits(null);	
		
		
	}
	
	
	public static void doesFileExits(String path) throws IOException {
		
		 
		path = ".\\src\\Practical2\\config.properties";
		

			Properties Prop = new Properties();
			FileInputStream fs = new FileInputStream(path);
		
			Prop.load(fs);
			System.out.println("Field1: "+"Email");			
			System.out.println("Value1: "+ Prop.getProperty("Email"));
			
			System.out.println("Field2: "+"password");	
			System.out.println("Value2: "+ Prop.getProperty("Password"));
			
			System.out.println("Field3: "+"course");	
			System.out.println("Value3: "+ Prop.getProperty("Course"));
			
			System.out.println("Field4:"+"Email");	
			System.out.println("Value4: "+ Prop.getProperty("Year"));
	}

}
