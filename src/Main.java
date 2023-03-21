public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    private static void task5() {
        System.out.println("Задача 5");
        int months = 4;

        switch (months) {

            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("неверный месяц" + months);
        }
    }

    private static void task4() {
        System.out.println("Задача 4");
        int distanceLap = 95;

        int distanceDays = 2;

        if (distanceLap > 20){
            distanceDays ++;
        }
        if (distanceLap > 60){
            distanceDays++;
        }
        System.out.println("потребутся дней" + distanceDays);
    }

    private static void task3() {
        System.out.println("Задача 3");
        int Year = 2020;

        if (Year % 4 == 0 && Year % 100 !=0 || Year % 400 == 0){
            System.out.println(Year + " высокосный год");
        } else {
            System.out.println(Year + "не высокосный год");
        }
    }

    private static void task2() {
        System.out.println("Задача 2");
        int Number = 1;
        int YearOfIssure = 2016;


        if (Number == 1) {
            if (YearOfIssure < 2015) {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для IOS по ссылке ");
            }
        }
    }

    private static void task1() {
        System.out.println("Задача 1");
        int Number = 1;

        if (Number == 0) {
            System.out.println("Установите версию приложения для Abdroid по ссылке");
        } else {
            System.out.println("Установите версию приложения для IOS по ссылке");
        }
    }
}





