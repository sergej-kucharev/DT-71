package lab_5;

import java.text.Collator;
import java.util.*;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class task_3_main {

	public static void main(String[] args) throws IOException {
        ArrayList<task_3_employee_hour> employee_hour;
        employee_hour = getListFromFile("EmployeeHour.txt","Hour");
        ArrayList<task_3_employee_month> employee_month;
        employee_month = getListFromFile("EmployeeMonth.txt","Month");
        Collections.sort(employee_hour, Collections.reverseOrder());
        Collections.sort(employee_month, Collections.reverseOrder());
        System.out.println("The whole sorted list:\n");
        System.out.println("Employee month\n");
        for (int i=0; i<employee_month.size(); i=i+1) System.out.println("id: " + employee_month.get(i).getId()+ " "+ employee_month.get(i).getName()+ "  with salary " + employee_month.get(i).getSalary());
        System.out.println("\n");
        System.out.println("Employee hour\n");
        for (int i=0; i<employee_hour.size(); i=i+1) System.out.println("id: " + employee_hour.get(i).getId()+ " "+ employee_hour.get(i).getName()+ "  with salary " + employee_hour.get(i).getSalary());
        System.out.println("\n");
        System.out.println("First 5 names:\n");
        System.out.println("Employee month\n");
        for (int i=0; i<5; i=i+1) System.out.println(employee_month.get(i).getName()+ " "  + " with salary " + employee_month.get(i).getSalary());
        System.out.println("\n");
        System.out.println("Employee hour\n");
        for (int i=0; i<5; i=i+1) System.out.println(employee_hour.get(i).getName()+ " " + " with salary " + employee_hour.get(i).getSalary());
        System.out.println("\n");
        System.out.println("Last 3 ids:");
        System.out.println("Employee month\n");
        for (int i=employee_month.size()-1; i>=employee_month.size()-3; i=i-1) System.out.println("id: " + employee_month.get(i).getId()+ "  with salary " + employee_month.get(i).getSalary());
        System.out.println("\n");
        System.out.println("Employee hour\n");
        for (int i=employee_hour.size()-1; i>=employee_hour.size()-3; i=i-1) System.out.println("id: " + employee_hour.get(i).getId() + "  with salary " + employee_hour.get(i).getSalary());
    }

	public static ArrayList  getListFromFile(String file, String worker) throws IOException{
        File f = new File(file);
        Scanner sc = new Scanner(f);

        if (worker.equals("Hour")) {
            ArrayList<task_3_employee_hour> workers = new ArrayList<task_3_employee_hour>();
            while (sc.hasNextLine()) workers.add(get_employee_hour(sc));
            return workers;
        }
        else {
            ArrayList<task_3_employee_month> workers = new ArrayList<task_3_employee_month>();
            while (sc.hasNextLine()) workers.add(get_employee_month(sc));
            return workers;
        }
    }
  

		public static  task_3_employee_month get_employee_month(Scanner sc)
		{
        if (!sc.nextLine().equals("Employee")) throw new IllegalArgumentException("Wrong format of line");
        int id = Integer.parseInt(getNextLine(":","id",sc));
        String name = getNextLine(":","Name",sc);
        double salary = Double.parseDouble(getNextLine(":","Salary",sc));
        return new task_3_employee_month(id, name, salary);
    }
		
		
		
    public static  task_3_employee_hour get_employee_hour(Scanner sc)
    {
        if (!sc.nextLine().equals("Employee")) throw new IllegalArgumentException("Wrong format of line");
        int id = Integer.parseInt(getNextLine(":","id",sc));
        String name = getNextLine(":","Name",sc);
        double salary = Double.parseDouble(getNextLine(":","Salary",sc));
        return new task_3_employee_hour(id, name, salary);
    }
    
    
    public static String getNextLine(String separator, String word, Scanner sc){
        String[] nextLine = sc.nextLine().split(separator);
        if (!nextLine[0].equals(word)) throw new IllegalArgumentException("Wrong format of line"); 
        return nextLine[1].replaceAll("\\s+",""); 
    }
    
    public static void output_employee_hour_file(ArrayList<task_3_employee_hour> workers, String file) throws IOException{
        FileWriter fileWriter = new FileWriter(file);
        for (task_3_employee_hour worker: workers) worker.writeToFile(fileWriter);
        fileWriter.close();
    }

    public static void output_employee_month_file(ArrayList<task_3_employee_month> workers, String file) throws IOException{
        FileWriter fileWriter = new FileWriter(file);
        for (task_3_employee_month worker: workers) worker.writeToFile(fileWriter);
        fileWriter.close();
    }

}
