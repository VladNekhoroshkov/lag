/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_exception;

import java.util.Scanner;

/**
 *
 * @author nekhoroshkov
 */
public class Lab_exception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);       
        int num_of_students;
        int num_of_subjects=0;
        
        String sruki;
        String[] Stroka;
        Shket[] spisok_shketov;
        
        System.out.println("Укажите количество вводимых студентов");
        num_of_students = in.nextInt();
        spisok_shketov = new Shket[num_of_students];
        
        
        //ввод данных о всех студентах
        for(int i=0;i<num_of_students;i++){
            System.out.println("Укажите имя, возраст, количество предметов у "+ (i+1) +" студента, через пробелы");
            //получение с руки всего, что вбито до ентера
            sruki = in.nextLine();
            //in Stroka: 0 - name, 1 - age, 2 - количество предметов
            Stroka = sruki.split(" ");

            //здесь БУДУТ проверки на вводимые данные методами класса Proverki.java

            num_of_subjects=Integer.parseInt(Stroka[2]); //интуем количество предметов
            spisok_shketov[i] = new Shket(Stroka[0], Integer.parseInt(Stroka[1])); //создаем школьника
            
            //вбиваем инфу о всех предметах
            for(int j=0;j<num_of_subjects;j++){
                System.out.println("Введите название и оценку за " +j+1+ " предмет, через пробел");
                sruki = in.nextLine();
                Stroka = sruki.split(" ");
                
                 //здесь БУДУТ проверки на вводимые данные методами класса Proverki.java
                
                //вбиваем данные о предмете студенту
                spisok_shketov[i].addRating(Stroka[0], Integer.parseInt(Stroka[1]));
            }
        }
        
        

        
        
        Shket SH1 = new Shket("Vanya", 18);
        System.out.println(SH1.getName());
        System.out.println(SH1.getAge());
        
        
    }
    
}
