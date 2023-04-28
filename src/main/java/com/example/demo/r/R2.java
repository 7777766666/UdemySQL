package com.example.demo.r;

import java.util.Random;

public class R2 {



        public static void main(String[] args) {
            Random random = new Random();


            // выполним код для 100000 повторов в цикле while
            for (int i = 0; i < 100000; i++) {


                // генерируем случайный месяц
                int month = random.nextInt(12) + 1;
                String monthName;

                // присваиваем название месяца в зависимости от его номера
                if (month == 1) {
                    monthName = "Январь";
                } else if (month == 2) {
                    monthName = "Февраль";
                } else if (month == 3) {
                    monthName = "Март";
                } else if (month == 4) {
                    monthName = "Апрель";
                } else if (month == 5) {
                    monthName = "Май";
                } else if (month == 6) {
                    monthName = "Июнь";
                } else if (month == 7) {
                    monthName = "Июль";
                } else if (month == 8) {
                    monthName = "Август";
                } else if (month == 9) {
                    monthName = "Сентябрь";
                } else if (month == 10) {
                    monthName = "Октябрь";
                } else if (month == 11) {
                    monthName = "Ноябрь";
                } else {
                    monthName = "Декабрь";
                }

                // выводим название месяца
//                System.out.println(monthName);


            }
        }
    }

