package conditionandloop;

import java.util.Scanner;

public class condition4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("Number1 is greater");
        } else if( num2>num1)
        {
            System.out.println("Number 2 is greater");
        }
    else{
            System.out.println("Number 2 is equal");

        }
    }
}

