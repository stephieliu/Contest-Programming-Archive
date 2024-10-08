/*
    2023/07/29
    Writing Data to a File
*/

#include <iostream>
#include <fstream>
using namespace std;

int main()
{
    ofstream outputFile;
    outputFile.open("demofile.txt");

    cout << "Now writing data to the file.\n";

    //write four names to the file
    outputFile << "Bach\n";
    outputFile << "Beethoven\n";
    outputFile << "Mozart\n";
    outputFile << "Schubert\n";

    //close the file
    outputFile.close();
    cout << "Done.\n";
    
    return 0;
}