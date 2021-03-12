import java.util.*;
import java.io.*;

public class Read_Scanner {
    public static void main(String[] args) throws Exception {
        File f = new File("C:\\Users\\sruthi-pt4021\\IdeaProjects\\Text1.txt");
        Scanner sc = new Scanner(f);

        while(sc.hasNextLine())
        {
            System.out.println(sc.nextLine());
        }

    }
}
