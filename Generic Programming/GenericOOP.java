import java.lang.*;

class Arithmetic<T>
{   
  public  T no1, no2;
  
  Arithmetic(T a, T b)
  {
      no1 = a;
      no2 =b;

  }

    public T Addition()
    {
        if( (no1 instanceof Integer) && (no2 instanceof Integer))
            return (T) (Integer) ( (Integer)no1 + (Integer)no2 );

        else if((no1 instanceof Float) && (no2 instanceof Float))
        return (T)(Float) ( (Float)no1 + (Float)no2 );

        else if((no1 instanceof Double) && (no2 instanceof Double))
        return (T)(Double) ( (Double)no1 + (Double)no2 );

        else
        {
            return null;
        }
    
    }
}
class GenericOOP
{
    public static void main(String arg[])
    {   
        Arithmetic <Integer> obj = new Arithmetic<Integer>(10,11);
        Integer ret=0;
        ret=obj.Addition();
        System.out.println("Addition is :"+ret);

    }
    
}
