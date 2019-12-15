import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
public class TASK2 
{	public static ArrayList<Integer> FindMax(ArrayList<Integer> Alpha, int max)

	{
		ArrayList<Integer> Elem=new ArrayList <Integer>();
		Iterator <Integer> z=Alpha.iterator();
		int cur_max=0;
		while(z.hasNext()==true) 
		{	int cur_elem=z.next();
			if(cur_max<cur_elem & cur_elem<max) cur_max=cur_elem;
		}
		Iterator <Integer> y=Alpha.iterator();
		while(y.hasNext()==true) 
		{
			int elem=y.next();
			if(elem==cur_max) Elem.add(elem);
		}
		return Elem;
	}
	public static void main(String args[])  
	{
		ArrayList <Integer> Alpha=new ArrayList<Integer>();
		Random r=new Random();
		for(int i=0; i<150; i++) 
		{
			Alpha.add(r.nextInt(200)+1);
		}
	
		ArrayList <Integer> Beta=new ArrayList<Integer>();
		while(Beta.size()<15) 
		{
			if(Beta.isEmpty()==true) 
			{
				ArrayList <Integer> Additional=FindMax(Alpha, 201);
				Iterator <Integer> e=Additional.iterator();
				while(e.hasNext()==true) 
				{
					Beta.add(e.next());
				}
				
			}
			else
			{
				
				ArrayList <Integer> Additional=FindMax(Alpha, Beta.get(Beta.size()-1));
				Iterator <Integer> e=Additional.iterator();
				while(e.hasNext()==true) 
				{
					Beta.add(e.next());
				}
			}
		}
		while(Beta.size()>15) 
		{
			Beta.remove(Beta.size()-1);
		}
		System.out.print("\nBETA:\n");
		for(int i=0; i<15; i++) 
		{
			System.out.print(Beta.get(i)+"\n");
		}
		
		
		try 
		{
			File f=new File("beta.txt");
			if(!f.exists()) 
			{
				f.createNewFile();
			}
			PrintWriter p=new PrintWriter(f);
			p.write("Beta:\n");
			for(int i=0; i<15; i++) 
			{
				p.write(Beta.get(i).toString()+"\n");
			}
			p.close();
		}
       catch(IOException e)
       {
    	   System.out.print("Error "+e);
       }
		
		
		
		
	}
}
