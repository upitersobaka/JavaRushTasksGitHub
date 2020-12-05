package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {


        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));

        //System.out.println("Введите имя файла для чтения");
        String filename1  = reader1.readLine();
        //FileReader freader = new FileReader(reader.readLine());

       // System.out.println("Введите имя файла для записи");
        String fileneme2  = reader1.readLine();

        reader1.close();

        BufferedReader reader = new BufferedReader(new FileReader(filename1));


        BufferedWriter fwriter = new BufferedWriter(new FileWriter(fileneme2));

         String str = "";

        boolean digit = false;
        boolean findSpace = false;
        int start = 0;

        while (reader.ready()) //пока есть непрочитанные байты в потоке ввода
        {
            int data = reader.read(); //читаем один символ (char будет расширен до int)
            char c = (char) data;
             start = start + 1;

            if  (Character.isDigit(c)  )  {

                if (start == 1) {
                    str = str + c;
                    digit = true;


                }
                else if (digit){
                    str = str + c;


                }


            }
            else   if (Character.isSpaceChar(c)){

                if (digit){
                    //digit = false;
                    str = str + " ";
                    fwriter.write(str);
                }
                digit = true;
                str = "";
                //findSpace = true;

            } else {
                digit = false;
            }



        }


        if (digit){
            fwriter.write(str);
        }

        //закрываем потоки после использования
        reader.close();

        //BufferedWriter fwriter = new BufferedWriter(new FileWriter(fileneme2));
        //fwriter.write(str);

        fwriter.close();
    }
}
