package com.example.demo.r;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneSolutionSend {

    public static void main(String[] args) throws IOException {

        try (BufferedReader reader = new BufferedReader(new FileReader("E:\\0\\input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\0\\output1.txt"))) {

            String s = reader.readLine();
            PhoneSolution phoneSolution = new PhoneSolution();
            List<String> list = phoneSolution.letterCombinations(s);

            System.out.println("Answer return: " + list);
            writer.write(String.valueOf(list));
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка чтения или записи файла: " + e.getMessage());
            // e.printStackTrace();
        }
    }


    public List<String> letterCombinations(String digits) {

        if (digits.length() == 0) {
            return new ArrayList<>();
        }

        int length = digits.length();

        Map<Integer, String[]> map = new HashMap<>();
        map.put(2, new String[]{"a", "b", "c"});
        map.put(3, new String[]{"d", "e", "f"});
        map.put(4, new String[]{"g", "h", "i"});
        map.put(5, new String[]{"j", "k", "l"});
        map.put(6, new String[]{"m", "n", "o"});
        map.put(7, new String[]{"p", "q", "r", "s"});
        map.put(8, new String[]{"t", "u", "v"});
        map.put(9, new String[]{"w", "x", "y", "z"});

        String[] split = digits.split("");

        if (length == 1) {
            return new ArrayList<>(Arrays.asList(map.get(Integer.parseInt(split[0]))));
        }

        int count = 0;
        String[] second = null;
        String[] third = null;
        String[] fourth = null;

        String[] first = map.get(Integer.parseInt(split[count++]));
        if (length > 1) second = map.get(Integer.parseInt(split[count++]));
        if (length > 2) third = map.get(Integer.parseInt(split[count++]));
        if (length > 3) fourth = map.get(Integer.parseInt(split[count]));

        String[] result2 = new String[first.length * second.length];
        count = 0;
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {
                result2[count++] = first[i] + second[j];
            }
        }

        if (length == 2) {
            return new ArrayList<>(Arrays.asList(result2));
        }

        String[] result3 = new String[result2.length * third.length];
        count = 0;
        for (int i = 0; i < result2.length; i++) {
            for (int j = 0; j < third.length; j++) {
                result3[count++] = result2[i] + third[j];
            }
        }

        if (length == 3) return new ArrayList<>(Arrays.asList(result3));

        count = 0;
        String[] result4 = new String[result3.length * fourth.length];

        for (int i = 0; i < result3.length; i++) {
            for (int j = 0; j < fourth.length; j++) {
                result4[count++] = result3[i] + fourth[j];
            }
        }
        return new ArrayList<>(Arrays.asList(result4));
    }
}

