
public class WorkerWithMonthlySalary extends Worker{

	public WorkerWithMonthlySalary(int ID, String n, double s) 
	{
		super(ID, n, s);
		
	}

	@Override
	double avgSalary() {
		double s=this.get_salary();
		return s;
	}
	
	
	

}
