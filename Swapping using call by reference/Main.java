#include<iostream>
using namespace std;
int main()
{
    int a, b;
    cin >> a >> b;
   cout << "Before swapping a= " << a << " and b=" << b<<endl;//consider two numbers as 4 and 5
    a = a + b;  //a = 4 + 5 = 9
    b = a - b;  //b = 9 - 5 = 4
    a = a - b;  //a = 9 - 4 = 5
    cout << "After swapping a= " << a << " and b=" << b;
}