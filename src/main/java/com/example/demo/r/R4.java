package com.example.demo.r;

import java.util.Random;

public class R4 {



    public static void main(String[] args) {


        Random random = new Random();


        // выполним код для 100000 повторов в цикле while
        for (int i = 0; i < 100000; i++) {


            // генерируем случайный месяц
            int month = random.nextInt(12) + 1;
            String monthName = "";

            // присваиваем название месяца в зависимости от его номера
            if (month == 1 || month == 2 || month == 3) {
                monthName = (month == 1 ) ? "Январь" : ( month == 2 ? "Февраль" : "Март");

            } else if (month == 4 || month == 5 || month == 6 ) {
                monthName = (month == 4) ? "Апрель" : ( month == 5 ? "Май" : "Июнь");

            } else if (month == 7 || month == 8 || month == 9) {
                monthName = (month == 7 ) ? "Июль" : ( month == 8 ? "Август" : "Сентябрь");

            } else  {
                monthName = (month == 10 ) ? "Октябрь" : ( month == 11 ? "Ноябрь" : "Декабрь");
            }

            // выводим название месяца
//                System.out.println(monthName);
        }



    }
}


