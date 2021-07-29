import java.util.Scanner;

public class addressBook {
    public static void main(String[] args) {
        System.out.println("//......ADDRESS BOOK......//");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstname=s.next();
        System.out.println("Enter your last name: ");
        String lastname=s.next();
        System.out.println("Address:   ");
        String Address=s.next();
        System.out.println("City: ");
        String City=s.next();
        System.out.println("State: ");
        String State=s.next();
        System.out.println("Zip: ");
        long Zip=s.nextLong();
        System.out.println("phone no: ");
        long phoneno=s.nextLong();
        System.out.println("email:    ");
        String email=s.next();
        System.out.println(".................................................");
        System.out.println("fist name:   "+firstname);
        System.out.println("last name:  "+lastname);
        System.out.println("Address:     "+Address);
        System.out.println("city:          "+City);
        System.out.println("state:         "+State);
        System.out.println("zip:           "+Zip);
        System.out.println("phone no:       "+phoneno);
        System.out.println("email:           "+email);
    }
}
