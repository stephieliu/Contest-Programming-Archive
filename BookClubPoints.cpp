/*
    2023/07/28
    Book Club Points
*/

#include <iostream>
using namespace std;

int main()
{
    int points, books;
    
    cout << "Enter the number of books purchased this month: ";
    cin >> books;

    switch(books)
    {
        case 0 : points = 0;
            break;
        case 1 : points = 5;
            break;
        case 2 : points = 15;
            break;
        case 3 : points = 30;
            break;
        default : points = 60;
    }

    cout << "Number of points: " << points << endl;

    return 0;
}