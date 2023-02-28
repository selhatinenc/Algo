//
// Created by selhatin on 28.12.2022.
//
/*
 *
 * #include <bits/stdc++.h>
using namespace std;
struct node{
    int data;
    node* next= nullptr;
};
class ll_node{
private:
    node* head= nullptr;
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
            return;
        }
        newnode= create_node(data);
        if(data<head->data){
            newnode->next=head;
            head=newnode;
            return;
        }
        temp=head;
        while (temp->next &&data>temp->next->data){
            temp=temp->next;
        }
        newnode->next=temp->next;
        temp->next=newnode;

    }
    void print_ll(){
        temp=head;
        while (temp){
            std::cout<<temp->data<<" ";
            temp=temp->next;
        }
    }
};
void sorted_linked_list();
int main() {

    sorted_linked_list();

    return 0;
}

void sorted_linked_list(){
    ll_node ll_list;
    int n;
    int n_2;
    std::cin>>n;
    while(n-->0){
        cin>>n_2;
        ll_list.insert_data(n_2);
    }
    ll_list.print_ll();
}

 */