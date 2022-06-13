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
        System.out.println("Minimum amount is " + minimum + "$");//Минимальная ЗП
        int maximum = max(employees);
        System.out.println("Maximum amount is " + maximum + "$");//Максимальная ЗП
        int average = avg(employees);
        System.out.println("Average amount is " + average + "$");//Средняя
        int amount = amnt(employees);
        System.out.println("Amount is " + amount + "$" + "\n============");//Максимум
        names(employees);
        diff(employees);
        minDepartment(employees);

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

    public static int max(Employee[] employees) {//Максимальная ЗП среди всех сотрудников
        int max = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if ((max < employees[i].getSalary())) {
                max = employees[i].getSalary();
            }

        }
        return max;
    }

    public static int avg(Employee[] employees) {// средняя ЗП среди всех сотрудников
        int sum = amnt(employees);
        return sum / employees.length;
    }

    public static int amnt(Employee[] employees){//Сумма Зарпалт всех сотрудников за месяц
        int amnt = 0;
        for (int i = 0; i < employees.length; i++) {
           amnt = amnt + employees[i].getSalary();
        }return amnt;

    }

    public static void names(Employee[] employees) {//Вывод инфо про всех сотрудников
        System.out.println("All names of Employees are:");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getEmployeeSurname() + " " + employees[i].getEmployeeName() + ".");
        }
        System.out.println("==============");

    }

    public static void diff(Employee[] employees){//Индексация ЗП на 10%
        int diff;
        int increaseSalary = 10;
        for (int i = 0; i < employees.length; i++) {
        diff = employees[i].getSalary() / 100 * increaseSalary;
            System.out.println(employees[i].getEmployeeSurname() + " " + employees[i].getEmployeeName() + " " + "increase salary by: " + diff + "$");
        }

        }


        public static void minDepartment(Employee[] employees){
        int minDiff = employees[0].getSalary();
            for (int i = 0; i < employees.length; i++) {
                if (minDiff > employees[i].getSalary()){
                    minDiff = employees[i].getSalary();
                }
                if (minDiff == employees[i].getSalary()){
                    System.out.println("The minimum salary have:" + " " + employees[i].getEmployeeSurname() + " "
                            + employees[i].getEmployeeName() + " " + "It is - " + minDiff + " " +
                            "His department is " + " " + employees[i].getDepartment());
                }
            }
                }



}
