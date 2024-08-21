/*
    2023/08/08
    Random Number Guessing Game
*/

#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

int main()
{
    int num, guess;

    unsigned seed = time(0);
    srand(seed);
    num = rand();

    while(true)
    {
        cout << "Enter your guess: ";
        cin >> guess;

        if(guess > num)
            cout << "Too high, try again.\n";
        else if(guess < num)
            cout << "Too low, try again.\n";
        else
        {
            cout << "You guessed the number!\n";
            break;
        }
    }
    return 0;
}