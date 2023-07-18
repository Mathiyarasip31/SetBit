import java.util.Scanner;
public class SetBit {
    static int Count(int n, int m) {
        int count = 0;
        count = count | 1 << n;
        count = count | 1 << m;
        return count;
    }
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input1 ");
        int A= scanner.nextInt();
        System.out.println("Input2 ");
        int B=scanner.nextInt();
        System.out.println(Count(A,B););
    }
}