import java.util.*;
public class Gar
{
	public static void main(String[] args)
	throws Exception
{
	Runtime rs=Runtime.getRuntime();
	System.out.println("total memory is:"+rs.totalMemory());
	System.out.println("free memory is:"+rs.freeMemory());
	rs.gc();
	System.out.println("total memory after garbage collection is:"+rs.freeMemory());
}
}