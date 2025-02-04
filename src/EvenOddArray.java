import java.util.Scanner;

public class EvenOddArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]=new int[10];
        System.out.println("Enter a number:");
        int l1=0,l2=0;

        for(int i=0;i<=a.length;i++)
        {
            a[i]= sc.nextInt();
            if(a[i]%2==0)
                l1++;
            else
                l2++;

        }
        int even[]=new int [l1];
        int odd[]=new int [l2];
        int x=0,y=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0)
            {
                even[x]=a[i];
                x++;

            }
            else {
                odd[y]=a[i];
                y++;
            }
        }
        System.out.println("Even Array ");
        for (int i=0;i<even.length;i++)
            System.out.println(even[i]);
        System.out.println("Odd Array");
        for(int i=0;i<odd.length;i++)
            System.out.println(odd[i]);
    }
}
