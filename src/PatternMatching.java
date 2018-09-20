import java.util.regex.*;
import java.util.Scanner;
public class PatternMatching {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[]  args){
        String input=scanner.nextLine();
        String regexe=scanner.nextLine();
        Pattern pattern = Pattern.compile(regexe);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find())
        {
            System.out.println("found at: " + matcher.start() + "-" + matcher.end());
        }
    }
}
