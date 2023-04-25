public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15_000;
        int total = 0;
        int month = 0;
        while (total <= 2_459_000) {
            month = month + 1;
            total = total + salary;
            System.out.println(" Месяц " + month + ", сумма накоплений равна " + total + " Рублей ");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int start = 0;
        while (start < 10) {
            start = start + 1;
            System.out.print(start + " ");
        }
        System.out.println();
        int i = 11;
        for (; i > 1; ) {
            i = i - 1;
            System.out.print(i + " ");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int people = 12_000_000;
        int natalityPer1000 = 17;
        int dethPer1000 = 8;
        int year = 0;
        while (year < 10) {
            int populationPerYear = people / 1000 * (natalityPer1000 - dethPer1000);
            people = people + populationPerYear;
            year = year + 1;
            System.out.println(" Год " + year + ", численность населения составляет " + people);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        double i = 15_000;
        int month = 0;
        while (i <= 12_000_000) {
            month = month + 1;
            i = i + 15_000 * 0.07;
            System.out.println(" Месяц " + month + ", сумма накопления " + i);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        double i = 15_000;
        int month = 0;
        while (i <= 12_000_000) {
            month = month + 1;
            i = i + 15_000 * 0.07;
            if (month % 6 == 0)
                System.out.println(" Месяц " + month + ", сумма накопления " + i);
        }
    }
}
