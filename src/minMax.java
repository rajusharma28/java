import java.util.Scanner;

public class minMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]=new int[10];
        int max,min;
        System.out.println("Enter array element");
        for (int i=0;i<a.length;i++)
            a[i]=sc.nextInt();
        max=a[0];
        min=a[0];
        for (int i=0;i<a.length;i++)
        {
            if(max>a[i])
                max=a[i];
            if(min<a[i])
                min=a[i];
        }
        System.out.println("min "+max);
        System.out.println("max "+min);
    }
}
