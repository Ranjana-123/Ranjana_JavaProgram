package OCT.Ternary_opr;

public class lab28810
{
    public static void main(String[] args)
    {
        int score=65;
        String grade;
                grade= (score >= 90) ? "A": (score >=80) ? "B": (score>=70)?"C":(score>=60)? "D":"F";
        System.out.println(grade);
    }
}

