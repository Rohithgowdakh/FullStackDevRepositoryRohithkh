package dsa.linearSearch;

public class SearchInString {
    public static void main(String[] args) {
        System.out.println(getChar("Rohith",'r'));
    }
    public static boolean getChar(String ss,char target)
    {

       char[] cc=ss.toCharArray();
       for(int i=0;i<cc.length;i++)
       {
           if(target==ss.charAt(i))
           {
               return true;

           }
           if(cc[i]==target)
           {
               return true;
           }
       }
       return false;
    }
}
