import java.util.*;
import java.io.*;
public class Program{ 
    abstract class Base{
	String Name;
	void setName(String Nname){
		Name=Nname;
	}
	String getName(){
		return Name;
	}
	abstract double salary();
	abstract void print();
	abstract String to_string(); 
	};
    class Freelancer extends Base{
		double pochasovo;
		Freelancer(String Nname,double ppochasovo){
			Name=Nname;
			pochasovo=ppochasovo;
		}
		void setPochasovo(double ppochasovo){
			pochasovo=ppochasovo;
		}
		double getPochasovo(){
			return pochasovo;
		}
		double salary(){
			return (20.8 * 8 *pochasovo);
		}
		void print(){
			System.out.println("Freelancer"+" "+Name+" "+pochasovo);
		}
		String to_string(){
			return "Freelancer"+" "+Name+" "+pochasovo;
		}
	};
    class Monthly_paid extends Base{
	double monthly;
	Monthly_paid(String Nname, double mmonthly){
	    Name=Nname;
	    monthly=mmonthly;
	}
	void setMonthly(double mmonthly){monthly=mmonthly;}
	double getMonthly(){return monthly;}
	double salary(){return monthly;}
	void print(){
		System.out.println("Monthly-paid"+" "+Name+" "+monthly);
	}
	String to_string(){
		return "Monthly-paid"+" "+Name+" "+monthly;
	}
    };
    public static void main (String args[]) throws FileNotFoundException,IOException{
        Program program=new Program();
	program.start();
    }
    public void start() throws FileNotFoundException,IOException{
	File input=new File("input3.txt");
	FileReader fr=new FileReader(input);
	Scanner in = new Scanner(fr);
	ArrayList<Base> workers=new ArrayList<Base>();
	int count_rows=0;
	while(in.hasNextLine()){
		String temp=in.nextLine();
		int c_temp=0;
		String[] mas=temp.split("\\s");
		for(String s:mas) c_temp+=1;
		if(c_temp!=3) continue;
		if(mas[0].equals("Freelancer")){
			Freelancer f=new Freelancer(mas[1],Double.parseDouble(mas[2]));
			workers.add(f);
		}
		else if(mas[0].equals("Monthly-paid")){
			Monthly_paid m=new Monthly_paid(mas[1],Double.parseDouble(mas[2]));
			workers.add(m);
		}
		else{
			System.out.println("Something bad happened with this line: #"+count_rows+" "+temp);
			continue;
		}
		count_rows++;
	}
	fr.close();
	//Пункт А. Сначала сортируем по месячной зарплате, затем по имени.
	int i;
	int j;
	int len=workers.size();
	System.out.println(len);
	for(i=0;i<len-1;i++){
		for(j=0;j<len-1;j++){
			if(workers.get(j).salary()<workers.get(j+1).salary()){
				Collections.swap(workers,j,j+1);
			}
		}
	}
	for(i=0;i<len-1;i++){
		for(j=0;j<len-1;j++){
			if((workers.get(j).salary()==workers.get(j+1).salary())&&(workers.get(j).getName().compareToIgnoreCase(workers.get(j+1).getName())>0)) Collections.swap(workers,j,j+1);
		}
	}
	//Пункт Б. Выведем 5 имен самых дорогих сотрудникова
	for(Base s:workers) s.print();
	System.out.println("////////////////////////////////////////////////////////////////");
	for(i=0;i<5;i++) System.out.println(workers.get(i).getName());
	System.out.println("////////////////////////////////////////////////////////////////");
	//Пункт В. Выведем самых 3 дешевых сотрудника(три последних в списке)
	for(i=len-3;i<len;i++) System.out.println(workers.get(i).getName());
	//Пункт Г. Выведем коллекцию в файл output3.txt
	File output=new File("output3.txt");
	FileWriter fw=new FileWriter(output);
	for(Base s:workers) fw.write(s.to_string()+"\n");
	fw.close();
    }
}


