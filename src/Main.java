public class Main {
    public static void main(String[] args) {
        int[] Employees = new int[10];

        Employee firstPerson = new Employee("Muslimov", "Ruslan", 1, 200);

        Employee secondPerson = new Employee("Ivanov", "Elisey", 2, 230);

        Employee thirdPerson = new Employee("Salonenko", "Dmitry", 3, 100);

        Employee fourthPerson = new Employee("Voitehovich", "Fedor", 4, 450);

        Employee fifthPerson = new Employee("Kislev", "Anatoliy", 5, 320);

        Employee sixPerson = new Employee("Ignatov", "Mihail", 6, 550);

        System.out.println(firstPerson);
        System.out.println(secondPerson);
        System.out.println(thirdPerson);
        System.out.println(fourthPerson);
        System.out.println(fifthPerson);
        System.out.println(sixPerson);
        //расчет ЗП

        Employee[] Employee = {firstPerson, secondPerson, thirdPerson, fourthPerson, fifthPerson, sixPerson};
        int min = Employee[0].getSalary();
        int max = Employee[0].getSalary();
        int avg = 0;
        int summS = 0;
        for (int i = 0; i < Employee.length; i++) {
            if (min > Employee[i].getSalary()) {//Расчет минимальной ЗП
                min = Employee[i].getSalary();
            }
            if (max < Employee[i].getSalary()) {//Расчет максимальной ЗП
                max = Employee[i].getSalary();
            }
            summS = summS + Employee[i].getSalary();//сумма ЗП за месяц
            avg = avg + Employee[i].getSalary() / Employee.length;//Расчет средней ЗП
        }
            System.out.println("Amount is " + summS);
            System.out.println("Maximum amount is " + max);
            System.out.println("Minimum amount is " + min);
            System.out.println("Average amount is " + avg);

            //Выводим ФИО всех сотрудников
        System.out.println("All names of employers are:");
        for (int i = 0; i < Employee.length; i++) {
            System.out.println(Employee[i].getEmployeeSurname() + " " + Employee[i].getEmployeeName() + ".");

        }
    }
}