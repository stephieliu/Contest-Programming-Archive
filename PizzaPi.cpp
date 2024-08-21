/*
    2023/07/28
    Pizza Pi
*/

#include <iostream>
#include <iomanip>
#include <cmath>
using namespace std;

int main()
{
    double diameter, radius, area, slices;
    const double sliceArea = 14.125, pi = 3.14159;

    cout << "Diameter of the pizza (inches): ";
    cin >> diameter;

    radius = diameter / 2;
    area = pi * pow(radius, 2);
    slices = area / sliceArea;
    
    cout << "Number of slices: " << setprecision(1) 
        << fixed << slices << endl;

    return 0;
}