#include <bits/stdc++.h>
using namespace std;
#define  ll  long long
ll MOD=1000000007;
const int MAX_CHAR = 26;

void quick_sort(char* arr,int low , int high);
int partition(char* arr,int low, int high);
void count_char_of_string(string str,int* arr);
int main(){
    int count[MAX_CHAR]={0};
    int count_2[MAX_CHAR]={0};

    string str1, str2;
    cin>>str1;
    cin>>str2;


    //char arr[5]={'a','z','b','d','t'};
    count_char_of_string(str1,count);
    count_char_of_string(str2,count_2);

    for (int i = 0; i <26 ; ++i) {
        if(count[i]!=count_2[i])cout<<(char)(i+'a');
    }
    return 0;

}

void count_char_of_string(string str,int* arr){
    for (char c:str){
        arr[c-'a']++;
       // cout<<arr[c-'a']<<endl;
    }
}









/*
 *     char arr[5]={'a','z','b','d','t'};
    quick_sort(arr,0,5);
    for (int i = 0; i <5 ; ++i) {
        cout<<arr[i]<<endl;
    }
    return 0;
 */

int partition(char* arr,int low, int high){
    int current_pivot_index=high-1;
    int new_pivot_index=low-1;
    for (int i = 0; i <high-1 ; i++) {
        if(arr[i]-'a'<arr[current_pivot_index]-'a'){
            new_pivot_index+=1;

            char temp=arr[new_pivot_index];
            arr[new_pivot_index]=arr[i];
            arr[i]=temp;
        }
    }
    new_pivot_index+=1;

    char temp=arr[high-1];
    arr[high-1]=arr[new_pivot_index];
    arr[new_pivot_index]=temp;
    return new_pivot_index;

}
void quick_sort(char* arr,int low , int high){
    if(low<high){
        int pivot= partition(arr,low,high);
        quick_sort(arr,low,pivot);
        quick_sort(arr,pivot+1,high);
    }
}