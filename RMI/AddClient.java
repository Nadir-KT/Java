import java.rmi.server.*;  
public class AddClient extends UnicastRemoteObject implements AddInterface
{
	public AddClient()throws Exception
	{  
		super();  
	}  
	
	public int add(int x, int y)
	{
		return x+y;
	}
}