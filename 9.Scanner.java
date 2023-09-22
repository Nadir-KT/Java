import java.util.Scanner;
class Scan
{
	public static void main(String[] args)
	{
		/*class Scanner
		{
			public void nextInt(){}
			public void nextFloat(){}
			public void nextByte(){}
			public void nextShort(){}
			public void nextLong(){}
			public void next().charAt(0);   
			public void nextDouble(){}
			public void nextBoolean(){}
			public void next(){}//String
			public void nextLine(){}//String
		}*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first no.");
		int a = scan.nextInt();
		System.out.println("Enter Second no.");
		int b = scan.nextInt();
		int c=a+b;
		System.out.println("Output="+c);//concatination//"java"+20=java20
		
	}
}