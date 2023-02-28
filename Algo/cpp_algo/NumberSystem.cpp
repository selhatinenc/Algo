//
// Created by as_as on 15.12.2022.
//
#include <bits/stdc++.h>
using namespace std;
#define  ll  long long

int isSmaller(char first,char i);
ll newnumbersystem(string str,ll first,ll end);
ll MOD=1000000007;

ll takefactorial(ll number);

int main(){
  //  cout<<isSmaller('A','A');
  string str;
  int length;
  cin>>length;
  cin>>str;
 cout<<   newnumbersystem(str,0,length-1)%MOD;

    return 21;
}
ll newnumbersystem(string str,ll first,ll end){
    if(first==end)return 0;
    ll smallerletter=0;
    for (int i = first+1; i <end+1 ; ++i) {
        smallerletter+=isSmaller(str[first],str[i]);
    }
    return (smallerletter* takefactorial(end-first))%MOD+ newnumbersystem(str,first+1,end);
}
int isSmaller(char first,char i){
    if((int)first-(int)('A')>(int)i-int('A')) return 1;
    return 0;
}

ll takefactorial(ll number){
    ll result=1;
    while(number>1){
        result=(result*number--)%MOD;
    }
   // cout<<"Number :"<<number<<"  Factorial result:"<<result<<endl;
    return result;
};