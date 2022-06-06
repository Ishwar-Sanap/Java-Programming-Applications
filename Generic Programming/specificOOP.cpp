#include <iostream>
using namespace std;

class Arithmetic
{
public:
    int no1, no2;

    Arithmetic(int a, int b)
    {
        no1 = a;
        no2 = b;
    }

    int Addition()
    {
        int Ans = 0;
        Ans = no1 + no2;
        return Ans;
    }

    
    int Substraction()
    {
        int Ans = 0;
        Ans = no1 - no2;
        return Ans;
    }
};

int main()
{
    int ret = 0;

    Arithmetic obj(10, 11);

    ret = obj.Addition();

    cout << "Addiotion is :" << ret << endl;
    return 0;
}