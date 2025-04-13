package OCT.Ternary_opr;
import java.util.Scanner;

public class javaInscanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age\n");
        int age = scanner.nextInt();
        System.out.println(age>35 ? "allowed to go" : "not allowed");
    }
}
