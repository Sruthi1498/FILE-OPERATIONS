import java.io.*;

public class Delete
{
    public static void main(String[] args) throws IOException
    {
        PrintWriter pw = new PrintWriter("C:\\Users\\sruthi-pt4021\\IdeaProjects\\Text3.txt");

        BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\sruthi-pt4021\\IdeaProjects\\Text1.txt"));

        String line1 = br1.readLine();

        while(line1 != null)
        {
            boolean flag = false;

            BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\sruthi-pt4021\\IdeaProjects\\Text2.txt"));

            String line2 = br2.readLine();


            while(line2 != null)
            {
                if(line1.equals(line2))
                {
                    flag = true;
                    break;
                }

                line2 = br2.readLine();
            }

            if(!flag)
                pw.println(line1);

            line1 = br1.readLine();

        }

        pw.flush();

        br1.close();
        pw.close();

        System.out.println("success");
    }
} 