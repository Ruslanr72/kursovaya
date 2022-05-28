public class Main {
    public static void main(String[] args) {
        int[] Employee = new int[10];


        Employee firstPerson = new Employee("Muslimov", "Ruslan", 0, 200);

        Employee secondPerson = new Employee("Ivanov", "Elisey", 1, 230);

        Employee thirdPerson = new Employee("Salonenko", "Dmitry", 2, 100);

        Employee fourthPerson = new Employee("Voitehovich", "Fedor", 3, 450);

        Employee fifthPerson = new Employee("Kislev", "Anatoliy", 4, 320);

        Employee sixPerson = new Employee("Ignatov", "Mihail", 5, 550);

        System.out.println(firstPerson);
        System.out.println(secondPerson);
        System.out.println(thirdPerson);
        System.out.println(fourthPerson);
        System.out.println(fifthPerson);
        System.out.println(sixPerson);
        //расчет ЗП



        int[] arr = new int[5];
        int amount = 0;
        for (int current : arr) {
            amount += current;
        }
        System.out.println("Amount: " + amount);//сумма зарплаты

        int[] array1 = new int[2];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 100_000 + 100_000);
        }

        int max = array1[0];//максимальная ЗП
        int min = array1[0];// минимальная ЗП
        int avg = 0;//средняя ЗП

        for (int b = 0; b < array1.length; b++) {
            if (max < array1[b])
                max = array1[b];
            if (min > array1[b])
                min = array1[b];
            avg = avg + array1[b] / array1.length;
        }
        // выясняем ЗП min max avg
        float c = 0;
        for (float sumS : array1) {
            c += sumS;
        }
        System.out.println("Maximum amount is " + max);
        System.out.println("Minimum amount is " + min);
        System.out.println("Average amount is " + avg);
        System.out.println("\n");
    }
}
