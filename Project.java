package Project1;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;
import java.util.Scanner;
import java.nio.file.Paths;

public class Project {
    public static void main(String[] args)throws Exception
    {
        File file=new File("D:\\JAVA\\Programs in JAVA\\src\\Project1\\movies.txt");
        Scanner scanner=new Scanner(file);
        int movie=(int)(Math.random()*25);
        System.out.println("the randon number picked="+movie);
        int count=1;
        String S1 = null;
        while(scanner.hasNextLine())
        {
            String s=scanner.nextLine();
            if(count==movie)
            {
                S1=s;
                //System.out.println(s);
                break;
            }
            count++;
            //s.split(" ");
        }
//        for(int i=0;i<S1.length();i++)
//        {
//            System.out.println();
//        }
        String S2=S1;
        S2=S2.replaceAll("[a-zA-Z]","_");
        System.out.println(S2);

        //String line= Files.readAllLines(Path.of("D:\\JAVA\\Programs in JAVA\\src\\Project1\\movies.txt").getFileName());
        ///int counter=0;
        //int flag=0;
        //while(scanner.hasNextLine())
        //{
            //String s=scanner.nextLine();
            //s.split(" ");
            //s.getBytes();
//            if(counter==movie)
//            {
//               flag=1;
//               break;
//            }
//            counter++
            //System.out.println(scanner.nextLine());
            //count++;
       // }
        //System.out.println(count);

    }
}
