package conditionandloop;

import java.util.Scanner;

public class condition6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double Side1 = sc.nextDouble();
        System.out.println("Enter lenth of side 1");
        Double Side2 = sc.nextDouble();
        System.out.println("Enter lenth of side 2");
        Double Side3 = sc.nextDouble();
        System.out.println("Enter lenth of side 3");
        if(Side1<=0||Side2<=0 ||Side3<=0) {
            System.out.println("Length should not be negative");
        }
        else if(Side1.equals(Side2) && Side2.equals(Side3)&& Side1.equals(Side3)) {
            System.out.println("Triange is Equlateral");
        } else if (Side1.equals(Side2) || Side2.equals(Side3) || Side1.equals(Side3))
            System.out.println("Triangle is Isoclese");
            else System.out.println("Trinagle is Scalene");
    }
}
