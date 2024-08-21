/*
    2023/07/23
    Sales Tax
*/

#include <iostream>
using namespace std;
int main()
{
    double purchase = 95, salesTax = 0.04 + 0.02;
    double totalTax = 95*salesTax;
    cout<<totalTax<<endl;
    return 0;
}