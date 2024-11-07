import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Date;

public class Worker {

    private String name;

    private LocalDate birthDate;

    private LocalDate endDate;

    public int getAge(LocalDate birthDate){
        LocalDate currentDate = LocalDate.now();
        int age;
        age= Period.between(birthDate, currentDate).getYears();
        System.out.println("You are "+ age + " years old");
        return age;
    }

    public double collectPay(double pay){
        System.out.println("You collected " +pay+ " for salary");
        return pay;
    }

    public String terminate(String endDate){
        return endDate;
    }

    public Worker(){

    }

    public Worker(String name, LocalDate birthDate, LocalDate endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }


}
