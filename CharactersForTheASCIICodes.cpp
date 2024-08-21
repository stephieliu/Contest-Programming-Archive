/*
    2023/07/30
    Characters for the ASCII Codes
*/

#include <iostream>
using namespace std;

int main()
{
    char ch = '0';
    for(int i = 0; i<127; i++)
    {
        for(int j = 0; j<16; j++)
        {
            cout << (int) ch << " ";
            i++; ch++;
        }
        cout << endl;
    }
}