/*
    2023/07/30
    Sum of Numbers
*/

#include <iostream>
using namespace std;

int main()
{
    int num, sum = 0;
    cout << "Enter a positive integer value: ";
    cin >> num;
    if(num > 0)
    {
        for(int i = 1; i<=num; i++)
        {
            sum += i;
        }
        cout << "Sum of 1 to " << num << ": " << sum
            << endl;
    }
    else
        cout << "Invalid input." << endl;

    return 0;
}