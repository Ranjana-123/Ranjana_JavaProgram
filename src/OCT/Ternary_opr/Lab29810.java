package OCT.Ternary_opr;

public class Lab29810 {
    public static void main(String[] args)
    {
        int a=10;
        int b=20;
        int c=15;
       int Result= (a >=b && a>=c) ? a:(b >=c ? b:c);
        System.out.println(Result);
    }
}
