import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Story1 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the input");
        String input = br.readLine();
        System.out.println("Enter the number of keywords to be searched");
        int numberOfKeywords = Integer.parseInt(br.readLine());
        System.out.println("Enter the keywords to be searched");
        ArrayList<String> keywords = new ArrayList<String>();
        for (int i = 0; i < numberOfKeywords; i++) {
            keywords.add(br.readLine());
        }

        System.out.println(getInput(input, keywords));
    }

    public static String getInput(String input, ArrayList<String> keywords) {
        for (String key : keywords) {
            input = input.replaceAll(key, "[blue]" + key + "[blue]");
        }
        return input;

    }
}