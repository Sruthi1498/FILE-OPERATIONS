import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        boolean flag = false;
        int mid = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            arr[i] = scan.nextInt();
        }
        System.out.println("Search element");
        int a = scan.nextInt();

        int first = 0;
        int last = n-1;


        while(first<=last)
        {
            mid=(first+last)/2;

            if(a==arr[mid]){
                flag=true;
                break;
            }
            else
            if(a>arr[mid])
                first=mid+1;
            else
                last=mid-1;
        }
        if(flag == true)
            System.out.println("found at "+ (mid+1));
        else
            System.out.println("not found");
    }
}
