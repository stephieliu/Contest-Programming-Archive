//Rolling Dice Simulator
#include <iostream>
#include <cstdlib> //For rand and srand
#include <ctime> //For time function
using namespace std;

int main()
{
    //Constants
    const int min = 1; //Minimum die value
    const int max = 6; //Maximum die value

    //Variables
    int die1; //Hold value of die #1
    int die2; //Hold value of die #2

    //Get system time
    unsigned seed = time(0);

    //Seed the rng
    srand(seed);

    //Roll the dice and print the result
    cout<<"Rolling the dice...\n";
    die1 = (rand()%(max - min + 1)) + min;
    die2 = (rand()%(max - min + 1)) + min;
    cout<<die1<<endl;
    cout<<die2<<endl;
    return 0;
}