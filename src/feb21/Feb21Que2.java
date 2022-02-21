package feb21;
import java.time.*;

public class Feb21Que2 {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        LocalTime time=LocalTime.now();
        LocalDateTime dateTime=LocalDateTime.now();
        Month month = date.getMonth();
        int day = date.getDayOfMonth();
        Year y = Year.now();


        System.out.println("date is : "+date);
        System.out.println("time is : "+time);
        System.out.println("date and time is : "+dateTime);
        System.out.println("current month is : "+month);
        System.out.println("todays day is : "+ day);
        System.out.println("this year is : "+ y);


    }
}
/*
output is
date is : 2022-02-21
time is : 23:41:13.929
date and time is : 2022-02-21T23:41:13.929
current month is : FEBRUARY
todays day is : 21
this year is : 2022

Process finished with exit code 0

 */