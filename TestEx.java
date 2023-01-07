package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestEx {

	public static void main(String[] args) //throws Exception 
	{
		//FileInputStream fi=new FileInputStream("chetan.text"); // Compile time Exception
//		
//		int a=100;
//		int b=0;
//		System.out.println(a/b);   //  Rnntime Exception
//		
//		
//		String s=null;
//		System.out.println(s.length()); // runtTime Exception
		
		
		
		try 
		{
			int a=100;
			int b=0;
			System.out.println(a/b);
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
		   
		try 
		{
			String s=null;
			System.out.println(s.length()); // runtTime Exception
		} 
		catch (Exception e) 
		{
			System.err.println(e);
		}

		try 
		{
			FileInputStream fi=new FileInputStream("chetan.text"); // Compile time Exception
		} 
		catch (Exception e)
		{
			System.out.println(e);
		}
		
		
	}

}
