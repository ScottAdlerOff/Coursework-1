import java.util.ArrayList;
import java.util.List;

public class Main {
    private static Employee[] employees = {
            new Employee("Альберт Смит", 1, 32800),
            new Employee("Джон Андерсон", 2, 34100),
            new Employee("Хелен Фостер", 1, 31450),
            new Employee("Джанет Ливси", 2, 33740),
            new Employee("Майкл Клив", 3, 31450),
            new Employee("Харви Дей", 1, 30750),
            new Employee("Терренс Стейн", 3, 34050),
            new Employee("Миллена Ли", 1, 33700),
            new Employee("Стивен Китон", 2, 30150),
            new Employee("Марк Шерон", 2, 32750),
    };
    public static void main(String[] args) {
        System.out.println("Сумма затрат за месяц - " + calculateTotalSalary());
    }
    public static void listEmployees(){
        for (Employee employee : employees){
            System.out.println(employee);
        }
    }
    public static int calculateTotalSalary(){
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
        }
        public static Employee findEmployeeWithMinSalary(){
        Employee employeeWithMinSalary = employees[0];
        int minSalary = employeeWithMinSalary.getSalary();
            for (Employee employee : employees) {
               if (employee.getSalary() < employeeWithMinSalary.getSalary()){
                   employeeWithMinSalary = employee;
               }
            }
            return employeeWithMinSalary;
        }
    public static Employee findEmployeeWithMaxSalary(){
        Employee employeeWithMaxSalary = employees[0];
        int minSalary = employeeWithMaxSalary.getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > employeeWithMaxSalary.getSalary()){
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;
    }

    public static float calculateAverageSalary(){
        return calculateTotalSalary() / (float) employees.length;
    }

}
