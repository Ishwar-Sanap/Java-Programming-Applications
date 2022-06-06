
class String5 {
    public static void main(String[] args) {
        
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new ("Hello");

        // 100 == 100
        if(str1==str2)  // it checks hashcodes
        {
            System.out.println("String are same");
        }
        else
            System.out.println("String are different");

        if(str1.equals(str2))
        {
            System.out.println("String are same");
        }
        else
            System.out.println("String are different");

        
    }
}
