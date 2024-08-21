/*
    2023/07/23
    Energy Drink Consumption
*/

#include <iostream>
using namespace std;
int main()
{
    int customers = 16500;
    int oneOrMore = customers * 0.15;
    int citrus = oneOrMore * 0.58;
    cout<<"Purchase one or more: "<<oneOrMore<<" customers\n"
        <<"Prefer citrus-flavoured: "<<citrus<<" customers"
        <<endl;
    return 0;
}