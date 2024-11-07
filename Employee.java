import java.time.LocalDate;

public class Employee extends Worker {
    private Long employeeId;
    private String hireDate;

    public Employee(){

    }


    public Employee(String name, LocalDate birthDate, LocalDate endDate) {
        super(name, birthDate, endDate);
    }
}
