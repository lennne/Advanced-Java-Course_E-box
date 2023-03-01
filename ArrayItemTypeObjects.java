import java.util.Scanner;

public class ArrayItemTypeObjects {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ItemTypeBO itemtypebo = new ItemTypeBO();
        ArrayItemType[] itemtypes = new ArrayItemType[10];
        System.out.println("Enter the Number of Item Type");
        int number = Integer.parseInt(s.nextLine());
        int count =0;
        for(int i=0;i < number; i++){

            count++;

            System.out.println("Enter the Item Type "+ count +" Name");
            String name = s.nextLine();

            System.out.println("Enter the Deposit Amount");
            double deposit = s.nextDouble();

            System.out.println("Enter the Cost per day");
            double costPerDay = s.nextDouble();
            s.nextLine();
            ArrayItemType itemtype = new ArrayItemType(name, deposit,costPerDay);
            itemtypebo.add(itemtype, itemtypes, count);

        }

        itemtypebo.display(itemtypes);
        System.out.println("Enter the Name of the item to be searched");
        String search = s.nextLine();
        itemtypebo.search(search, itemtypes);

    }
}


class ArrayItemType {
    //Your code here

    private String name;
    private double deposit;
    private double costPerDay;

    public ArrayItemType(){

    }

    public ArrayItemType(String name, double deposit, double costPerDay){
        this.name = name;
        this.deposit = deposit;
        this.costPerDay = costPerDay;
    }

    public void setName(String name){
        this.name= name;
    }

    public void setDeposit(double deposit){
        this.deposit = deposit;
    }

    public void setCostPerDay(double costPerDay){
        this.costPerDay = costPerDay;
    }

    public String getName(){
        return this.name;
    }

    public double getDeposit(){
        return this.deposit;
    }

    public double getCostPerDay(){
        return this.costPerDay;
    }

}

class ItemTypeBO {
    ArrayItemType[] itemtypes;

    public void add(ArrayItemType n1,ArrayItemType[] itemTypeArray,Integer index){
        //Your code here

        itemTypeArray[index] = n1;
        System.out.println("New item added successfully");
    }

    public ArrayItemType[] getItemType(){
        return this.itemtypes;
    }

    public void search(String search,ArrayItemType[] itemTypeArray){
        //Your code here
        boolean found = false;
        for(ArrayItemType itemtype : itemTypeArray){

            if(itemtype != null && itemtype.getName().equals(search)){
                System.out.println("Searched Item Type is:");
                System.out.println("Name:" + itemtype.getName());
                System.out.println("Deposit Amount:" + itemtype.getDeposit());
                System.out.println("Cost Per Day:" + itemtype.getCostPerDay());
                found = true;
            }
        }
        if(!found){
            System.out.println("Searched Item Type not found");

        }
    }
    public void display(ArrayItemType[] itemTypeArray){
        //Your code here
        int count = 1;
        for(ArrayItemType itemtype : itemTypeArray){

            if(itemtype != null){
                System.out.println("Item Type Number " + count + ":");
                System.out.println("Name:" + itemtype.getName());
                System.out.println("Deposit Amount:" + itemtype.getDeposit());
                System.out.println("Cost Per Day:" + itemtype.getCostPerDay());
                count = count + 1;
            }
        }
    }
}


