#include <iostream>
using namespace std;
int factorial_of_a_number(int n)
{
if(n == 0)
return 1;
else
return (n * factorial_of_a_number(n-1));
}
int main()
{
int n;
cin >> n;
if(n < 0)
cout << "Invalid input";
else
cout << "The factorial of " << n << " is " << factorial_of_a_number(n);
return 0;
}
