/*
    2023/07/28
    Time Calculator
*/

#include <iostream>
using namespace std;

int main()
{
    int secs;

    cout << "Enter the number of seconds: ";
    cin >> secs;

    if(secs >= 60)
    {
        cout << "Number of minutes: " << (secs / 60) << endl;
    }
    if(secs >= 3600)
    {
        cout << "Number of hours: " << (secs / 3600) << endl;
    }
    if(secs >= 86400)
    {
        cout << "Number of days: " << (secs / 86400) << endl;
    }

    return 0;
}