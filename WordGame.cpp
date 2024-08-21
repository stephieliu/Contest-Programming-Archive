/*
    2023/07/28
    Word Game
*/

#include <iostream>
using namespace std;

int main()
{
    string name, city, college, profession, animal, pet, story;
    int age;
    cout << "Enter your name: ";
    getline(cin, name);
    cout << "Enter your age: ";
    cin >> age;
    cout << "Enter a city: ";
    cin.ignore();
    getline(cin, city);
    cout << "Enter a college: ";
    getline(cin, college);
    cout << "Enter a profession: ";
    getline(cin, profession);
    cout << "Enter an animal: ";
    getline(cin, animal);
    cout << "Enter the name of a pet: ";
    getline(cin, pet);

    story = "\nThere once was a person named " + name
        + " who lived in " + city + ". At the age of "
        + to_string(age) + ", " + name + " went to college at "
        + college + ". " + name + " graduated and went to work as a "
        + profession + ". Then, " + name + " adopted a(n) "
        + animal + " named " + pet + ". They both lived happily ever after!";
    
    cout << story << endl;

    return 0;
}