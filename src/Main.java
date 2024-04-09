
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Task1
        int year = 2021;
        if (countingYears(year)) {
            System.out.println(year + " год является високосным");
        } else System.out.println(year + " год не является високосным");
        // Task2
        examinationOs(1, 2024);
        examinationOs(0, 2019);
        //Task3
        System.out.println("Доставка займет " + countingDays(30) + " дней");
    }

    public static void examinationOs(int clientOs, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOs == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Ios по ссылке");
        } else if (clientOs == 0 && clientDeviceYear == currentYear) {
            System.out.println("становите версию приложения для iOS по ссылке");
        } else if (clientOs == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOs == 1 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static boolean countingYears(int year) {

        return (year >= 1584 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0));
    }

    public static int countingDays(int deliveryDistance) {
        if (deliveryDistance < 20) {
            return 1;
        } else if (deliveryDistance < 60) {
            return 2;
        } else if (deliveryDistance < 100) {
            return 3;
        } else System.out.println("Доставка не осуществляется");
        return -1;
    }
}