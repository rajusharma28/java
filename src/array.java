public class array {
    public static void main(String[] args) {
        int arr[]=new int[4];//new dynamic memory allocation
        arr[0]=100;
        arr[1]=200;
        arr[2]=300;
        arr[3]=400;
        for (int i=0;i<arr.length;i++)//to iterate array elements with index value
            System.out.println("array is"+arr[i]);

    }

}
