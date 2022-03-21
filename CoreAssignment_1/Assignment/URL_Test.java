package Assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Map;
import java.util.TreeMap;

public class URL_Test{
    public static TreeMap<String, Integer> traverse(URL url) {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String words[] = Count.inputWords();
            String urlline;
            int[] countword = { 0, 0, 0 };
            while ((urlline = in.readLine()) != null) {
                countword = Count.wordsount(urlline, words, countword);
            }
            TreeMap<String, Integer> wordcount = new TreeMap<String, Integer>();
            for (int i = 0; i < 3; i++) {
                wordcount.put(words[i], countword[i]);
            }
            return wordcount;
        } catch (Exception e) {
            System.out.println("Error...!");
            
        }
        return null;

    }

    public static void Writer(TreeMap<String, Integer> wordcount) {
        try {
            BufferedWriter buf = new BufferedWriter(new FileWriter("words.txt"));
            for (Map.Entry value : wordcount.entrySet()) {
                buf.write(value.getKey() + " = " + value.getValue()+"\n");
                buf.flush();
            }
        } catch (Exception e) {
            System.out.println("Some Error occured..!");
        }
    }
}