package com.lazyboy;

import java.io.*;

public class Main {

    static String path = "./folder/folderChild/childData.txt";

    public static void main(String[] args) {

        String target = readByBufferReader(path);
        String[] stringNumbers = target.split(",");
        int[] numbers = transformateToInt(stringNumbers);
        parityCheck(numbers);

    }

    public static String readByBufferReader(String path) {
        String currentLine;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            while ((currentLine = bufferedReader.readLine()) != null) {
                return currentLine;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        throw new RuntimeException();
    }

    public static int[] transformateToInt(String[] array) {
        int[] temp = new int[array.length];
        int counter = 0;
        for (String element : array)
            temp[counter++] = Integer.parseInt(element);
        return temp;
    }

    public static void parityCheck(int[] array) {
        int even = 0;
        int notEven = 0;

        for (int number : array) {
            if (number % 2 == 0) {
                even++;
            } else {
                notEven++;
            }
        }
        System.out.println(even + " Even" + "\n" + notEven + " Not even");
    }

}


