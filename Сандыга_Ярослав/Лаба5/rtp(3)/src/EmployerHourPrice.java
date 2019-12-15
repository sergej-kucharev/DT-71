class EmployerHourPrice extends Employer {
    int stavka;

    public EmployerHourPrice(int var1, String var2, int var3) {
        super(var2, var1);
        this.stavka = var3;
    }

    public double monthSalary() {
        this.monthSalary = 166.4D * (double)this.stavka;
        return this.monthSalary;
    }
}
