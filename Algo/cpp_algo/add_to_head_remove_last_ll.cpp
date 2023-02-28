//
// Created by selhatin on 5.1.2023.
//
/*
 * #include <bits/stdc++.h>
using namespace std;


struct node{
    int data;
    node* next= nullptr;
    node* prev= nullptr;
};
class ll_list{
private:
    node* last= nullptr,*head= nullptr;

    node* temp;
    node* create_node(int data){
        node* newnode=new node;
        newnode->data=data;
        return  newnode;
    }
public:

    void insert_data(int data){
        node* newnode;
        if(!head){
            head= create_node(data);
            last=head;
            return;
        }
        newnode= create_node(data);
        last->next=newnode;
        newnode->prev=last;
        last=last->next;

    }
    void add_to_head(int data){
        node* newnode= create_node(data);
        newnode->next=head;
        head->prev=newnode;
        head=newnode;
        remove_last();
    }
    void remove_last(){
        node* n=last;
        last->prev->next= nullptr;
        last=last->prev;

        delete(n);
        n= nullptr;

    }
    void print_ll(){
        temp=head;
        while (temp){
            std::cout<<temp->data<<" ";
            temp=temp->next;
        }
    }
};

int main(){
    int n,m;
    cin>>n;
    ll_list ll;
    while(n-->0)
    {
        cin>>m;
        ll.insert_data(m);

    }
    cin>>m;
    ll.add_to_head(m);
    ll.print_ll();
    return 0;
}
 */