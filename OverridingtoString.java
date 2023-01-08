package org.example;
import java.util.*;

class Address
{
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private int pincode;

    public Address(String addressLine1, String addressLine2, String city, String state, int pincode){
        this.addressLine1=addressLine1;
        this.addressLine2=addressLine2;
        this.city=city;
        this.state=state;
        this.pincode=pincode;
    }
    public String toString(){
        System.out.println(addressLine1);
        System.out.println(addressLine2);
        System.out.println(city);
        System.out.println(state);
        System.out.println(pincode);

        return city;
    }
}


public class OverridingtoString {
    public static void main(String[] args) {

        //Your code here
                Scanner s=new Scanner(System.in);
                System.out.println("Enter Address Line 1");
                String a1=s.nextLine();
                System.out.println("Enter Address Line 2");
                String a2=s.nextLine();
                System.out.println("Enter the City Name");
                String c=s.nextLine();
                System.out.println("Enter the State Name");
                String sn=s.nextLine();
                System.out.println("Enter the Pincode");
                int p=s.nextInt();

                Address obj=new Address(a1,a2,c,sn,p);
                System.out.println("The Address Details are");
                obj.toString();

        System.out.println("Hello world!");
    }
}