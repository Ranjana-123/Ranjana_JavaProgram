package Task;

public class Task2 {
    public static void main(String[] args) {
        int x = 9;
        int y = 23;
        int z = 26;
        int Max = (x >= y && x>=z)? x: (y>=z?y:z) ;
        System.out.println(Max);
    }
}

