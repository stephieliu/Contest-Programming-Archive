/*
    2023/07/28
    Monthly Payments
*/

#include <iostream>
#include <iomanip>
#include <cmath>
using namespace std;

int main()
{
    double loan, rate, paymentNum;
    double monthlyPay, paidBack, interestPaid;

    cout << "Loan Amount: $ ";
    cin >> loan;
    cout << "Monthly Interest Rate: ";
    cin >> rate;
    cout << "Number of Payments: ";
    cin >> paymentNum;

    rate/=100; //convert to decimal

    monthlyPay = (rate * pow(1 + rate, paymentNum)) 
        / (pow(1 + rate, paymentNum) - 1) * loan;
    paidBack = monthlyPay * paymentNum;
    interestPaid = paidBack - loan;

    cout << "\n" << left << setw(30) << "Loan Amount:";
    cout << "$";
    cout << right << setw(9) << setprecision(2) << fixed
        << loan << endl;
    cout << left << setw(30) << "Monthly Interest Rate:";
    cout << right << setw(9) << setprecision(2) << fixed
        << (rate * 100);
    cout << "%" << endl;
    cout << left << setw(30) << "Number of Payments:";
    cout << right << setw(10) << paymentNum << endl;
    cout << left << setw(30) << "Monthly Payment:";
    cout << "$";
    cout << right << setw(9) << setprecision(2) << fixed
        << monthlyPay << endl;
    cout << left << setw(30) << "Amount Paid Back:";
    cout << "$";
    cout << right << setw(9) << setprecision(2) << fixed
        << paidBack << endl;
    cout << left << setw(30) << "Interest Paid:";
    cout << "$";
    cout << right << setw(9) << setprecision(2) << fixed
        << interestPaid << endl;
    
    return 0;
}