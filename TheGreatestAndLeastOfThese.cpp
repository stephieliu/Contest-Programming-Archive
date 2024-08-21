/*
    2023/08/07
    The Greatest and Least of These
*/

#include <iostream>
using namespace std;

int main()
{
    int series, max = 0, min = 0;
    bool flag = false;

    cout << "Enter an integer: ";
    cin >> series;

    min = series;

    if(series == -99) flag = true;

    while(series != -99)
    {
        if(series >= max)
        {
            max = series;
        }
        if(series <= min)
        {
            min = series;
        }
        cout << "Enter an integer: ";
        cin >> series;
    }

    if(flag)
        cout << "Program ended." << endl;
    else
    {
        cout << "Largest number entered: " << max << endl;
        cout << "Smallest number entered: " << min << endl;
    }

    return 0;
}