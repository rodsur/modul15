/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opgaver;

import java.util.GregorianCalendar;

/**
 *
 * @author rodsur
 */
public class opgave1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ProductDatabase database = new ProductDatabase();
        
        try {
            FoodProduct hummersuppe = new FoodProduct(01, "hummersuppe", 20.0,new GregorianCalendar(2028,10,17).getTime(),2);
            database.addProduct(hummersuppe);
        } catch (ExpiredProductAddedException e) {
            System.out.println(e);
        }
        try {
            FoodProduct æble = new FoodProduct(02, "æble", 10.0, new GregorianCalendar(2018,10,17).getTime(),20);
            database.addProduct(æble);
        } catch (ExpiredProductAddedException e) {
            System.out.println(e);
        }
        try {
            FoodProduct hest = new FoodProduct(03, "hest", 30.0, new GregorianCalendar(2008,10,17).getTime(),37);
            database.addProduct(hest);
        } catch (ExpiredProductAddedException e) {
            System.out.println(e);
        }
        /*
        NonFoodProduct dæk = new NonFoodProduct(04, "dæk",10000.0,"Det pureste marmor");
        NonFoodProduct skrald = new NonFoodProduct(05, "bunke af skrald",10000.0,"Skrald");
        NonFoodProduct pizzabakker = new NonFoodProduct(06, "pizzabakker",10000.0,"Pap");

        database.addProduct(dæk);
        database.addProduct(skrald);
        database.addProduct(pizzabakker);
        */
        database.makeList();
        System.out.println("------");
        database.makeList();
        database.removeExpiredFoods();
        System.out.println("------");
        database.makeList();
        System.out.println(database.getSize());    
        
    }
    
}
