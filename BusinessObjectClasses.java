package org.example;
import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;
import java.lang.*;
import java.time.temporal.ChronoUnit;


class ItemType {
    //write your code here
    private String name;
    private Double deposit;
    private Double costPerDay;

    public ItemType (String name, Double deposit, Double costPerDay){
        this.name=name;
        this.deposit=deposit;
        this.costPerDay=costPerDay;
    }

    public void setname(){
        this.name=name;
    }
    public void setdeposit(){
        this.deposit=deposit;
    }
    public void setcostPerday(){
        this.costPerDay=costPerDay;
    }

    public Double getcostPerDay(){
        return costPerDay;
    }

    public void display(){
        System.out.println("Item Name:" +name);
        System.out.println("Deposit Amount:" +deposit);
        System.out.println("Cost Per Day:" +costPerDay);
    }
}


class ItemTypeBO {

    public ItemTypeBO(){}


    public Double calculateCost (Date start,Date end, ItemType typeIns){
        //write your code here
        Double noOfDays =(double) ChronoUnit.DAYS.between(start.toInstant(), end.toInstant());
        return noOfDays * typeIns.getcostPerDay();
    }
}

public class BusinessObjectClasses {
    public static void main(String[] args) throws Exception {

                //your code here
                Scanner s=new Scanner(System.in);

                System.out.println("Enter the details of the item type");
                System.out.println("Name:");
                String n=s.nextLine();
                System.out.println("Deposit:");
                Double d=s.nextDouble();
                System.out.println("Cost per Day:");
                Double c=s.nextDouble();
                s.nextLine();
                System.out.println("Enter the starting date:");
                String sdate = s.nextLine();
                System.out.println("Enter the ending date:");
                String edate = s.nextLine();


                    Date start = new SimpleDateFormat("dd-MM-yyyy").parse(sdate);
                    Date end = new SimpleDateFormat("dd-MM-yyyy").parse(edate);

     /* Date start;
       Date end;
        try{
             start = myFormat.parse(sdate);
             end = myFormat.parse(edate);
        }catch (IOException e){
            e.printStackTrace();
        }

    */




                ItemType obj = new ItemType(n,d,c);
                ItemTypeBO bobj = new ItemTypeBO();
                Double totalCost = bobj.calculateCost( start, end, obj);
                System.out.println("The total cost is Rs." + totalCost);

            }


        }
