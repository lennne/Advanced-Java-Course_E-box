package org.example;
import java.util.Arrays;
import java.util.*;

public class ArrayofObjects {
    public static void main(String[] args) throws Exception {





                //write your code here
                Scanner s = new Scanner(System.in);
                System.out.println("Enter the number of users:");
                int noUsers = s.nextInt();
                User[] userArray = new User[noUsers];
                UserBO userbo = new UserBO();
                s.nextLine();


                for(int i =0; i < userArray.length; i++){
                    int count = i + 1;
                    System.out.println("Enter the details of User " + count);
                    System.out.println("Enter the name of the user:");
                    String name = s.nextLine();
                    System.out.println("Enter the mobile number of the user:");
                    String mobileNo = s.nextLine();
                    System.out.println("Enter the username of the user:");
                    String username = s.nextLine();
                    System.out.println("Enter the password of the user:");
                    String password = s.nextLine();
                    User user = new User (name,mobileNo,username,password);
                    userbo.addUser(userArray, user);
                }


                System.out.println("User details as entered:");
                userbo.displayAll(userArray);
                System.out.println("After sorting:");
                userbo.sortUsers(userArray);
                userbo.displayAll(userArray);
                System.out.println("Enter the user to be deleted:");
                String delName = s.nextLine();

                if (userbo.deleteUser(userArray,delName) == true ){
                    System.out.println("User deleted successfully");
                    System.out.println("After Deleting:");
                    userbo.displayAll(userArray);
                } else {
                    System.out.println("No user found with given name");
                }




            }}



        class UserBO {
            User[] userArray;
            User userIns;
            public void addUser(User[] userArray,User userIns){
                //write your code here
                for(int i =0;i<userArray.length;i++){
                    if(userArray[i] == null){
                        userArray[i] = userIns;
                        return;
                    }
                }

            }

            public void sortUsers(User[] userArray){
                //write your code here
                Arrays.sort(userArray, (user1,user2) -> user1.getName().compareTo(user2.getName()));
            }

            public Boolean deleteUser(User[] userArray,String name){
                //write your code here
                for(int i=0; i<userArray.length;i++){
                    if(userArray[i] != null && userArray[i].getName().equals(name)){
                        userArray[i] = null;
                        return true;
                    }

                }
                return false;
            }

            public void displayAll(User[] userArray) {
                //write your code here
                System.out.println("User Details:");
                for(int i = 0; i < userArray.length; i++){
                    int count = i + 1;
                    if (userArray[i] != null){

                        System.out.println("User " + count);
                        System.out.println("Name:" + userArray[i].getName());
                        System.out.println("Mobile Number:" + userArray[i].getmobileNumber());
                    }
                }


            }


        }

        class User {
            //write your code here
            private String name;
            private String mobileNumber;
            private String username;
            private String password;

            public User(){

            }
            public User (String name,String mobileNumber, String username,String password){
                this.name = name;
                this.mobileNumber = mobileNumber;
                this.username = username;
                this.password = password;
            }

            public void setName(String name){
                this.name = name;
            }

            public void setmobileNumber(String mobileNumber){
                this.mobileNumber = mobileNumber;
            }


            public void setUsername(String Username){
                this.username = Username;
            }

            public void setPassword(String password){
                this.password = password;
            }


            public String getName(){
                return this.name;
            }

            public String getmobileNumber(){
                return this.mobileNumber;
            }

            public String getUsername(){
                return this.username;
            }

            public String getPassword(){
                return this.password;
            }
        }
