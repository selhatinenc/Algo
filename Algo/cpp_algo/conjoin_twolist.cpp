//
// Created by selhatin on 28.12.2022.
//
/*
 *
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
public:
    node *head= nullptr;
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
    void conjoin_twolist(node* sec_head){
        node* new_head= head;
        temp=head->next;
     //   new_head=head;
        temp_2=new_head;
        while(temp||sec_head){
            if(sec_head){
                temp_2->next=sec_head;
                temp_2=temp_2->next;
                sec_head=sec_head->next;
            }
            if(temp){
                temp_2->next=temp;
                temp_2=temp_2->next;
                temp=temp->next;
            }
        }
        temp=head;
        while(temp){
            cout<<temp->data<<" ";
            temp=temp->next;
        }
    }
};
int main(){
    ll_list first_list,sec_list;
    int n,m;
    cin>>n;
    cin>>m;
    string str;
    while(n-->0){
        cin>>str;
        first_list.insert_to_ll(str);
    }
    while(m-->0){
        cin>>str;
        sec_list.insert_to_ll(str);
    }
    first_list.conjoin_twolist(sec_list.head);


    return 0;
}


 */