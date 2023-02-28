#include <iostream>
#define ISFULL(p) (!p)
#define ISEMPTY(p) (!p)
#define MAX_QUEUE 10 // size of queue

typedef struct {
    int value;
    std::string name;

}item;
struct  queue{
    item x;
    queue* next;
};
typedef queue* QUEUE_PTR;
QUEUE_PTR Front[MAX_QUEUE],Rear[MAX_QUEUE];



void Add_Queue(QUEUE_PTR front,QUEUE_PTR rear){
    QUEUE_PTR temp=new queue;
    if(ISFULL(temp)){
        std::cout<< "Memory Allocation ERROR!!!"<<std::endl;
        return;
    }
    if(front)
        rear->next=temp;
    else
        front=temp;
    rear=temp;

}
item remove_Queue(QUEUE_PTR front){
    if(ISEMPTY(front))
    {
        std::cout<<"List is Empty"<<std::endl;
        exit(1);
    }
    QUEUE_PTR temp=front;
    item deleteitem=front->x;
    front=front->next;
    delete(temp);
    return deleteitem;
}
int main() {
    QUEUE_PTR temp=new queue;

    for (int i = 0; i <MAX_QUEUE ; ++i) {
        Front[i]= nullptr; Rear[i]= nullptr;
    }

    std::cout << "Hello, World!" << std::endl;
    return 0;
}


