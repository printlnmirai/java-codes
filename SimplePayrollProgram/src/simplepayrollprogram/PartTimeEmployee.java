package simplepayrollprogram;

class PartTimeEmployee extends Employee {

    private double ratePerHour;
    private int hoursWorked;
    private double wage;

    public void setWage(double ratePerHour, int hoursWorked) {
        this.ratePerHour = ratePerHour;
        this.hoursWorked = hoursWorked;
    }

    public double getWage() {
        wage = ratePerHour * hoursWorked;
        return wage;
    }
}
