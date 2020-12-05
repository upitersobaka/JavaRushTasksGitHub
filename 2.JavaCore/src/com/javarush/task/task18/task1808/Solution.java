package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(str);

        String str1 = reader.readLine();
        String str2 = reader.readLine();

        FileOutputStream fileOutputStream1 = new FileOutputStream(str1);
        FileOutputStream fileOutputStream2 = new FileOutputStream(str2);

        if (fileInputStream.available()> 0) {

            int count = fileInputStream.available();
            int ost = count % 2;
            if (ost == 0) {
                byte[]  bufer = new byte[count/2];
                int kol = fileInputStream.read(bufer);
                fileOutputStream1.write(bufer);

                kol = fileInputStream.read(bufer);
                fileOutputStream2.write(bufer);

            }
            else {

                int count1 = count / 2 +1;
                byte[]  bufer = new byte[count1];
                int kol = fileInputStream.read(bufer);
                fileOutputStream1.write(bufer);

                kol = fileInputStream.read(bufer);
                fileOutputStream2.write(bufer, 0 ,kol);
            }


        }

        fileInputStream.close();
        fileOutputStream1.close();
        fileOutputStream2.close();

    }
}
