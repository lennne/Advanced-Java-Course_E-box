import java.util.*;

public class UserCredentials {
    public static void main(String[] args) throws Exception {

                //fill code here

                String password;
                String username;

                UserBO usersbo = new UserBO();
                Scanner s = new Scanner(System.in);
                User user = new User();

                System.out.println("Username:");
                username = s.nextLine();
                System.out.println("Password:");
                try{
                    password = s.nextLine();
                }catch(Exception e){
                    password = " ";

                }



                if (usersbo.validate(username, password)){
                    System.out.println("Login Successfull");
                }else {
                    System.out.println("Incorrect username/password");
                }
            }

        }

        class UserBO {
            public User[] getUsers() {
                User[] users = new User[5];

                users[0] = new User(1, "Louis", "rxfsuzA2345");
                users[1] = new User(2, "Messie", "hpphmf1:");
                users[2] = new User(3, "Steve", "opefKt");
                users[3] = new User(4, "Kallis", "23456778");
                users[4] = new User(5, "Wipro", "A$%");

                return users;
            }

            private String encryptPassword(String value) {
                //fill the code
                StringBuilder encryptedPassword = new StringBuilder();

                for (char c : value.toCharArray()){
                    encryptedPassword.append((char) (c + 1));
                }
                return encryptedPassword.toString();
            }

            public boolean validate(String username, String password) {
                //fill the code
                String encryptedpassword = encryptPassword(password);
                for(User users : getUsers()){
                    if(users.getUsername().equals(username) && users.getPassword().equals(encryptedpassword))
                    {
                        return true;
                    }
                }

                return false;
            }
        }

        class User {
            //fill code here
            private int id;
            private String username;
            private String password;

            public User(){

            }

            public User(int id, String username, String password){
                this.id = id;
                this.username = username;
                this.password = password;
            }

            public void setId(int id){
                this.id = id;
            }

            public void setUsername(String username){
                this.username = username;
            }

            public void setPassword(String password){
                this.password = password;
            }

            public int getId(){
                return this.id;
            }

            public String getUsername(){
                return this.username;
            }

            public String getPassword(){
                return this.password;
            }
        }

