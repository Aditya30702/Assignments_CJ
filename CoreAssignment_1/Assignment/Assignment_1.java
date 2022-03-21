package Assignment;

import java.net.URL;
import java.util.Scanner;
import java.util.TreeMap;

public class Assignment_1{
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
                System.out.println("\nURL List : ");
                Read.readOutput();
                System.out.println("\nWhich url you want to read : ");
                int urlnum = sc.nextInt();
                URL traversurl = Read.Reader(urlnum);
                TreeMap<String, Integer> wordcount = URL_Test.traverse(traversurl);
                URL_Test.Writer(wordcount);
                System.out.println("\n Done, you can See the file.");
        } catch (Exception e) {
            System.out.println("Invalid Input !! Try Again !!\n");
            System.out.println(e);
        }
    }
}
