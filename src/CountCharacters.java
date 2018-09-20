public class CountCharacters {
    public int countChar(String input,char remove){
        int inputStringLength=input.length();
        input=input.toLowerCase();
        return inputStringLength-input.replaceAll(String.valueOf(remove),"").length();
    }
}
