//Command Line Arguments - 5.48
class CMD //java CMD 10 20 (or) java CMD "java" "python"// To pass the aguiments, Syntax: java class_name Arguments
{
	public static void main(String a[])//(String[] args) is for Command Line Arguments, Syntax: String[] args (or) String args[]
	{
		System.out.println(a[0]+20);//concatination//a[0] is defined as a string so addition will not happen
		System.out.println(a[1]);
	}
}