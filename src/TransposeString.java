class TransposeString{
    public String removeChar(String input){
        String output="";
        String[] splitString=input.split(" ");
        for(String i:splitString){
            StringBuffer s=new StringBuffer(i);
            s.reverse();
            output+=s.toString()+" ";
        }
       return output.trim();
    }
}