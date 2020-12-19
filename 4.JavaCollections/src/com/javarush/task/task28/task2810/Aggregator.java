package com.javarush.task.task28.task2810;

import com.javarush.task.task28.task2810.model.*;
import com.javarush.task.task28.task2810.view.HtmlView;

import javax.lang.model.util.ElementScanner6;

public class Aggregator {

    public static void main(String[] args) {

        HtmlView view = new HtmlView();
        Provider provider = new Provider(new HHStrategy());
        Model model = new Model(view, new Provider(new HHStrategy()), new Provider(new MoikrugStrategy()));
        Controller controller = new Controller(model);
        view.setController(controller);
        view.userCitySelectEmulationMethod();

     //  Provider provider = new Provider(new HHStrategy());
      //  Controller controller = new Controller();
      //  controller.scan();

    }

    

}
