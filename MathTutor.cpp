/*
    2023/07/28
    Math Tutor
*/

#include <iostream>
#include <iomanip>
#include <ctime>
#include <cstdlib>
using namespace std;

int main()
{
    int num1, num2, sum;
    int max = 999, min = 1;
    char check;

    unsigned seed = time(0);
    srand(seed);

    num1 = (rand() % (max - min + 1)) + min;
    num2 = (rand() % (max - min + 1)) + min;
    sum = num1 + num2;

    cout << "Press Enter to check your answer.\n";
    cout << setw(4) << num1 << endl;
    cout << "+" << setw(3) << num2 << endl;
    cout << "____" << endl;

    cin.get(check);

    cout << setw(4) << num1 << endl;
    cout << "+" << setw(3) << num2 << endl;
    cout << "____" << endl;
    cout << setw(4) << sum << endl;

    return 0;
}