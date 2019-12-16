class EmployerFixedPrice extends Employer {
    public EmployerFixedPrice(int var1, String var2, double var3) {
        super(var2, var1);
        super.setSalary(var3);
    }

    public double monthSalary() {
        return this.monthSalary;
    }
}
