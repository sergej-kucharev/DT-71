abstract class Employer {
    int id;
    double monthSalary;
    String name;

    public abstract double monthSalary();

    public Employer(String var1, int var2) {
        this.name = var1;
        this.id = var2;
    }



    public String getName() {
        return this.name;
    }

    public void setSalary(double var1) {
        this.monthSalary = var1;
    }

    public int getId() {
        return this.id;
    }
    public double getSalary(){return this.monthSalary;}
    public String toString() {
        int var10000 = this.id;
        return "id=" + var10000 + ",name=" + this.name + ",month salary=" + this.monthSalary() + "\n";
    }
}
