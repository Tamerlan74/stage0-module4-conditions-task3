package school.mjc.stage0.conditions.task3;

import java.time.Month;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        if (month<1 || month>12 ){
            System.out.println("wrong number!");
        }

        System.out.println(Month.of(month).maxLength());
    }
}
