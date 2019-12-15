package lab_5;
import java.io.*;
import java.util.*;

public abstract class task_3_employee implements Comparable<task_3_employee>{
	private long id;
	private String name;
	private double salary;
	
	public task_3_employee() {
		name = "A";
		id = 1;
		salary = 1;
	}

	public task_3_employee(long _id, String _name, double _salary) {
		name = _name;
		id = _id;
		salary = _salary;
	}
	
	public String getName(){
        return name;
    }
	
    public long getId(){
        return id;
    }
    
    public double getSalary(){
        return salary;
    }
    
    public void setName(String _name){
        this.name = _name;
    }
    
    public void setId(long _id){
        this.id = _id;
    } 
    
    public void setSalary(double _salary){
        this.salary = _salary;
    }
    
    abstract double calculationSalary(double salary);
    
    @Override
    public int compareTo(task_3_employee other){

        if (Math.abs(this.salary - other.salary) > 0.00001) return this.salary > other.salary ?  1 : -1;
        else return this.name.compareTo(other.name);
    }
    
    public void writeToFile(FileWriter fileWriter )throws IOException{
        fileWriter.write("Employee");
        fileWriter.write("id: " + Long.toString(id) + "\n");
        fileWriter.write("Name: " + name + "\n");
        fileWriter.write("Аverage of salary: " + Double.toString(salary) + "\n");
    }

}