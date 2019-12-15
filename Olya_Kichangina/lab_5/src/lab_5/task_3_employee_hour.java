package lab_5;

public class task_3_employee_hour extends task_3_employee {
	
	 private double hourSalary;
	 
	 public task_3_employee_hour(long id, String name,double salary) {
	        super(id, name, salary);
	        hourSalary = salary;
	    }
	 
	 @Override
	    double calculationSalary(double salary) {
		 return 20.8 * 8 * salary;
	    }
	 


}
