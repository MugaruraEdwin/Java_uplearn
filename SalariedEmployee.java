import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, LocalDate birthDate, LocalDate endDate) {
        super(name, birthDate, endDate);
    }

    public boolean retire(){
        return isRetired;
    }
}
