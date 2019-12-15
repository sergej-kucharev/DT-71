
public class WorkerWithHourlyWage extends Worker 
{	double hourlywage;
	WorkerWithHourlyWage(int ID, String n, double s )
	{
		super(ID, n, s);
		hourlywage=s;
		
	}

	@Override
	double avgSalary() {
		double s=20.8*8*this.hourlywage;
		return s;
	}

}
