/*
    2023/07/28
    Geometry Calculator
*/

#include <iostream>
#include <iomanip>
#include <cmath>
using namespace std;

int main()
{
    //variables
    int choice;

    //display the menu
    cout << "Geometry Calculator\n\n";
    cout << setw(7) << "1. ";
    cout << "Calculate the Area of a Circle\n";
    cout << setw(7) << "2. ";
    cout << "Calculate the Area of a Rectangle\n";
    cout << setw(7) << "3. ";
    cout << "Calculate the Area of a Triangle\n";
    cout << setw(7) << "4. ";
    cout << "Quit\n\n";
    cout << "    Enter your choice (1-4): ";

    cin >> choice;
    if(choice == 1)
    {
        double radius, area;
        cout << "\nCircle radius: ";
        cin >> radius;

        if(radius >= 0)
        {
            area = 3.14159 * pow(radius, 2);
            cout << "Area of circle: " << setprecision(2)
                << fixed << area << endl;
        }
        else
        {
            cout << "Invalid value for radius." << endl;
        }
    }
    else if(choice == 2)
    {
        double length, width, area;
        cout << "\nRectangle length: ";
        cin >> length;
        cout << "Rectangle width: ";
        cin >> width;
        
        if(length >= 0 && width >= 0)
        {
            area = length * width;
            cout << "Area of rectangle: " << setprecision(2)
                << fixed << area << endl;
        }
        else
        {
            cout << "Invalid value for dimensions." << endl;
        }
    }
    else if(choice == 3)
    {
        double base, height, area;
        cout << "\nTriangle base: ";
        cin >> base;
        cout << "Triangle height: ";
        cin >> height;
        
        if(base >= 0 && height >= 0)
        {
            area = base * height * 0.5;
            cout << "Area of triangle: " << setprecision(2)
                << fixed << area << endl;
        }
        else
        {
            cout << "Invalid value for dimensions." << endl;
        }
    }
    else if(choice == 4)
    {
        cout << "\nProgram ended." << endl;
    }
    else
    {
        cout << "\nInvalid choice entered." << endl;
    }

    return 0;
}