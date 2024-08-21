/*
    2023/07/27
    Ingredient Adjuster
*/

#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
    const double rSugar = 1.5, rButter = 1, rFlour = 2.75, rCookies = 48;
    double modSugar, modButter, modFlour, modCookies, ratio;

    cout << "How many cookies? ";
    cin >> modCookies;
    
    ratio = modCookies / rCookies;
    modSugar = ratio * rSugar;
    modButter = ratio * rButter;
    modFlour = ratio * rFlour;

    cout << "Sugar: " << setprecision(2) << fixed 
        << modSugar << " cups" << endl;
    cout << "Butter: " << setprecision(2) << fixed 
        << modButter << " cups" << endl;
    cout << "Flour: " << setprecision(2) << fixed 
        << modFlour << " cups" << endl;
    
    return 0;
}