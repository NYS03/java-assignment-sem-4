import java.util.*;
public class login {
        public static void main(String[] args) {
            int count;
            do {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the Username");
                String uname = sc.nextLine();
                System.out.println("Enter the Password");
                String upass = sc.nextLine();
                String realname = "ngjingkang";
                String realpass = "123456";
                count = 0;
                if (uname.equals(realname) && upass.equals(realpass)) { //realname and realpass are from database to link
                    System.out.println("Welcome " + uname + " you have Logged-in Successfully");
                } else {
                    System.out.println("Username or password Mismatch");
                    count++;
                }
            } while (count == 1);

        }
    }

