/*
    2023/08/05
    Hotel Occupancy
*/

#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
    int floors, rooms = 0, occupied = 0, unoccupied;
    double percentOccupied;

    cout << "Number of floors: ";
    cin >> floors;
    
    if(floors > 0)
    {
        for(int i = 0; i<floors; i++)
        {
            if(i == 12) continue;
            int tempRoom, tempOcc;
            cout << "Number of rooms on floor " << (i + 1) << ": ";
            cin >> tempRoom;

            if(tempRoom > 9)
            {
                rooms += tempRoom;

                cout << "Number of occupied on floor " << (i + 1) << ": ";
                cin >> tempOcc;
                occupied += tempOcc;
            }
            else
            {
                cout << "Enter a number greater than 10." << endl;
                break;
            }
        }
        
        unoccupied = rooms - occupied;
        percentOccupied = static_cast <double> (occupied) / rooms;

        cout << "\nNumber of rooms in the hotel: "
            << rooms;
        cout << "\nNumber of occupied rooms: "
            << occupied;
        cout << "\nNumber of unoccupied rooms: "
            << unoccupied;
        cout << "\nPercentage of rooms occupied: "
            << setprecision(2) << fixed
            << (percentOccupied * 100) << "%" << endl;
    }
    else
    {
        cout << "Enter a number greater than 1." << endl;
    }

    return 0;
}