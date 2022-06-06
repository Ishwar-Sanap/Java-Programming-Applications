#include <iostream>
using namespace std;

template <class T>

class Arithmetic
{
public:
    T no1;
    T no2;

    Arithmetic(T a, T b)
    {
        no1 = a;
        no2 = b;
    }

    T Addition()
    {
        T Ans ; // don't initialize the Ans with the default value b'cause we don't know variable data type
        Ans = no1 + no2;
        return Ans;
    }

    
    T Substraction()
    {
        T Ans ;
        Ans = no1 - no2;
        return Ans;
    }
};

int main()
{
     int ret = 0;

     Arithmetic <int> iobj(10, 11);  //<int> it is Template argumemt it replace all T with the int
                                    // for seprate template argument <int> seprate class created 

     ret = iobj.Addition();

     cout << "Addiotion is :" << ret << endl;


    Arithmetic <double> dobj(10.9, 11.5);  //<double> it is Template argumemt it replace all T with the  double
                                            // for seprate template argument <double> seprate class created

     double dret = dobj.Addition();

     cout << "Addiotion is :" << dret << endl;

    return 0;
}