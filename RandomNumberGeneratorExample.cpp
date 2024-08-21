//Random number generator

#include <iostream>
#include <cstdlib> //For rand and srand
#include <ctime> //For time
using namespace std;

int main()
{
    //Get system time
    unsigned seed = time(0);

    //Seed the rng
    srand(seed);

    //Display 3 random numbers
    cout<<rand()<<endl;
    cout<<rand()<<endl;
    cout<<rand()<<endl;
    return 0;
}