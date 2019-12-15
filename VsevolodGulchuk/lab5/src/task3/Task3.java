package task3;

import task3.employees.AbstractEmplyee;
import task3.employees.SalaryEmployee;
import task3.employees.WageEmployee;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Task3 {
    public static void task3(){
        System.out.println("TASK3");
        //file names(you can choose yours)
        String fileNameInput = "/Users/seva/IdeaProjects/GettingStarted/src/task3/files/task3Input.txt";
        String fileNameOutput = "/Users/seva/IdeaProjects/GettingStarted/src/task3/files/task3Sorted.txt";

        //creating specific type of list:
        EmloyeeList list = new EmloyeeList();

        //reading from file:
        list.readFomFile(fileNameInput);

        //sorting using redefined Comparator
        list.sort(new AbstractEmplyee.EployeesComparator());

        //outputing whole list
        list.writeToFile(new File(fileNameOutput));

        System.out.println(list.toStringStandart());
        //first 5 members
        System.out.println(list.firstNames(5));
        System.out.println(list.lastIds(3));
        System.out.println(list.toStringStandart());
        System.out.println("End of TASK3");
    }
}
