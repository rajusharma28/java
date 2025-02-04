import java.util.Scanner;

public class ArrayUserInp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] =new int[5];
        System.out.println("Enter array element ");
        for (int i=0;i<a.length;i++)
            a[i]=sc.nextInt();
        System.out.println("The array is");
        for(int i=0;i<a.length;i++)
           System.out.println(" "+a[i]);



    }
}
