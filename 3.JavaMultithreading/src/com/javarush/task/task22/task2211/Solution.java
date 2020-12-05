package com.javarush.task.task22.task2211;

import java.io.*;
import java.nio.charset.Charset;

/* 
Смена кодировки
*/
public class Solution {
    public static void main(String[] args) throws IOException {


     /*   String           nameR       = args[0];
        String           nameW       = args[1];
        Charset          utf8        = Charset.forName ("UTF-8");
        Charset          windows1251 = Charset.forName ("Windows-1251");
        FileOutputStream fos         = new FileOutputStream (args[1]);
        BufferedReader reader      = new BufferedReader (new FileReader (new File(nameR)));
        BufferedWriter writer      = new BufferedWriter (new OutputStreamWriter (fos));
        while (reader.ready ( ))
        {
            String str = reader.readLine ( );
            byte[] buf = str.getBytes (windows1251);
            str = new String (buf, utf8);
            writer.write (str);
        }
        writer.close ( );
        reader.close ( );

        */

        InputStream input = new FileInputStream(args[0]);
        OutputStream output = new FileOutputStream(args[1]);

        Charset utf8 = Charset.forName("UTF-8");
        Charset windows1251 = Charset.forName("windows-1251");
//        byte[] buffer = new byte[input.available()];
//        while (input.available() > 0) {
//            input.read(buffer);
//            String s = new String(buffer, utf8);
//            buffer = s.getBytes(windows1251);
//            output.write(buffer);
//        }



        byte[] buffer = new byte[1];
        input.read(buffer);
        String s = new String(buffer, windows1251);
        buffer = s.getBytes(utf8);
        output.write(buffer);

        input.close();
        output.close();

    }
}
