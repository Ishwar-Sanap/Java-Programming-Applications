#include <iostream>
using namespace std;

// for differnent data type we have to write seprate logic

int Addition(int iNo1,int iNo2)
{
    int Ans=0;
    
    Ans= iNo1+iNo2;

    return Ans;

}
float Addition(float iNo1,float iNo2)
{
    float Ans=0;
    
    Ans= iNo1+iNo2;

    return Ans;

}
int main()
{
    int iValue1 =10,iValue2=11,iRet=0;

   iRet= Addition(iValue1,iValue2);

   cout<<"Addiotion is :"<<iRet<<endl;

      float x =10.85,y=11.54,fRet=0;

   fRet= Addition(x,y);

   cout<<"Addiotion is :"<<fRet;

    return 0;
}