package com.example.demo.coducation;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TCS {

    public static void main(String[] args) throws UnsupportedEncodingException {

        String s =  "йлезе";
        String s1 =  "джава";
        String f = "фнчут";

//        System.out.println(TCS.convert(s));
//        System.out.println(TCS.convert(s1));

//        System.out.println(TCS.shifr(s));

        String win1 = "РґР¶Р°РІР°";
        String win2 = "РїРёС‚РѕРЅ";
//        System.out.println(TCS.decode(win1) +  "  result 1  " + "\n"  + TCS.decode(win2)+ "   result2");
//        String code = "РҐРѕС‰СѓСЏ СЋСЉРЅР¶СѓР±, Рѕ С‘РѕС€СЊС‡С‰ СЋСЉРѕС‘СѓР±.";
//        String answer = "Хакер пляшет, а чайник плачет.";

        String code = "РҐРѕС‰СѓСЏ СЋСЉРЅР¶СѓР±, Рѕ С‘РѕС€СЊС‡С‰ СЋСЉРѕС‘СѓР±.";
        String answer = "Хакер";

        System.out.println(TCS.mem(code, answer));



    }

    private static String mem(String code, String answer){

        int forty8 = -48;
        int fortyMinus8 = -48;
        int fortyMinus7 = -47;
        byte fourTeen = 14;
        byte fifthTeen = 15;
        int max = 256;
        int oneOneTwo = 112;
        int count = 0;

        byte[] cp1251s = code.getBytes(Charset.forName("cp1251"));
        String utf8 = new String(cp1251s, Charset.forName("utf8"));
        System.out.println(Arrays.toString(utf8.getBytes()));
        byte[] bytes = utf8.getBytes();
        System.out.println(utf8);
        List<Byte> list = new ArrayList<>();
        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] == fortyMinus8) {
                if (i == 0){
                    byte letter =(byte) (bytes[i + 1] - bytes[i]) ;
                    list.add(letter);
                    i++;
                    System.out.println(letter+256);
                }else {
                    byte letter = (count % 2 == 0) ?  (byte) (bytes[i + 1] - bytes[i] - fourTeen) : (byte) (bytes[i + 1] - bytes[i] - fifthTeen);
                    list.add(letter);
                    count++;
                    i++;
                    System.out.println(letter+256);
                }
            } else if (bytes[i] == fortyMinus7) {
                if (i == 0){
                    byte letter =(byte) (bytes[i + 1] + oneOneTwo);
                    list.add(letter);
                    i++;
                    System.out.println(letter);
                }else {
                    byte letter = (count % 2 == 0) ? (byte) (bytes[i + 1] + oneOneTwo - fourTeen) : (byte) (bytes[i + 1] + oneOneTwo - fifthTeen);
                    list.add(letter);
                    count++;
                    i++;
                    System.out.println(letter);
                }

            }


        }

        byte[] result = new byte[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        String utf81 = new String(result, Charset.forName("cp1251"));
        System.out.println(count + " count");

        System.out.println(utf81);

        System.out.println(list);

        return null;
    }

    private static String tcs(String code, String answer) throws UnsupportedEncodingException {

        byte[] cp1251s = code.getBytes(Charset.forName("cp1251"));
        String utf8 = new String(cp1251s, "utf8");
        System.out.println(utf8);
        System.out.println(answer);
        byte[] answerByte = answer.getBytes(Charset.forName("cp1251"));
        String utfAnswer = new String(answerByte, "utf8");
        byte[] cp1251s1 = utf8.getBytes(Charset.forName(utf8, Charset.forName("cp1251")));
        byte[] answer1251 = answer.getBytes(Charset.forName(answer, Charset.forName("cp1251")));
        System.out.print((Arrays.toString(cp1251s1)) + "   Иерогрлифы!!!" + "\n");
        System.out.print((Arrays.toString(answer1251)) + "  answer надо получить");


        byte[] first = utf8.getBytes();
        byte[] hacker = answer.getBytes();
        byte[] f = new byte[first.length / 2];

        byte[] bytesA = answer.getBytes();
//        System.out.println();
        for (int i = 0; i < bytesA.length; i++) {
            if (bytesA[i] == -48){

            }
        }


        System.out.println();

//        System.out.println((Arrays.toString(utf8.getBytes())) + " Хощуя");
//        System.out.println((Arrays.toString(answer.getBytes())) + " Хакер");

        ;



        byte[] second = answer.getBytes();

//        System.out.println(Arrays.toString(first));
//        System.out.println(Arrays.toString(second));

        return " \n +  FINISH";
    }

    public static String convert(String s){

        byte[] cp1251s = s.getBytes(Charset.forName("cp1251"));
        byte[] utf = s.getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(cp1251s));
//        System.out.println(Arrays.toString(utf));
        String cp1251convert = new String(cp1251s, Charset.forName("utf-8"));
//        System.out.println(cp1251convert +" cp1251convert");
        System.out.println("--------------------------------");
        String convert1251 = new String(utf, Charset.forName("cp1251"));
        System.out.println(convert1251 +" convert1251");






        //


        return "";
    }

    public static String shifr(String s){

        String str = "";
        byte[] befor = s.getBytes(Charset.forName("cp1251"));
        for (int i = 0; i < befor.length; i++) {
            befor[i] -= 5;
            System.out.print(befor[i] + " ");

        }


        return new String(befor, Charset.forName("cp1251"));

    }
    public static String decode(String win) throws UnsupportedEncodingException {

        byte[] winBytes = win.getBytes(Charset.forName("cp1251"));
        String strByte = new String(winBytes, "utf8");

        return strByte;

    }

}
