//
// Created by selhatin on 28.1.2023.
//
// C++ STL program to check whether given
// element exists in the vector or not
#include <iostream>
#include <vector> // for vectors
#include <algorithm> // for find()
using namespace std;

int main()
{

    int element; //element to be searched
    // Initializing a vector
    vector<int> v1{ 10, 20, 30, 40, 50 };

    // input element
    cout << "Enter an element to search: ";
    cin >> element;

    vector<int>::iterator it = find(v1.begin(), v1.end(), element);
    if (it != v1.end()) {
        cout << "Element " << element << " found at position : ";
        cout << it - v1.begin() + 1 << endl;
    }
    else {
        cout << "Element " << element << " does not found" << endl;
    }

    return 0;
}
