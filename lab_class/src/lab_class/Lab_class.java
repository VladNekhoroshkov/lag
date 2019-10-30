/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_class;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Lab_class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        BufferedReader reader;

        try (Scanner in = new Scanner(System.in)) {
            FileReader chitalka = new FileReader("H:\\java_orlov and kolyvanov\\lab_class\\source.txt");
            reader = new BufferedReader(chitalka);  
            
            System.out.println("Введите имя работника, затем его зп. Все через ентер ");
            
            //получение данных с руки
            String sruki_name = in.nextLine();
            int sruki_zp = in.nextInt();
            
            //получение данных с файла
            String file_name = reader.readLine();
            int file_zp = Integer.parseInt(reader.readLine());
            
                   
            Employee e1 = new Employee(17000, "Ivanov");
            
            Employee e2 = new Employee(sruki_zp, sruki_name);
            Employee e3 = new Employee(file_zp, file_name);
                    
            System.out.println("Имя первого работника - "+e1.getName());
            //вбиваем число рабочих дней первому
            e1.setDW(15);
            System.out.printf("Его пересчитанная ЗП = %.2f рублей \n", e1.calculateIncome());
            
            System.out.println("Второй работник: - "+e2);
            System.out.println("Третий работник: - "+e3);       
            
            //Коллекция рабочих
            ArrayList<Employee> workers_arr = new ArrayList<Employee>();
            
            workers_arr.add(e1);
            workers_arr.add(e2);
            workers_arr.add(e3);
            //compareTo
            Collections.sort(workers_arr);
            System.out.println("\nСортировка по имени: "+workers_arr);
            //Method compare из компаратора
            Collections.sort(workers_arr, new SalaryComparator());
            System.out.println("Сортировка по зарплате, по убыванию: "+workers_arr);
            
          }
        reader.close();
        } catch(IOException e){}
    }
    
    
}


