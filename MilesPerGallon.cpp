/*
    2023/07/27
    Miles per Gallon
*/

#include <iostream>
using namespace std;
int main()
{
    int gallons, fullTankMiles, milesPerGallon;
    cout << "Enter the number of gallons that the car can hold: ";
    cin >> gallons;
    cout << "Enter the number of miles that can be driven on a full tank: ";
    cin >> fullTankMiles;
    milesPerGallon = fullTankMiles / gallons;
    cout << "Miles per gallon of gas: "
        << milesPerGallon << endl;
    return 0;
}