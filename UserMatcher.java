import java.io.IOException;
import java.util.Scanner;

public class UserMatcher {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // fill the code here


        Scanner s = new Scanner(System.in);
        UMUser[] user = new UMUser[2];
        for (int i = 0; i < user.length; i++){
            int count = i+1;
            System.out.println("Enter the details of User " + count);
            System.out.println("Name :");
            String name = s.nextLine();
            System.out.println("Username :");
            String username = s.nextLine();

            System.out.println("Password :");
            String password = s.nextLine();
            System.out.println("Mobile Number :");
            long mobileNumber = Long.parseLong(s.nextLine());
            UMUser users = new UMUser(name,username,password,mobileNumber);
            user[i] = users;
        }


        if(user[0].equals(user[1])){
            System.out.println("User 1 and User 2 are equal");
        }else{
            System.out.println("User 1 and User 2 are not equal");
        }



    }


}
class UMUser {
    // fill the code here

    private String name;
    private String username;
    private long mobileNumber;

    private String password;

    public UMUser(){

    }

    public UMUser(String name, String username, String password, long mobileNumber){
        this.name = name;
        this.username = username;
        this.password = password;
        this.mobileNumber = mobileNumber;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public long getMobileNumber(){
        return this.mobileNumber;
    }

    public String getName(){
        return this.name;
    }

    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }

    public boolean equals(UMUser user2){

        if(this.getMobileNumber() == user2.getMobileNumber()){
            return true;
        }
        return false;
    }


}

