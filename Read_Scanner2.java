import java.io.*;
import java.util.*;

public class Read_Scanner2 {
    public static void main(String[] args) throws Exception{
        File f = new File("C:\\Users\\sruthi-pt4021\\IdeaProjects\\Text1.txt");
        Scanner sc = new Scanner(f);

        sc.useDelimiter("\\z");
        System.out.println(sc.next());
    }
}
