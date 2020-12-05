package com.javarush.task.task27.task2712;


import com.javarush.task.task27.task2712.statistic.StatisticManager;

import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Locale;
import java.util.Map;

public class DirectorTablet {
    private StatisticManager statisticManager = StatisticManager.getInstance();

    public void printAdvertisementProfit() { //1. какую сумму заработали на рекламе, сгруппировать по дням;
//3. Начнем с логики метода printAdvertisementProfit в классе DirectorTablet.
//Используя метод из предыдущего пункта вывести в консоль в убывающем порядке даты и суммы.
//Для каждой даты из хранилища событий, для которой есть показанная реклама, должна выводится сумма прибыли за показы рекламы для этой даты.
//В конце вывести слово Total и общую сумму.
//
//Пример:
//14-May-2013 - 2.50
//13-May-2013 - 1.02
//12-May-2013 - 543.98
//Total - 547.50
        Map<Date, Double> advertisementProfit = StatisticManager.getInstance().amountPerDay();
        double totalAmount = 0;
        double amount;
        for (Map.Entry<Date, Double> entry : advertisementProfit.entrySet()) {
            amount = entry.getValue();
            ConsoleHelper.writeMessage(String.format(Locale.ENGLISH,"%1$te-%1$tb-%1$tY - %2$.2f", entry.getKey(), amount));
            totalAmount += amount;
        }
        ConsoleHelper.writeMessage(String.format(Locale.ENGLISH,"Total - %.2f", totalAmount));
    }


    //    public void printCookWorkloading() {//2. загрузка (рабочее время) повара, сгруппировать по дням;
//        Map<Date, Map<String, Integer>> map = statisticManager.cookLoading();
//        //Для каждой даты из хранилища событий, для которой есть запись о работе повара, должна выводится продолжительность работы в минутах для этой даты.
//        //Если повар не работал в какой-то из дней, то с пустыми данными его НЕ выводить (см. 13-May-2013)
//        //Поваров сортировать по имени
//        //
//        //Пример:
//        //14-May-2013
//        //Ivanov - 60 min
//        //Petrov - 35 min
//        //
//        //13-May-2013
//        //Ivanov - 129 min
//        //
//        //12-May-2013
//        //Ivanov - 6 min
//        //Petrov - 5 min
//        for (Map.Entry entry : map.entrySet()
//        ) {
//            SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
//            String date = sdf.format(entry.getKey());
//            ConsoleHelper.writeMessage(date);
//            Map<String, Integer> map1 = (Map) entry.getValue();
//            for (Map.Entry<String, Integer> entry1 : map1.entrySet()
//            ) {
//                ConsoleHelper.writeMessage(entry1.getKey() + " - " + entry1.getValue() + " min");
//            }
//        }
//    }
    public void printCookWorkloading() {
        Map<Date, Map<String, Integer>> map = statisticManager.cookLoading();
        for (Map.Entry entry : map.entrySet()) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy",Locale.ENGLISH);
            String date = simpleDateFormat.format(entry.getKey());
            ConsoleHelper.writeMessage(date);
            Map<String, Integer> map1 = (Map) entry.getValue();

            for (Map.Entry entry1 : map1.entrySet()) {
                ConsoleHelper.writeMessage(entry1.getKey() + " - " + entry1.getValue() + " min");
            }
        }
    }


    public void printActiveVideoSet () { //3. список активных роликов и оставшееся количество показов по каждому;

    }

    public void printArchivedVideoSet ()
    {//4. список неактивных роликов (с оставшемся количеством показов равным нулю).

    }


}