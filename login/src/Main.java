//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Our Registration System");
        login l = new login();
//        List<login> logins = new ArrayList<>();
//        logins.add(l);

        l.Registration();


    }
}
class login
{
    String username;
    String password;
    String emaill;
    String contactNo;

    Scanner read = new Scanner(System.in);

    Pattern p = Pattern.compile("^(.+)@(\\\\S+)$");
    Matcher m = p.matcher("email");
    boolean found = m.find();
    int answer =0;
    int i =0;
    void Registration()
    {
        System.out.println("Please Enter Your Username: ");
        username = read.next();
        System.out.println("Please Enter Your Password; ");
        password = read.next();
        System.out.println("Please Enter Your Email: ");
        emaill = read.next();
        System.out.println("Please Enter Your Contact Number: ");
        contactNo = read.next();
        while (!found)
        {
            System.out.println("Invalid Entry!!");
            System.out.println("Select Your Choice : \n1. Register Again. \n2. Exit");
            answer = read.nextInt();
            if (answer == 1)
            {
                System.out.println("Please Enter Your Username: ");
                username = read.next();
                System.out.println("Please Enter Your Password; ");
                password = read.next();
                System.out.println("Please Enter Your Email: ");
                emaill = read.next();
                System.out.println("Please Enter Your Contact Number: ");
                contactNo = read.next();
            }else
            {
                break;
            }
            i++;
        }
    }

}