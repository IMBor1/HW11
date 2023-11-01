import java.time.LocalDate;

public class Main {
    public static void checkLeap(int year) {
        if (year > 1584) {
            if (((year % 400 == 0) || (year % 4 == 0)) && (year % 100 != 0)) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        } else {

            System.out.println(year + " год не является високосным");

        }
    }

    public static void instalSofware(int a, int b) {


        if (b >= 2015) {
            if (a == 0) {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите обычную версию приложения для Android по ссылке");
            }
        } else if (a == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");

        }

    }

    public static int chekingDistance(int a) {

        int days = 1;
        if (a <= 20) {
            return days;
        } else if (a > 20 && a <= 60) {
            return days + 1;
        } else if (a > 60 && a <= 100) {
            return days + 2;
        } else {
            return 0;
        }
    }

    public static void task1() {
        System.out.println("Задание № 1");
        checkLeap(2021);
    }

    public static void task2() {
        System.out.println("Задание № 2");
        int clientOS = 1;
        int clientDeviceYear = LocalDate.now().getYear();
        instalSofware(clientOS, clientDeviceYear);
    }

    public static void task3() {
        System.out.println("Задание № 3");
        int deliveryDistance = 95;
        System.out.println("Потребуется дней: " + chekingDistance(deliveryDistance));
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();


    }
}