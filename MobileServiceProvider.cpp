/*
    2023/07/28
    Mobile Service Provider
*/

#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
    char package;
    int minutes;

    cout << "Subscription package: ";
    cin >> package;
    cout << "Minutes used: ";
    cin >> minutes;

    if(package == 'A')
    {
        double monthlyBill = 39.99;
        if(minutes > 450)
            monthlyBill += 0.45 * (minutes - 450);
        cout << "Monthly Bill: $" << setprecision(2)
            << fixed << monthlyBill << endl;
    }
    else if(package == 'B')
    {
        double monthlyBill = 59.99;
        if(minutes > 900)
            monthlyBill += 0.40 * (minutes - 900);
        cout << "Monthly Bill: $" << setprecision(2)
            << fixed << monthlyBill << endl;
    }
    else if(package == 'C')
    {
        cout << "Monthly Bill: $69.99" << endl;
    }
    else
    {
        cout << "Select a valid subscription package."
            << endl;
    }

    return 0;
}