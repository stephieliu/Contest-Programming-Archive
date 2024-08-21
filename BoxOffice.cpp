/*
    2023/07/27
    Box Office
*/

#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
    string name;
    int adultNum, childNum;
    double grossBOP, netBOP, distribPay;
    const double percentKept = 0.20, adultCost = 10.00, childCost = 6.00;

    cout << "Enter the movie name: ";
    getline(cin, name);
    cout << "Adult tickets sold: ";
    cin >> adultNum;
    cout << "Child tickets sold: ";
    cin >> childNum;

    grossBOP = adultNum * adultCost + childNum * childCost;
    netBOP = grossBOP * percentKept;
    distribPay = grossBOP - netBOP;

    cout << left << setw(30) << "Movie Name:";
    cout << name << endl;
    cout << setw(30) << "Adult Tickets Sold:" << right
        << setw(6) << adultNum << endl;
    cout << left << setw(30) << "Child Tickets Sold:" 
        << right << setw(6) << childNum << endl;
    cout << left << setw(30) << "Gross Box Office Profit:"
        << "$ " << right << setw(7) << setprecision(2)
        << fixed << grossBOP << endl;
    cout << left << setw(30) << "Net Box Office Profit:"
        << "$ " << right << setw(7) << setprecision(2)
        << fixed << netBOP << endl;
    cout << left << setw(30) << "Amount Paid to Distributor:"
        << "$ " << right << setw(7) << setprecision(2)
        << fixed << distribPay << endl;
    
    return 0;
}