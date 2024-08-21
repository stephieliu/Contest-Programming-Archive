/*
    2023/07/27
    Test Average
*/

#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
    double test1, test2, test3, test4, test5, avg;
    cout << "Enter five test scores separated by a space: ";
    cin >> test1 >> test2 >> test3 >> test4 >> test5;
    
    avg = (test1 + test2 + test3 + test4 + test5) / 5;
    cout << "Average test score: " << setprecision(1) 
        << fixed << avg << endl;

    return 0;
}