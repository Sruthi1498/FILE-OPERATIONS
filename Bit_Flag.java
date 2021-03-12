public class Bit_Flag
{
    public static void main(String[] args) {
        boolean flag = false;
        int num = 9;

        if(num%2 == 0)
            flag = true;

        if(flag==false)
            System.out.println("odd");
        else
            System.out.println("even");
    }
}