/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_class;

import java.util.Comparator;

/**
 *
 * @author nekhoroshkov
 */
public class Employee implements Comparable<Employee>{
    
        private int salary;
        private String name;
        private int days_worked;
        
        //конструктор по умолчанию
        public Employee(){
            salary = 0;
            name =" ";
            days_worked = 0;
        }       
        //конструктор копирования
        public Employee(Employee e){
            salary = e.salary;
            name = e.name;
            days_worked = e.days_worked;
        }
        //конструктор с параметрами
        public Employee(int salary, String name){
            this.salary = salary;
            this.name = name;
            this.days_worked = 0;
        }
        
        
        //переопределяем системный метод тустринг
        @Override
        public String toString(){           
            return name+ " "+ salary +", отработал "+ days_worked+ " дней";
        }
        //Для сортировки по имени
        @Override
        public int compareTo(Employee e) {return this.name.compareTo(e.getName());}
        
        //считает ЗП к выплате, на основании отработанных дней
        public double calculateIncome(){
            double income;
            income = this.days_worked/22.*this.salary;
            return income;
        }
        
        
        //изменение имени
        public void setName(String nm){
            this.name = nm;
        }     
        //Изменение ЗП
        public void setSalary(int zp){
            this.salary = zp;
        }
        //Изменение отработанных дней
        public void setDW(int dw){
            this.days_worked = dw;
        }       
        
        //получить имя сотрудника
        public String getName(){
            //возвращает копию имени, изменение которого не испортит оригинал
            return new String(this.name);
        }
        //получить ЗП сотрудника
        public int getSalary(){
            return this.salary;
        }
        //получить ЗП сотрудника
        public double getDW(){
            return this.days_worked;
        }
                
}


class SalaryComparator implements Comparator<Employee>{

    public int compare(Employee o1, Employee o2) 
    {
	return o2.getSalary() - o1.getSalary();
    }        
}
