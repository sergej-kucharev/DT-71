import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TASK5 
{
	public static String sorting(String Wholeline) 
	{
		char t[]=Wholeline.toCharArray();
		ArrayList <String> line=new ArrayList <String>();
		for(int i=0; i<t.length; i++) 
		{
			String h=new String("");
			h+=t[i];
			line.add(h);
		}
		for(int i=0; i<line.size(); i++) 
		{
			for(int j=0; j<line.size()-i-1; j++) 
			{
				char a1=line.get(j).toLowerCase().charAt(0);
				char a2=line.get(j+1).toLowerCase().charAt(0);
				if(a1>a2) 
				{
					String aa=line.get(j);
					line.set(j, line.get(j+1));
					line.set(j+1, aa);
				}
			}	
		}
		
		String k="";
		for(int i=0; i<line.size();i++) 
		{
			k+=line.get(i);}
		
		return k;
		}
	
	public static void main(String args[]) 
	{
		try 
		{	System.out.print("Text in English:\n");
			BufferedReader br1=new BufferedReader(new FileReader("sample2.txt"));
			String line1;
			String Wholeline1 = "";
			while((line1=br1.readLine())!=null) 
			{Wholeline1+=line1;
			}
			System.out.print(Wholeline1+"\n");
			String l1=sorting(Wholeline1);
			System.out.print("Changed text:"+l1);
			System.out.print("\n\nText in Russian:\n");
			BufferedReader br2=new BufferedReader(new FileReader("sample1.txt"));
			String line2;
			String Wholeline2 = "";
			while((line2=br2.readLine())!=null) 
			{Wholeline2+=line2;
			}
			System.out.print(Wholeline2+"\n");
			String l2=sorting(Wholeline2);
			System.out.print("Changed text:"+l2);
			System.out.print("\n\nText in Ukrainian:\n");
			BufferedReader br3=new BufferedReader(new FileReader("sample3.txt"));
			String line3;
			String Wholeline3 = "";
			while((line3=br3.readLine())!=null) 
			{Wholeline3+=line3;
			}
			System.out.print(Wholeline3+"\n");
			String l3=sorting(Wholeline3);
			System.out.print("Changed text:"+l3);
			br1.close();br2.close(); br3.close();
		} 
		catch (IOException e) 
		{
			System.out.print("Error: "+e);
		}
	}
}
