//
// Created by selhatin on 30.1.2023.
//
#include <bits/stdc++.h>

using namespace std;

int main(){
    int x;
    cin>>x;
    string a,b;
    vector<string> vec;
    vector<string> vec2;

    for (int i = 0; i <x ; i++) {
        cin>>a;
        vec.push_back(a);
        //  if(a!=b)cout<<i+1;
    }
    for (int i = 0; i <x ; i++) {
        cin>>a;
        vec2.push_back(a);
        //  if(a!=b)cout<<i+1;
    }

    for (int i = 0; i <x ; ++i) {

        if(vec[i]!=vec2[i])cout<<i+1;
    }
    return 0;
}