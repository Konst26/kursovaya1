import java.sql.SQLOutput;

public class Main {
    private static Employee[] employees = new Employee[5];

    public static void main(String[] args) {
        employees[0] = new Employee(1, "Ivan", "Ivanovich", "Ivanov", 10000, "1");
        employees[1] = new Employee(2, "Petr", "Ivanovich", "Petrov", 11000, "2");
        employees[2] = new Employee(3, "Vasya", "Petrovich", "Vaskov", 12000, "3");
        employees[3] = new Employee(4, "Sasha", "Palich", "Ivanov", 13000, "4");
        employees[4] = new Employee(5, "Kolya", "Ivanovich", "Petrov", 14000, "5");

        printEmployees();
        System.out.println("=====");
        System.out.println(sumSalary());
        System.out.println("=====");
        System.out.println(findMinSalary());
        System.out.println("=====");
        System.out.println(findMaxSalary());
        System.out.println("=====");
        System.out.println(averageSalary());
        printFIO();
    }

    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int sumSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee findMinSalary() {
        Employee min = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;

    }

    public static Employee findMaxSalary() {
        Employee max = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > max.getSalary()) {
                max = employee;
            }
        }
        return max;
    }

    public static double averageSalary() {
        return (double) sumSalary() / employees.length;
    }

    public static void printFIO() {
        for (Employee employee : employees) {
            System.out.println(employee.getFirstName() + " " + employee.getLastName() + " " + employee.getSecondName());
        }
    }
}