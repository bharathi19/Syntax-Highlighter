import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Story3 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the input");
        String input = br.readLine();
        System.out.println("Enter the number of keywords to be searched");
        int numberOfKeywords = Integer.parseInt(br.readLine());
        System.out.println("Enter the keywords to be searched with their colour code");
        ArrayList<String> Keywords = new ArrayList<String>();
        for (int i = 0; i < numberOfKeywords; i++) {
            Keywords.add(br.readLine());
        }

        System.out.println(getInput(input, Keywords));
    }

    public static String getInput(String input, ArrayList<String> Keywords) {
        for (String key : Keywords) {
            String[] word = key.split(":");
            if (word[2].equalsIgnoreCase("capital")) {
                input = input.replaceAll(word[0], "[" + word[1] + "]" + word[0].toUpperCase() + "[" + word[1] + "]");
            }
            if (word[2].equalsIgnoreCase("lower")) {
                input = input.replaceAll(word[0], "[" + word[1] + "]" + word[0].toLowerCase() + "[" + word[1] + "]");
            }

        }
        return input;


    }
}
