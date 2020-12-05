package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.ad.AdvertisementManager;
import com.javarush.task.task27.task2712.ad.NoVideoAvailableException;
import com.javarush.task.task27.task2712.kitchen.Order;
import com.javarush.task.task27.task2712.statistic.StatisticManager;
import com.javarush.task.task27.task2712.statistic.event.NoAvailableVideoEventDataRow;

import java.io.IOException;
import java.util.Observable;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Tablet extends Observable {
    //     это номер планшета
    final int number;
    static Logger logger = Logger.getLogger(Tablet.class.getName());

    public Tablet(int number) {
        this.number = number;
    }
    //  будет создавать заказ из тех блюд, которые выберет пользователь.
    public Order createOrder() {
        Order order = null;
        try {
            order = new Order(this);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Console is unavailable.");
        } finally {
            if (!order.isEmpty()) {
                setChanged();
                notifyObservers(order);
                AdvertisementManager advertisementManager = new AdvertisementManager(order.getTotalCookingTime() * 60);
                try {
                    advertisementManager.processVideos();
                } catch (NoVideoAvailableException e) {
                    StatisticManager.getInstance().register(new NoAvailableVideoEventDataRow(order.getTotalCookingTime() * 60));
                    logger.log(Level.INFO, "No video is available for the order " + order.toString());
                }
            }
        }
        return order;
    }


    @Override
    public String toString () {
        StringBuilder sb = new StringBuilder("Tablet{number=");
        sb.append(number + "}");
        return sb.toString();
    }
}
