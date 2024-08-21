/*
    2023/07/28
    Celsius to Fahrenheit
*/

#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
    double celsius, fahrenheit;

    cout << "Enter the temperature in degrees Celsius: ";
    cin >> celsius;
    
    fahrenheit = (9.0/5.0) * celsius + 32;

    cout << "The temperature in degrees Fahrenheit is: " 
        << setprecision(2) << fixed << fahrenheit << endl;
    
    return 0;
}