import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Benz vehicle = new Benz();
        Toyota car = new Toyota();
        SalariedEmployee employee = new SalariedEmployee();
        employee.getAge(LocalDate.of(2000,3,30));
        employee.collectPay(1000000.00);
        employee.retire(false);



        vehicle.goesFast("250km/hr");
        car.setSize("huge");
        car.goesFast("20km/hr");
    }
}
