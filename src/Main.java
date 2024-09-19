public class Main {
//
// Method of Ex1.
    public static void defineYear (int yearInMethod) {
        int year4 = yearInMethod % 4;
        int year100 = yearInMethod % 100;
        int year400 = yearInMethod % 400;
        if (yearInMethod > 1584 && year4 == 0 && year100 != 0 || yearInMethod > 1584 &&
                year400 == 0) {
            System.out.println(yearInMethod + " - год високосный.");
        } else if (yearInMethod > 1584 && year4 != 0 || yearInMethod > 1584 && year100 == 0) {
            System.out.println(yearInMethod + " - год не високосный.");
        } else {
            System.out.println("Параметр задан неверно. Введите год поле 1584.");
        }
    }
//
// Method of Ex2.
    public static void defineVersion (int clientOS, int deviceYear) {
        if (clientOS == 0 && deviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 0 && deviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientOS == 1 && deviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientOS == 1 && deviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android" +
                    " по ссылке.");
        } else {
            System.out.println("Параметры введены некорректно.");
        }
    }
//
// Method of Ex3.
    public static int day (int distance) { // Method of Ex3.
        int day = 0;
        if (distance <= 20) {
            day = 1;
        } else if (distance > 20 && distance <= 60) {
            day = 2;
        } else if (distance > 60 && distance <= 100) {
            day = 3;
        }
        return day;
    }
//
// Massages printing
    public static void printMassageOfDelivery(int days) {
        if (days <= 3 && days !=0) {
            System.out.println("Потребуется дней: " + days + ".");
        } else {
            System.out.println("Доставки нет.");
        }
    }
//
// Empty strings
    public static void addEmptyString () {
        System.out.println();
    }
//
// Exercises
    public static void main(String[] args) {
        System.out.println("Exercise 1.");
        int year = 1704;
        defineYear(year);
        addEmptyString();

        System.out.println("Exercise 2.");
        int clientOSEx2 = 1;
        int clientDeviceYear = 2014;
        defineVersion(clientOSEx2, clientDeviceYear);
        addEmptyString();

        System.out.println("Ex3.");
        int deliveryDistance = 50;
        int totalDays = day(deliveryDistance);
        printMassageOfDelivery(totalDays);
        addEmptyString();
    }
}