import java.io.*;
class Prime
{
 public static void main(String args[])
{
 int start,end;
 start=Integer.parseInt(args[0]);
 end=Integer.parseInt(args[1]);
 for(int i=start;i<end;i++)
 {
  int k=0;
  for(int j=2;j<i;j++)
  {
	if(i%j==0)
	 k++;
  }
	if(k==0)
	 System.out.println(i+" ");
	}
   }
}