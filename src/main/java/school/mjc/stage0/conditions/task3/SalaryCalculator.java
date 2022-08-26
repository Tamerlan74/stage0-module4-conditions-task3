package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double total = 0;
        if (salary < 0) {
            System.out.println("wrong input!");
        } else if (salary <= 10000) {
            total = (salary - salary * 0.15);
            System.out.println(total);
        } else if (salary <= 20000) {
            total = (salary - salary * 0.18);
            System.out.println(total);
        } else {
            total = (salary - salary * 0.2);
            System.out.println(total);
        }
    }
}
