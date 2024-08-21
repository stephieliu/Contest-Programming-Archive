/*
    2023/07/23
    Restaurant Bill
*/

#include <iostream>
using namespace std;
int main()
{
    double mealCharge = 88.67, tax = 0.0675, tip = 0.20;
    double taxCharge = mealCharge * tax;
    double tipCharge = (mealCharge + taxCharge) *tip;
    cout<<"Meal Cost: "<<mealCharge<<"\nTax Amount: "
        <<taxCharge<<"\nTip Amount: "<<tipCharge
        <<"\nTotal Bill: "<<mealCharge + taxCharge + tipCharge
        <<endl;
    return 0;
}