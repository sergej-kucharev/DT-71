import java.io.FileWriter;
import java.io.IOException;

public abstract class Worker implements Comparable<Worker>
{
	private int id_num;
	private  String name;
	private  double salary;

	public Worker(int ID, String n, double s)
	{
		id_num=ID;
		name=n;
		salary=s;
		
	}
	 abstract double avgSalary();
	 public int get_ID() {return id_num;}
	 public double get_salary() {return salary;}
	 public String get_name() {return name;}
	 @Override
	    public int compareTo(Worker other){

	        if ((Math.abs(this.avgSalary() - other.avgSalary()) > 0) & (this.avgSalary() - other.avgSalary()) > 0)  return 1;
	        else if ((Math.abs(this.avgSalary() - other.avgSalary()) > 0) & (this.avgSalary() - other.avgSalary()) < 0) return -1;
	        else return this.name.compareTo(other.name);
	    }

	    public void outToFile(FileWriter fileWriter )throws IOException{
	        fileWriter.write("Worker" + "\n");
	        fileWriter.write("ID: " + id_num + "\n");
	        fileWriter.write("Name: " + name + "\n");
	        fileWriter.write("Month average salary: " + salary + "\n");
	    }
}
