package com.example.demo.r;

import java.util.Random;

public class R3 {




    public static void main(String[] args) {
        Random random = new Random();


        // выполним код для 100000 повторов в цикле while
        for (int i = 0; i < 100000; i++) {


            // генерируем случайный месяц
            int month = random.nextInt(12) + 1;
            String monthName;

            // присваиваем название месяца в зависимости от его номера
            if (month == 1 || month == 2) {
                monthName = (month == 1 ) ? "Январь" : "Февраль";

            } else if (month == 3 || month == 4) {
                monthName = (month == 3) ?  "Март" : "Апрель";

            } else if (month == 5 || month == 6) {
                monthName = (month == 5 ) ? "Май" : "Июнь";

            } else if (month == 7 || month == 8) {
                monthName = (month == 7 ) ?  "Июль" : "Август";

            } else if (month ==9 || month == 10) {
                monthName = (month == 9 ) ?  "Сентябрь" : "Октябрь";

            } else  {
                monthName = (month == 11 ) ?  "Ноябрь" : "Декабрь";
            }

            // выводим название месяца
//                System.out.println(monthName);
        }



    }
}

