import java.lang.*;
class Array3 
{
   public static void main(String[] args) {
       int i =0,j=0;

    int arr[][]= new int[2][3];
    
    /*
        arr is two dimensional array which contains 2 one dimesional arry 
        and each one dimesional array contains 3 elements 
        and every element is of type integer
    */

    arr[0][0]=11;
    arr[0][1]=21;
    arr[0][2]=51;
    arr[1][0]=111;
    arr[1][1]=121;
    arr[1][2]=151;

    for(i =0; i<arr.length;i++)
    {
        for(j=0 ; j<arr[i].length;j++)
        {
            System.out.println(arr[i][j]);
        }
    }

   } 
}
