/*
    2023/07/30
    Distance Traveled
*/

#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
    int speed, time, distance;

    cout << "What is the speed of the vehicle in mph? ";
    cin >> speed;
    cout << "How many hours has it traveled? ";
    cin >> time;
    if(speed >-1 && time > 0)
    {
        cout << "Hour   Distance Traveled\n"
            << "--------------------------------\n";
        
        for(int i = 1; i<=time; i++){
            distance = i * speed;

            cout << setw(2) << i;
            cout << setw(15) << distance << endl;
        }
    }
    else cout << "Enter a valid number." << endl;
    return 0;
}