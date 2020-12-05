package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {

        return  new BufferedReader(new InputStreamReader(System.in)).readLine();

    }

    public static int readInt() throws Exception {
        return Integer.parseInt(ConsoleReader.readString());

    }

    public static double readDouble() throws Exception {

       return Double.parseDouble(ConsoleReader.readString());


    }

    public static boolean readBoolean() throws Exception {
       return Boolean.parseBoolean(ConsoleReader.readString());
    }

    public static void main(String[] args) {

    }
}
