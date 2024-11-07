import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(){
        super("Magumba",LocalDate.of(1990,5,15), LocalDate.of(2023,6,22));
    }

    public SalariedEmployee(String name, LocalDate birthDate, LocalDate endDate) {
        super(name, birthDate, endDate);
    }

    @Override
    public int getAge(LocalDate birthDate) {
        return super.getAge(birthDate);
    }

    @Override
    public double collectPay(double pay) {
        return super.collectPay(pay);
    }

    public boolean retire(boolean isRetired){
        System.out.println("Employee is retired:" +isRetired );
        return isRetired;
    }
}
