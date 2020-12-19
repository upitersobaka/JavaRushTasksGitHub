package com.javarush.task.task28.task2810;

import com.javarush.task.task28.task2810.model.Model;
import com.javarush.task.task28.task2810.model.Provider;
import com.javarush.task.task28.task2810.model.Strategy;
import com.javarush.task.task28.task2810.vo.Vacancy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controller {
  //  private Provider[] providers;
    private Model model;

 /*   public Controller(Provider... providers) {

        if (providers.length==0) throw new IllegalArgumentException();
        this.providers = providers;

    }  */


 /*   @Override
    public String toString() {
        return "Controller{" +
                "providers=" + Arrays.toString(providers) +
                '}';
    }  */

    public Controller(Model model) {
        if (model == null) throw new IllegalArgumentException();
        this.model = model;
    }

    public void onCitySelect(String cityName){
        model.selectCity(cityName);
    }

    public static void main(String[] args) {


    }

   /* public void scan() {
        List<Vacancy> totalVacList = new ArrayList<>();
        try{
            for (Provider provider : providers) {
                List<Vacancy> listVac = provider.getJavaVacancies("Moscow");
                totalVacList.addAll(listVac);
            }
            System.out.println(totalVacList.size());
        }
        catch (NullPointerException e){
            System.out.println("NPE");
        }
    } */
}
