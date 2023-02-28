//
// Created by selhatin on 17.1.2023.
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
    bool isEmpty(){
        return (top) != nullptr;
    }

};
int main() {
// write your code here
    string str;
    cin>>str;
    my_stack stack;
    bool cont= true;
    int temp_char;
    for (char c:str) {
        if(c=='{' )
        {
            stack.insert_element(1);





        }
       else if(c=='(')
        {
            stack.insert_element(2);
        }
        else if(c=='[')
        {
            stack.insert_element(3);
        }
        else{
            temp_char=stack.pop();

            if((c==']'  && temp_char ==3)||(c=='}'  && temp_char ==1)||(c==')'  && temp_char ==2)) continue;

            else{
                cout<<"false";
                cont= false;
                break;
            }

        }

    }
    if(cont)cout<<"true";

    return 0;
}

 */