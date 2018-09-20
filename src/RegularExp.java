import java.util.regex.Pattern;

public class RegularExp {
    public boolean checkRegEx(String input)
    {   input=input.toLowerCase();
        String regEx="(.*)harry(.*)";
        return Pattern.matches(regEx,input);
    }
}