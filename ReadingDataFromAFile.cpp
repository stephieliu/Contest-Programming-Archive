/*
    2023/07/29
    Reading Data from a File
*/

#include <iostream>
#include <fstream>
#include <string>
using namespace std;

int main()
{
    ifstream inputFile;
    string name;

    inputFile.open("Friends.txt");
    cout << "Reading data from the file.\n";

    inputFile >> name; //read name 1 from the file
    cout << name << endl; //display name 1

    inputFile >> name; //read name 2 from the file
    cout << name << endl; //display name 2

    inputFile >> name; //read name 3 from the file
    cout << name << endl; //display name 3

    inputFile.close(); //close the file
    return 0;
}