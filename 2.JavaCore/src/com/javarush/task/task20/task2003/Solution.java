package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception {
        //implement this method - реализуйте этот метод
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите имя файла для чтения");
        String filename1  = reader1.readLine();

        InputStream inputStream = new FileInputStream(filename1);

        reader1.close();

        load(inputStream);



    }

    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties props = new Properties();
        //PrintWriter printWriter = new PrintWriter(outputStream);
        for (Map.Entry<String, String> pair : properties.entrySet())
        {
            String key = pair.getKey();                      //ключ
            String value = pair.getValue();                  //значение
            //printWriter.println(key+"="+value);

            props.put(key,value);
          //  printWriter.println(value);
        }

        props.store(outputStream,"");


       // printWriter.close();

    }

    public void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод

       /* BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

        String str;
        String key;
        String value; */
       /* while ((key = reader.readLine()) != null) {
            value = reader.readLine();
            properties.put(key,value);
        }*/

       /* while ((str = reader.readLine()) != null) {
            key = str.
            value = reader.readLine();
            properties.put(key,value);
        }

        reader.close();  */

        Properties props = new Properties();
        props.load(inputStream);

        for (Map.Entry<Object, Object> pair : props.entrySet())
        {
            properties.put((String)pair.getKey(),(String)pair.getValue());
        }

    }

    public static void main(String[] args) {

    }
}
