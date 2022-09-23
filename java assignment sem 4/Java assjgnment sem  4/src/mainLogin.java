import java.util.*;
public class mainLogin {
    public static void login(){
        int count;
        count = 0;
        int count1 = 0;
        login username = new login();
        login password = new login();
        username.setRealname("ngjingkang");
        password.setRealpass("123456");
        Scanner sc = new Scanner(System.in);
        do {
            String uname;
            String upass;
            do {
                System.out.println("Enter the Username");
                uname = sc.nextLine();
                if (uname.isEmpty()) {
                    System.out.println("Username is empty");
                    count++;
                } else if (!uname.isEmpty()) {
                    count = 0;

                }



            }while(count != 0);

            do {
                System.out.println("Enter the Password");
                upass = sc.nextLine();
                if (upass.isEmpty()) {
                    count++;
                    System.out.println("Password is empty");
                } else if (!upass.isEmpty()) {
                    count = 0;
                }


            }while(count != 0);


            if (uname.equals(username.getRealname()) && upass.equals(password.getRealpass())) { //realname and realpass are from database to link
                System.out.println("Welcome " + uname + " you have Logged-in Successfully");
                count1 = 0;
            }
            else {
                System.out.println("Username or password Mismatch");
                count1++;
            }
        } while (count1 != 0);


        System.out.println("Welcome user " + username.getRealname());
        //get time and date
        Date date = new Date();
        System.out.println("Date: " + date.toString());

    }
}
