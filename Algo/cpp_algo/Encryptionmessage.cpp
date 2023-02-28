//
// Created by as_as on 15.12.2022.
//
#include <bits/stdc++.h>
using namespace std;
#define  ll  long long
ll MOD=1000000007;
void encrypt(string word,int index,int word_length);
void decrypt( string word,int word_length);
int main(){
    int choiceline;
    cin>>choiceline;
    string word;
    cin>>word;
    if(choiceline==1)encrypt(word,0,word.length());
    else if (choiceline==2) decrypt(word,word.length());
    return 21;
}
void encrypt(string word,int index,int word_length){
    if(index==word_length) return ;
    for (int i = 0; i <index+1 ; ++i) {
        cout<<word[index];
    }
    encrypt(word,index+1,word_length);
}
void decrypt( string word,int word_length){
    int j=1;
    for(int i=0; i<word_length;i=i+j){
        j++;
        cout<<word[i];
    }
}
