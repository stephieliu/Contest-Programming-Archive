/*
    2023/07/30
    Detecting the End of a File and Testing for File Open Errors
*/

#include <iostream>
#include <fstream>
using namespace std;

int main()
{
    ifstream inputFile;
    int number;

    inputFile.open("ListOfNumbers.txt"); //open the file

    if(inputFile) //if the file successfully opened, process it
    {
        while(inputFile >> number) //read the numbers from the file and display them
        {
            cout << number << endl;
        }
        inputFile.close(); //close the file
    }
    else
    {
        cout << "Error opening the file.\n"; //display error message
    }
    return 0;
}