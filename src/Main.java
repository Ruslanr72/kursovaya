public class Main {
    public static void main(String[] args) {
        int[] Employee = new int[10];

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

        int amount = fifthPerson.getSalary() + secondPerson.getSalary() + thirdPerson.getSalary() + fourthPerson.getSalary() + fifthPerson.getSalary() + secondPerson.getSalary();
        System.out.println("Amount is " + amount);

        int[] arr = {firstPerson.getSalary(), secondPerson.getSalary(), thirdPerson.getSalary(), fourthPerson.getSalary(), fifthPerson.getSalary(), sixPerson.getSalary()};
        int max = arr[0];//максимальная ЗП
        int min = arr[0];// минимальная ЗП
        int avg = 0;//средняя ЗП

        for (int b = 0; b < arr.length; b++) {
            if (max < arr[b])
                max = arr[b];
            if (min > arr[b])
                min = arr[b];
            avg = avg + arr[b] / arr.length;
        }
        // выясняем ЗП min max avg
        float c = 0;
        for (float sumS : arr) {
            c += sumS;
        }
        System.out.println("Maximum amount is " + max);
        System.out.println("Minimum amount is " + min);
        System.out.println("Average amount is " + avg);
        System.out.println("\n");


        //Выводим ФИО всех сотрудников
        String allEmployers = firstPerson.getEmployeeSurname()+ " " + firstPerson.getEmployeeName() + ".\n"
                +secondPerson.getEmployeeSurname()+ " " + secondPerson.getEmployeeName()+ ".\n" +
                thirdPerson.getEmployeeSurname()+ " " + thirdPerson.getEmployeeName()+ ".\n" +
                fourthPerson.getEmployeeSurname()+ " " + fourthPerson.getEmployeeName()+ ".\n" +
                fifthPerson.getEmployeeSurname()+ " " + fifthPerson.getEmployeeName()+ ".\n" +
                sixPerson.getEmployeeSurname()+ " " +secondPerson.getEmployeeName()+ ".\n";
        System.out.println("All names of employee are:\n" + allEmployers);
    }
}
