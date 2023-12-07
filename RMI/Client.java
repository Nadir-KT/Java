import java.rmi.*;  
public class Client
{  
	public static void main(String args[])
	{
		try
		{
			AddInterface obj=(AddInterface)Naming.lookup("ADD"); 
			int n=obj.add(34,4);
			System.out.println(obj.add(34,4));  
			System.out.println("Addition="+n); 
		}
		catch(Exception e){}  
	}  
}  