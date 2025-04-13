package conditionandloop;

import java.util.Scanner;

public class condition5 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int Score = sc.nextInt();
            char grade = 'F';
            if (Score >= 90 && Score <= 100) {
                System.out.println("Grade A");
            } else if (Score >= 80 && Score <= 89) {
                System.out.println("Grade B");
            } else if (Score >= 70 && Score <= 79) {
                System.out.println("Grade C");
            } else if (Score >= 60 && Score <= 69) {
                System.out.println("Grade D");
            } else if (Score <=0 || Score>100) {
                System.out.println("Please enter value between 0 and 100");
            }
            else
            {
                System.out.println("Grade F");
            }
        }
    }
