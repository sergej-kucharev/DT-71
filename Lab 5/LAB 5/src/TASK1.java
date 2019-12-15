import java.util.*;

public class TASK1 
{
	public static void FindElement(Collection <Integer> l, int element)
	{
		Iterator <Integer> k=l.iterator();
		long start_time=System.nanoTime();
		while(k.hasNext()==true) 
		{
			
			if(k.next()==element) 
			{
				long finish_time=System.nanoTime();
				long time=finish_time-start_time;
				System.out.print("Finding element number "+element+" took "+time+" nanoseconds\n");
				break;
			}
			
		}
	}
	
	public static void DeleteElement(Collection<Integer> l,int element) 
	{
		long start_time=System.nanoTime();
		l.remove(element);
		long finish_time=System.nanoTime();
		long time=finish_time-start_time;
		System.out.print("Deleting element number "+element+" took "+time+" nanoseconds\n");
	}
	
	public static void AddElement(Collection <Integer> l, int num) 
	{
		if(l.isEmpty()==true)
		{
			long start_time=System.nanoTime();
			for(int i=0; i<num; i++) 
			{
				l.add(i);
			}
			long finish_time=System.nanoTime();
			long time=finish_time-start_time;
			System.out.print("Adding "+num+" elements took "+time+" nanoseconds\n");
			FindElement(l,0);
			FindElement(l,num/2);
			FindElement(l, num-1);
			DeleteElement(l, 0);
			DeleteElement(l, num/2);
			DeleteElement(l, num);
		}
		else 
		{
			System.out.println("Something went wrong");
		}
	}
	public static void main(String args[]) 
	{
	
		ArrayList <Integer> A=new ArrayList <Integer>();
		System.out.println("\nData for ArrayList:");
		AddElement(A,1000);
		LinkedList <Integer> B=new LinkedList <Integer>();
		System.out.println("\nData for LinkedList:");
		AddElement(B,1000);
		HashSet <Integer> C=new HashSet <Integer>();
		System.out.println("\nData for HashSet:");
		AddElement(C,1000);
		TreeSet <Integer> D=new TreeSet <Integer>();
		System.out.println("\nData for TreeSet:");
		AddElement(D,1000);
		
	}	
	
}
