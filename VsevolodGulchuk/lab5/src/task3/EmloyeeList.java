package task3;

import task3.employees.AbstractEmplyee;
import task3.employees.SalaryEmployee;
import task3.employees.WageEmployee;
import task3.textio.MyParser;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;

public class EmloyeeList extends LinkedList<AbstractEmplyee> {
    public String firstNames(int amount){
        if (amount < 0)
        {
            return "Error: amount < 0";
        }

        String result = "First " + Math.min(amount, size()) + " names are:\n";

        for (int i = 0; i < amount; i++)
        {
            if(i>=size())
            {
                System.out.println("There are less then " + amount +
                        " employees in list, only " + size() + '.');
                break;
            }
            result += i + ". " + get(i).getName() + " ";
        }
        return result;
    }
    public String lastIds(int amount){
        if (amount < 0)
        {
            return "Error: amount = " + amount + " < 0";
        }
        String result = "Last " + Math.min(amount, size()) + " idintifiers are:\n";
        for (int i = size() - 1; i > size() - 1 - amount; i--)
        {
            if(i<0)
            {
                System.out.println("There are less then " + amount +
                    " employees in list, only " + size() + '.');
                break;
            }
            result += i + ". " + get(i).getIdentifier() + " ";
        }
        return result;
    }

    String toStringStandart(){
        String result = "List of Employees: \n";
        for (int i = 0; i < size(); i++)
        {
            result += i + ". \nName:" + get(i).getName() +
            "\nIdentifier: " + get(i).getIdentifier() +
            "\nMounthlySalary: " + get(i).getMounthlySalary() + "\n";
        }
        return result;
    }
    void writeToFile(File file){
        String outString = "";
        for(int i = 0; i<size(); i++)
        {
            outString += get(i) + "\n";
        }
        try {
            PrintWriter output = new PrintWriter(file);
            output.println(outString);
            output.close();
        }
        catch (IOException ex)
        {
            System.out.printf("ERROR: %s\n",  ex);
        }
    }
    void readFomFile(String fileName)
    {
        try {
            Scanner scan = new Scanner(new File(fileName));
            while(1==1)
            {
                add(scanEmployee(scan));
            }
        }
        catch (Exception ex){
            if(!ex.getLocalizedMessage().equals("Ends ok") &&
                    !ex.getLocalizedMessage().equals("No line found")) {
                System.out.printf("It is a bad data in file: Error is: %s", ex.getLocalizedMessage());
                clear();
            }
        }
    }
    AbstractEmplyee scanEmployee (Scanner scan) throws Exception
    {
        String type = scan.nextLine();
        if( !type.equals("WageEmployee") && !type.equals("SalaryEmployee"))
        {
            if(type.equals(""))
                throw new Exception("Ends ok");
            throw new Exception("bad data in file");
        }
        String name = MyParser.parceName(scan.nextLine());
        Double salary = MyParser.parceSalary(scan.nextLine());
        Integer id = MyParser.parceID(scan.nextLine());
        if(type.equals("WageEmployee"))
            return new WageEmployee(name, id, salary);
        return new SalaryEmployee(name, id, salary);
    }
}
