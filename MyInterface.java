import java.lang.*;

interface circle
{
    float PI = 3.14f;  // public static final PI = 3.14f;
    
    // 3.14 is  by deafult considerd as double so to use flot f is required

    float CalculateArea(float fRadius );          // public abstract float CalculateArea(float fRadius)
    float CalculateCircumfarance(float fRadius ); // public abstract float CalculateCircumfaerncefloat fRadius)

}
interface demo extends circle
{
    
}
class Area implements circle
{
   public float CalculateArea(float fRadius)   // if we not write public here it by default considerd as a Default Access Specifier
    {
        return (PI*fRadius*fRadius);
    }

  public  float CalculateCircumfarance(float fRadius)
    {
        return (2*PI*fRadius);
    }
}
class MyInterface
{
    public static void main(String arr[])
    {
        System.out.println("Value of PI is : "+circle.PI);
        // circle.PI =6.14 not valid b'cause it is a final
        float fRet = 0.0f;
        Area obj = new Area();

        fRet = obj.CalculateArea(10.5f);
        System.out.println("Area is :"+fRet);

        fRet = obj.CalculateCircumfarance(10.5f);
        System.out.println("Circumferance is :"+fRet);

    }
}