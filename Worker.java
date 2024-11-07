import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Date;

public class Worker {

    private String name;

    private LocalDate birthDate;

    private LocalDate endDate;

    public int getAge(){
        LocalDate currentDate = LocalDate.now();
        int age;
        age= Period.between(birthDate, currentDate).getYears();
        return age;
    }

    public double collectPay(){
        double pay = 1000000.00;
        return pay;
    }

    public String terminate(String endDate){
        return endDate;
    }

    public Worker(String name, LocalDate birthDate, LocalDate endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }


}
