package Guvi;
import java.util.*;
public class DistinctInteger {
		public static void main(String args[])
		{
		Scanner ss=new Scanner(System.in);
		int n=ss.nextInt();
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
		al.add(ss.nextInt(), null);
		}
		Collections.shuffle(al);
		System.out.println(al);
		}
}
