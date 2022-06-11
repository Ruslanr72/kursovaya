public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Muslimov", "Ruslan", 1, 200),

                new Employee("Ivanov", "Elisey", 2, 230),

                new Employee("Salonenko", "Dmitry", 3, 100),

                new Employee("Voitehovich", "Fedor", 4, 450),

                new Employee("Kislev", "Anatoliy", 5, 320),

                new Employee("Ignatov", "Mihail", 6, 550),
        };
        System.out.println(employees[0]);
        System.out.println(employees[1]);
        System.out.println(employees[2]);
        System.out.println(employees[3]);
        System.out.println(employees[4]);
        System.out.println(employees[5]);

        int minimum = min(employees);
        System.out.println("Minimum amount is " + minimum);//Минимальная ЗП
        int maximum = max(employees);
        System.out.println("Maximum amount is " + maximum);//Максимальная ЗП
        int average = avg(employees);
        System.out.println("Average amount is " + average);//Средняя
        int amount = amnt(employees);
        System.out.println("Amount is " + amount);//Максимум
        int allNames = names(employees);
    }//расчет ЗП

    public static int min(Employee[] employees) {
        int min = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (min > employees[i].getSalary()) {
                min = employees[i].getSalary();
            }
        }
        return min;
    }

    public static int max(Employee[] employees) {
        int max = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if ((max < employees[i].getSalary())) {
                max = employees[i].getSalary();
            }

        }
        return max;
    }

    public static int avg(Employee[] employees) {
        int avg = 0;
        for (int i = 0; i < employees.length; i++) {
            avg = avg + employees[i].getSalary() / employees.length;
        }
        return avg;
    }

    public static int amnt(Employee[] employees){
        int amnt = 0;
        for (int i = 0; i < employees.length; i++) {
           amnt = amnt + employees[i].getSalary();
        }return amnt;

    }

    public static int names(Employee[] employees){   //Выводим ФИО всех сотрудников
        int names = 0;
        System.out.println("All names of Employees are:");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getEmployeeSurname() + " " + employees[i].getEmployeeName() + ".");
        }return names;
    }




}
