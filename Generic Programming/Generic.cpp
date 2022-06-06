#include <iostream>
using namespace std;

template< class T> // Template header
T Addition(T No1,T No2)
{
    T Ans; // Ans integer hota 
            // ata to  generic aahe
    
    Ans= No1+No2;

    return Ans;

}

int main()
{
    int iValue1 =10,iValue2=11,iRet=0;
    iRet= Addition(iValue1,iValue2);
    cout<<"Addiotion is :"<<iRet<<endl;


    float x =10.8,y=11.5,fRet=0.0;
    fRet= Addition(x,y);
    cout<<"Addiotion is :"<<fRet<<endl;

    
    double d1 =17.8,d2=19.5,dRet=0.0;
    fRet= Addition(d1,d2);
    cout<<"Addiotion is :"<<fRet<<endl;


    return 0;
}