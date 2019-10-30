/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_exception;

import java.util.Dictionary;
import java.util.Hashtable;

/**
 *
 * @author nekhoroshkov
 */
public class Shket {
    
    private String name;
    private int age;
    private Dictionary<String, Integer> rating = new Hashtable<String, Integer>();
    //private int[] rating;
    
    public Shket(){
        name="";
        age=-1;
        rating = null;
    }
    
    public Shket(String n, int a){
        this.name = n;
        this.age = a;
        rating = null;
    }
    
    //вбивает в рейтинг студенту новую связку предмет/оценка
    public void addRating(String subject, int score){
        rating.put(subject, score);
    }
    
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    
    
}
