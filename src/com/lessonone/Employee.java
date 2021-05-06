package com.lessonone;

public class Employee {
  private  int baseSalary;
  private int extraHours;
  private int hourlyRate;

    // constructor
    public  Employee (int baseSalary,int extraHours, int hourlyRate ){

        this.baseSalary = baseSalary;
        this.extraHours = extraHours;
        this.hourlyRate = hourlyRate;

    }

    // getters
    public int getBaseSalary(){
        return baseSalary;
    }

    public int getExtraHours(){
        return extraHours;
    }
    public int getHourlyRate (){
        return hourlyRate;
    }

    // setters

    public void setBaseSalary(int baseSalary){
        if(baseSalary <= 0){
            throw new IllegalArgumentException("Provided salary must be bigger than zero, please try again");
        } else {
            this.baseSalary = baseSalary;
        }
    }
public void setHourlyRate (int hourlyRate){
        if(hourlyRate <= 0){
            throw new IllegalArgumentException("hourly Rate must be more than zero");
        } else {
            this.hourlyRate = hourlyRate;
        }
    }
    // method
    public int calculateWage (){
        return getBaseSalary() + getExtraHours() * getHourlyRate();
    }
}


