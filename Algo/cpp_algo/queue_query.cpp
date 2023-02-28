//
// Created by selhatin on 17.1.2023.
//
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
struct node{
public:
    int data;
    node* next;
    node(int data){
        this->data=data;
        next= nullptr;
    }
};
class queue{
public:
    node* head= nullptr;
    node* last= nullptr;
    void enqueue(int x){
        if(!head){
            last=head=new node(x);
            return;
        }
        last->next=new node(x);
        last=last->next;
    }
    void dequeue(){
        if(!head)return;
        node* temp=head;
        while (temp->next!=last)temp=temp->next;
        delete(last);
        last=temp;
    }
    int print(){
        if(head)return head->data;
        return -1;
    }

};
vector<string> split(const string &str) {
    vector<string> tokens;

    string::size_type start = 0;
    string::size_type end = 0;

    while ((end = str.find(" ", start)) != string::npos) {
        tokens.push_back(str.substr(start, end - start));

        start = end + 1;
    }

    tokens.push_back(str.substr(start));

    return tokens;
}

string rtrim(const string &str) {
    string s(str);

    s.erase(
            find_if(s.rbegin(), s.rend(), not1(ptr_fun<int, int>(isspace))).base(),
            s.end()
    );

    return s;
}
int len(string str)
{
    int length = 0;
    for (int i = 0; str[i] != '\0'; i++)
    {
        length++;

    }
    return length;
}
string strings[2];
// create custom split() function
void split (string str, char seperator)
{
    int currIndex = 0, i = 0;
    int startIndex = 0, endIndex = 0;
    while (i <= len(str))
    {
        if (str[i] == seperator || i == len(str))
        {
            endIndex = i;
            string subStr = "";
            subStr.append(str, startIndex, endIndex - startIndex);
            strings[currIndex] = subStr;
            currIndex += 1;
            startIndex = endIndex + 1;
        }
        i++;
    }
}
int main() {
    int n,q;
    string str;
    cin>>n;
    queue myqueue;

    while(n-->0){
        cin>>str;
        str= rtrim(str);
        //vector<string > vec=split(str);


        if(str=="2"){
            myqueue.dequeue();
        }
        else if(str=="3"){
            cout<<myqueue.print()<<endl;
        }
        else{
            split(str,' ');
            cout<<strings[0];
        }
    }
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    return 0;
}
