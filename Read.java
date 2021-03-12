import java.io.*;

public class Read {
    public static void main(String[] args) throws Exception {
    File f = new File("C:\\Users\\sruthi-pt4021\\IdeaProjects\\Text1.txt");

    //bufered reader method
    BufferedReader br = new BufferedReader(new FileReader(f));

    String s;
    while ((s = br.readLine())!=null)
    {
        System.out.println(s);
    }
    }
}
