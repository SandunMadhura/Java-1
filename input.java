import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
            System.out.println("Enter Your Name");
            String stuName = myObj.nextLine();
            

            System.out.println("Enter Your Age");
            int age = myObj.nextInt();
            myObj.nextLine();
            

            System.out.println("Enter Your City");
            String city = myObj.nextLine();

                System.out.println("Name : "+stuName);
                System.out.println("Age : "+age);
                System.out.println("City : "+city);
    }
}
