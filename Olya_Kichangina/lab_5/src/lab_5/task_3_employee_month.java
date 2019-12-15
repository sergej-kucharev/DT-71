package lab_5;

public class task_3_employee_month extends task_3_employee {
	
	 private double monthSalary;
	 
	 public task_3_employee_month(long id, String name,double salary) {
	        super(id, name, salary);
	        monthSalary = salary;
	    }
	 
	 @Override
	    double calculationSalary(double salary) {
	        return salary;
	    }
	 

}
