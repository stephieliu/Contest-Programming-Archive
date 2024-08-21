/*
    2023/07/28
    Angle Calculator
*/

#include <iostream>
#include <iomanip>
#include <cmath>
using namespace std;

int main()
{
    double angle, sine, cosine, tangent;
    cout << "Enter an angle (radians): ";
    cin >> angle;

    sine = sin(angle);
    cosine = cos(angle);
    tangent = tan(angle);

    cout << "Sine: " << setprecision(4) << fixed 
        << sine << endl;
    cout << "Cosine: " << cosine << endl;
    cout << "Tangent: " << tangent << endl;

    return 0;
}