//
// Created by selhatin on 28.12.2022.
//
/*
 * #include <bits/stdc++.h>
using namespace std;
struct node{
    string data;
    node* next= nullptr;
};
class ll_list{
private:
    node* temp,*temp_2;
    node* create_node(const string& data){
        node* newnode=new node;
        newnode->data=data;
        return newnode;
    }
    node *head= nullptr;
    void reverse_ll(node* curr_node){
        if(curr_node->next&&!curr_node->next->next){
            head=curr_node->next;
            head->next=curr_node;
            return;
        }
        if(!curr_node->next){
            return;
        }
        reverse_ll(curr_node->next);
        curr_node->next->next=curr_node;
        curr_node->next= nullptr;
    }
public:
    void insert_to_ll(string data){
        if(!head){
            head= create_node(data);
            return;
        }
        node* newnode= create_node(data);
        temp=head;
        while(temp->next)temp=temp->next;
        temp->next=newnode;

    }
    void reverse_ll(){
        if(head)
        reverse_ll(head);
    }
    void print_ll(){
        temp=head;
        while (temp){
            cout<<temp->data<<" ";
            temp=temp->next;
        }

    }


};
int main(){
    ll_list ll;
    int n;
    cin>>n;
    string str;
    while(n-->0){
        cin>>str;
        ll.insert_to_ll(str);
    }
    ll.reverse_ll();
    ll.print_ll();


    return 0;
}


 */