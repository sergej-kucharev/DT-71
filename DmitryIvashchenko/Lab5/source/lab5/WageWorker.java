package lab5;

public class WageWorker extends Worker{
    double wage;
    WageWorker(){
        this.name = "John";
        this.wage = 0;
        this.id = 0;
    }

    WageWorker(int id, String name, double wage) {
        this.name = name;
        this.wage = wage;
        this.id = id;
    }

    WageWorker(WageWorker worker) {
        this.wage = worker.wage;
        this.name = worker.name;
        this.id = worker.id;
    }

    double getWage(){
        return this.wage;
    }

    WageWorker setWage(double wage){
        this.wage = wage;
        return this;
    }

    @Override
    double calculateSalary() {
        return 20.8 * 8 * this.wage;
    }

    @Override
    public String toFileString() {
        return String.format("w %d %s %f", this.id, this.name, this.wage);
    }
}
