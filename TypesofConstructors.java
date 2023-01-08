import java.util.*;

class StallCategory
{
    private String name;
    private String detail;


    public StallCategory(){

    }

    public StallCategory(String name,String detail){
        this.name=name;
        this.detail=detail;
        System.out.println("Using Default Constructor");
        System.out.println("Details of the stall category:");
        System.out.println("Name:"+name);
        System.out.println("Detail:"+detail);
    }


    void display(){
        System.out.println("Using Parameterised Constructor");
        System.out.println("Details of the stall category:");
        System.out.println("Name:"+name);
        System.out.println("Detail:"+detail);

    }

}

public class TypesofConstructors {
    public static void TypesofConstructors(String args[]) throws Exception{
        //write your code here
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the name of the stall category:");
        String b=s.nextLine();
        System.out.println("Enter the details of the stall category:");
        String d=s.nextLine();

        StallCategory obj=new StallCategory(b,d);
        obj.display();


    }
}
