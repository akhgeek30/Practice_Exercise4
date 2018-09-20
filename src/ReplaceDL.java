public class ReplaceDL
{   public String[] replaceCharacter(String[] input)
    {
        for(int i=0;i<input.length;i++)
        {
            if(input[i].contains("d")){
                input[i]=input[i].replace("d","f");
            }

            if(input[i].contains("l")){
                input[i]=input[i].replace("l","t");
            }
        }
        return input;

    }
}
