package com.lazyboy;

import java.io.*;
import java.util.Scanner;


public class Main {

    static String path = "./folder/folderChild/childData.txt";

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File(path);

        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbersString = line.split(",");
        int[] numbers = new int[11];
        int counter = 0;

        for (String number : numbersString) {
            numbers[counter++] = Integer.parseInt(number);
        }

        int even = 0;
        int notEven = 0;
        for (int qwe : numbers) {
            if (qwe % 2 == 0) {
                even++;
            } else {
                notEven++;
            }
        }
        System.out.println(even + "even");
        System.out.println(notEven + "Not even");
        scanner.close();

    }


}


