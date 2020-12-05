package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

//import com.sun.deploy.net.DownloadException;
//import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

import java.io.*;

public class Solution {

  //  public static boolean bol = true;

    public static void main(String[] args) throws DownloadException, IOException {

        boolean bol = true;


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (bol) {

            String str = reader.readLine();
            FileInputStream fileInputStream = new FileInputStream(str);

            if (fileInputStream.available()< 1000){
                fileInputStream.close();
                bol = false;

                fileInputStream.available();

            }
            else fileInputStream.close();



        }

    }

    public static class DownloadException extends Exception {

    }
}
