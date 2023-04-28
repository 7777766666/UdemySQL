package com.example.demo.r;

import java.util.Random;

public class Rund {


    public static void main(String[] args) {
        Random random = new Random();

        // выполним код для 100000 повторов
        for (int i = 0; i < 100000; i++) {
            // генерируем случайный месяц
            int month = random.nextInt(12) + 1;

            String monthName = "";
            // выполняем код в зависимости от месяца
            switch (month) {
                case 1:
                    monthName = "Январь";
//                    System.out.println("Январь");
                    break;
                case 2:
                    monthName = "Февраль";
//                    System.out.println("Февраль");
                    break;
                case 3:
//                    System.out.println("Март");
                    monthName = "Март";
//                    System.out.println("Март");
                    break;
                case 4:
                    monthName = "Апрель";
//                    System.out.println("Апрель");
                    break;
                case 5:
                    monthName = "Май";
//                    System.out.println("Май");
                    break;
                case 6:
                    monthName = "Июнь";
//                    System.out.println("Июнь");
                    break;
                case 7:
                    monthName = "Июль";
//                    System.out.println("Июль");
                    break;
                case 8:
                    monthName = "Август";
//                    System.out.println("Август");
                    break;
                case 9:
                    monthName = "Сентябрь";
//                    System.out.println("Сентябрь");
                    break;
                case 10:
                    monthName = "Октябрь";
//                    System.out.println("Октябрь");
                    break;
                case 11:
                    monthName = "Ноябрь";
//                    System.out.println("Ноябрь");
                    break;
                case 12:
                    monthName = "Декабрь";
//                    System.out.println("Декабрь");
                    break;
            }
        }
    }
}

