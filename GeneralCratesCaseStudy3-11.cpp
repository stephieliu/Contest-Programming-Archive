//General Crates Case Study (3.11)
#include <iostream>
#include <iomanip>

using namespace std;

int main()
{
    //Constants
    const double COST_PER_CUBIC_FOOT = 0.23;
    const double CHARGE_PER_CUBIC_FOOT = 0.5;
    double length, width, height, volume,
        cost, charge, profit;

    //Prompt the user for input
    cout<<"Enter the length of the crate: ";
    cin>>length;
    cout<<"Enter the width of the crate: ";
    cin>>width;
    cout<<"Enter the height of the crate: ";
    cin>>height;

    //Perform calculations
    volume = length * width * height;
    cost = COST_PER_CUBIC_FOOT * volume;
    charge = CHARGE_PER_CUBIC_FOOT * volume;
    profit = charge - cost;

    //Print the output
    cout<<"The volume is: "<<setprecision(2)<<fixed<<volume<<" cubic feet"<<endl;
    cout<<"The cost is: $"<<cost<<endl;
    cout<<"The customer price is: $"<<charge<<endl;
    cout<<"The profit is: $"<<profit<<endl;

    return 0;
}