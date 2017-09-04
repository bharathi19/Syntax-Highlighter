import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by cts1 on 29/8/17.
 */
public class Story2 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the input");
        String input = br.readLine();
        System.out.println("Enter the number of keywords to be searched");
        int numberOfKeywords = Integer.parseInt(br.readLine());
        System.out.println("Enter the keywords to be searched with their colour code");
        HashMap<String, String> KeyColour = new HashMap<String, String>();
        for (int i = 0; i < numberOfKeywords; i++) {
            KeyColour.put(br.readLine(), br.readLine());
        }
        System.out.println(getInput(input, KeyColour));
    }

    public static String getInput(String input, HashMap<String, String> KeyColour) {
        for (Map.Entry m : KeyColour.entrySet()) {

            input = input.replaceAll(m.getKey() + "", "[" + m.getValue() + "]" + m.getKey() + "[" + m.getValue() + "]");

        }
        return input;

    }
}