
class StringXXX
{
    public static void main(String[] args) {
        
        int i =0;
        String str = "MARVELLOUS";

        System.out.println(str);
       // System.out.println(str.length());
        
       char Arr[] = str.toCharArray(); // it converts string to Array


        for(i =0; i<str.length(); i++)
        {
           System.out.println(Arr[i]);
        }
    }
}
