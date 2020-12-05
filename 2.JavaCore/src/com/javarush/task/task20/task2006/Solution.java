package com.javarush.task.task20.task2006;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Как сериализовать?
*/
public class Solution {
    public static class Human implements Serializable {
        public String name;
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        public void save (FileOutputStream fileOutput) throws IOException {

            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutput);
            outputStream.writeObject(this);
            fileOutput.close();
            outputStream.close();

        }

        public Human load (FileInputStream fiStream) throws IOException, ClassNotFoundException {


            ObjectInputStream objectStream = new ObjectInputStream(fiStream);
            Object object = objectStream.readObject();
            fiStream.close();
            objectStream.close();

             return  (Human)object;
        }

    }

    public static void main(String[] args) {

    }
}
