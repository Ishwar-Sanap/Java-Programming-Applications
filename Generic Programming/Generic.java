import java.lang.*;

// template<class T> c++

class Arithmetic <T>
{
    public T Addition(T no1,T no2)
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
class Generic 
{
    public static void main(String arg[])
    {   
        Arithmetic  <Integer> obj = new Arithmetic <Integer>();
        Integer ret=0;
        ret=obj.Addition(11,10);
        System.out.println("Addition is :"+ret);

        Arithmetic  <Float> obj2 = new Arithmetic <Float>();
        Float ret2 =0.0f;
        ret2 = obj2.Addition(1.4,1.8);
        System.out.println("Addition is :"+ret2);


    }
    
}
