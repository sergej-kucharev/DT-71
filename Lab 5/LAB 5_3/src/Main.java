import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) throws IOException {
        ArrayList<WorkerWithHourlyWage> hourWorkers;
        hourWorkers = getListFromFile("WorkerWithHourlyWage.txt","WorkerForAnHour");
        Collections.sort(hourWorkers, Collections.reverseOrder());
        ArrayList<WorkerWithMonthlySalary> monthWorkers;
        monthWorkers = getListFromFile("WorkerWithMonthlySalary.txt","WorkerForAMonth");
        Collections.sort(monthWorkers, Collections.reverseOrder());
        System.out.println("First 5 names:");
        System.out.println("\nMonthWorkers\n");
        for (int i=0; i<5; i=i+1) System.out.println(monthWorkers.get(i).get_name()+ " "  + "  (" + monthWorkers.get(i).get_salary()+  ")");
        System.out.println("\nHourWorkers\n");
        for (int i=0; i<5; i=i+1) System.out.println(hourWorkers.get(i).get_name()+ " " + "  (" + hourWorkers.get(i).get_salary()+  ")");

        System.out.println("\n" + "Last 3 ids:");
        System.out.println("\nMonthWorkers");
        for (int i=monthWorkers.size()-1; i>=monthWorkers.size()-3; i=i-1) System.out.println("id: " + monthWorkers.get(i).get_ID());
        System.out.println("\nHourWorkers");
        for (int i=hourWorkers.size()-1; i>=hourWorkers.size()-3; i=i-1) System.out.println("id: " + hourWorkers.get(i).get_ID());
    }

	public static ArrayList   getListFromFile(String filename, String worker) throws IOException{
        File file = new File(filename);
        Scanner scan = new Scanner(file);

        if (worker.equals("WorkerForAnHour")) {
            ArrayList<WorkerWithHourlyWage> workers = new ArrayList<WorkerWithHourlyWage>();
            while (scan.hasNextLine()) workers.add(getHourlyWorker(scan));
            return workers;
        }
        else {
            ArrayList<WorkerWithMonthlySalary> workers = new ArrayList<WorkerWithMonthlySalary>();
            while (scan.hasNextLine()) workers.add(getMonthlyWorker(scan));
            return workers;
        }
    }
  

		public static  WorkerWithMonthlySalary getMonthlyWorker(Scanner scan)
		{
        if (!scan.nextLine().equals("Worker")) throw new IllegalArgumentException("Wrong format of line");
        int id = Integer.parseInt(getNextLine(":","ID",scan));
        String name = getNextLine(":","Name",scan);
        double salary = Double.parseDouble(getNextLine(":","Salary",scan));
        return new WorkerWithMonthlySalary(id, name, salary);
    }
		
		
		
    public static  WorkerWithHourlyWage getHourlyWorker(Scanner scan)
    {
        if (!scan.nextLine().equals("Worker")) throw new IllegalArgumentException("Wrong format of line");
        int id = Integer.parseInt(getNextLine(":","ID",scan));
        String name = getNextLine(":","Name",scan);
        double salary = Double.parseDouble(getNextLine(":","Salary",scan));
        return new WorkerWithHourlyWage(id, name, salary);
    }
    
    
    public static String getNextLine(String separator, String word, Scanner scan){
        String[] nextLine = scan.nextLine().split(separator);
        if (!nextLine[0].equals(word)) throw new IllegalArgumentException("Wrong format of line"); //check of the field
        return nextLine[1].replaceAll("\\s+",""); //return only the contents of the field
    }
    
    public static void writeWorkersForAnHourToFile(ArrayList<WorkerWithHourlyWage> workers, String filename) throws IOException{
        FileWriter fileWriter = new FileWriter(filename);
        for (WorkerWithHourlyWage worker: workers) worker.outToFile(fileWriter);
        fileWriter.close();
    }

    public static void writeWorkersForAMonthToFile(ArrayList<WorkerWithMonthlySalary> workers, String filename) throws IOException{
        FileWriter fileWriter = new FileWriter(filename);
        for (WorkerWithMonthlySalary worker: workers) worker.outToFile(fileWriter);
        fileWriter.close();
    }
    }