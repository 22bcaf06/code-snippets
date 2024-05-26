import java.util.Scanner;
public class Str
{
	public static void main(String[] args) 
{
	String first,second;
	Scanner S=new Scanner(System.in);
	System.out.println("enter first string:");
	first=S.nextLine();
	System.out.println("enter second string:");
	second=S.nextLine();
	System.out.println("the strings are:"+first+" "+second);
	System.out.println("length of the first string is:"+first.length());
	System.out.println("concatenation of first and second is:"+first.concat(" "+second));
	System.out.println("first character of first string is:"+first.charAt(0));
	System.out.println("uppercase of first string is:"+first.toUpperCase());
	System.out.println("substring of first string is:"+first.substring(3,6));
	System.out.println("replace a with i in string one:"+first.replace('a','i'));
}
}
	