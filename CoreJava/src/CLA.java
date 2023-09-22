//Command Line Arguments
class CLA //java CLA 10 20 (or) java CLA "java" "python"// To pass the augments, Syntax: java class_name Arguments
{
	public static void main(String a[])//(String[] args) is for Command Line Arguments, Syntax: String[] args (or) String args[]
	{
		System.out.println(a[0]+20);//Concatenation//a[0] is defined as a string so addition will not happen
		System.out.println(a[1]);
	}
}