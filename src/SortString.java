import java.util.*;
public class SortString {
    public String sorting(String input){
        String[] splitString=input.split(" ");
        Set<String> output=new TreeSet<String>();
        for(String s:splitString){
            output.add(s);
        }
        return output.toString();
    }
}
