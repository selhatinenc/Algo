//
// Created by selhatin on 5.1.2023.
//
/*
 * //Brace your keyboard
//inzva community built algoleague for every algorithm enthusiast hungry for self-improvement and friendly competition. Have fun and good luck!

#include <bits/stdc++.h>

using namespace std;
struct node{
    int data;
    node* next= nullptr;
};
class my_stack{
public:
    node* temp;
    node* top= nullptr;
    void insert_element(int y){
        temp=new node;
        temp->data=y;
        if(top){
            temp->next=top;
        }

        top=temp;
    }
    int pop(){
        if(!top)return  -1;
        int ans=top->data;
        temp=top;
        top=top->next;
        delete(temp);
        return ans;
    }
    void print_stack(){

temp=top;
while(temp){
cout<<temp->data<<"";
temp=temp->next;
}
}
};
int main() {
// write your code here
    int n;
    cin>>n;
    if(!n)return 0;

    my_stack stack;
    my_stack reversed_stack;
    int q=0;// holds loop number
    while(n){
        q++;
        stack.insert_element(n%10);
        n/=10;
    }
    while(q-->0){
        reversed_stack.insert_element(stack.pop());
    }
    reversed_stack.print_stack();


    return 0;
}

*/
/*   node* prev=top;

   temp=top->next;
   if(temp){
   prev->next= nullptr;
   node* next;
   while(temp){
       next=temp->next;
       temp->next=prev;
       prev=temp;
       temp=next;
   }

   }
   */