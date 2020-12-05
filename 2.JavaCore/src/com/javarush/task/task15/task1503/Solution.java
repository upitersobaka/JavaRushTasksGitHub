package com.javarush.task.task15.task1503;

/* 
ООП - машинки
*/

public class Solution {
    public static void main(String[] args) {
        new Solution.LuxuriousCar().printlnDesire();
        new Solution.CheapCar().printlnDesire();
        new Solution.Ferrari().printlnDesire();
        new Solution.Lanos().printlnDesire();
    }

    public static class Ferrari extends LuxuriousCar {
        public void printlnDesire() {
            String str = new Constants().WANT_STRING + new Constants().FERRARI_NAME;
            System.out.println(str);//add your code here
        }
    }

    public static class Lanos extends CheapCar{
        public void printlnDesire() {
            String str = new Constants().WANT_STRING + new Constants().LANOS_NAME;
            System.out.println(str);
        }
    }

    public static class Constants {
        public static String WANT_STRING = "Я хочу ездить на ";
        public static String LUXURIOUS_CAR = "роскошной машине";
        public static String CHEAP_CAR = "дешевой машине";
        public static String FERRARI_NAME = "Феррари";
        public static String LANOS_NAME = "Ланосе";
    }

   public static class LuxuriousCar{
        void printlnDesire()
        {
           String str = new Constants().WANT_STRING + new Constants().LUXURIOUS_CAR;
           System.out.println(str);
       }
   }

    public static class CheapCar{
        protected void printlnDesire() {
            String str = new Constants().WANT_STRING + new Constants().CHEAP_CAR;
            System.out.println(str);
        }
    }

}
