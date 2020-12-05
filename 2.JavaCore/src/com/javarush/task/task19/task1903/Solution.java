package com.javarush.task.task19.task1903;

/* 
Адаптация нескольких интерфейсов
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }



    public static void main(String[] args) {

    }

    public static class IncomeDataAdapter implements Contact,Customer {
        private IncomeData data;

        public IncomeDataAdapter(IncomeData data) {
            this.data = data;
        }

        @Override
        public String getCompanyName() {
            return this.data.getCompany();

        }

        @Override
        public String getCountryName() {
            String str = this.data.getCountryCode();
            return countries.get(str);
        }

        @Override
        public String getName() {
            return this.data.getContactLastName()+", "+this.data.getContactFirstName();
        }

        @Override
        public String getPhoneNumber() {
            String phone = Integer.toString(this.data.getPhoneNumber());
            while (phone.length()<10) {
                phone = "0"+phone;
            }
            String result = String.format("%+d(%s)%s-%s-%s",this.data.getCountryPhoneCode(),phone.substring(0,3),phone.substring(3,6),phone.substring(6,8),phone.substring(8,10));

            return  result;
        }
    }


    public static interface IncomeData {
        String getCountryCode();        //example UA

        String getCompany();            //example JavaRush Ltd.

        String getContactFirstName();   //example Ivan

        String getContactLastName();    //example Ivanov

        int getCountryPhoneCode();      //example 38

        int getPhoneNumber();           //example 501234567
    }

    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.

        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan

        String getPhoneNumber();        //example +38(050)123-45-67
    }
}