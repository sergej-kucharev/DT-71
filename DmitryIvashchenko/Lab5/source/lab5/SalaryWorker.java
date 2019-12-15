package lab5;

public class SalaryWorker extends Worker {
    double salary;

    SalaryWorker(){
        this.name = "John";
        this.salary = 0;
        this.id = 0;
    }

    SalaryWorker(int id, String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    SalaryWorker(SalaryWorker worker) {
        this.salary = worker.salary;
        this.name = worker.name;
        this.id = worker.id;
    }

    double getSalary(){
        return salary;
    }

    SalaryWorker setSalary(double salary){
        this.salary = salary;
        return this;
    }

    @Override
    double calculateSalary() {
        return this.salary;
    }

    @Override
    public String toFileString() {
        return String.format("s %d %s %f", this.id, this.name, this.salary);
    }
}
