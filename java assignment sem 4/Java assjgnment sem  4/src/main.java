import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Scanner;

public class main {

    private JButton homeButton;


        public main() {
            homeButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                }
            });
        }

    public static void main(String[] args) {
        int count;
        login username = new login();
        login password = new login();
        username.setRealname("ngjingkang");
        password.setRealpass("123456");
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Username");
            String uname = sc.nextLine();
            System.out.println("Enter the Password");
            String upass = sc.nextLine();




            count = 0;
            if (uname.equals(username.getRealname()) && upass.equals(password.getRealpass())) { //realname and realpass are from database to link
                System.out.println("Welcome " + uname + " you have Logged-in Successfully");
            } else {
                System.out.println("Username or password Mismatch");
                count++;
            }
        } while (count == 1);


        System.out.println("Welcome user " + username.getRealname());
        System.out.println("Please select option below ");



    }

}

