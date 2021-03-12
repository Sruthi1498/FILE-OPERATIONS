import java.io.FileWriter;
import java.io.FilterWriter;

public class Write {
    public static void main(String[] args) {
        try {
            FileWriter f = new FileWriter("C:\\Users\\sruthi-pt4021\\IdeaProjects\\Text1.txt");
            f.write("welcome");
            f.close();
        }
        catch (Exception e)
        {
            System.out.println("exception");
        }
        System.out.println("success");
    }
}
