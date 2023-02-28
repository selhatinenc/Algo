//
// Created by as_as on 6.12.2022.
//
//
// Created by as_as on 6.12.2022.
//
#include <bits/stdc++.h>

using namespace std;
int isbinarysearch();
int distributethejellies();
bool cmp(pair<int,int>& first,pair <int,int>& sec);
#define  ll  long long

void reducearraysize(){
    int n;
    cin>>n;
    unordered_map<int,int> hashmap;
    //vector<int,int> vector;
    int index=0;
    int number;
    while (index++<n){
        cin>>number;
        hashmap[number]++;
       // cout<<hashmap[number]<<endl;
    }

    vector<pair<int,int>> sortvector;
    for (auto& x:hashmap){
        sortvector.push_back(x);
    }
    sort(sortvector.begin(),sortvector.end(), cmp);
    int contnum=n/2;
    int ans=0;
    int sum=0;
    if(n%2!=0)contnum++;

    for (auto& it : sortvector) {
        if(sum<contnum){
            sum+=it.second;
            ans++;
        }
        else break;
    }
    cout<<ans;



}



int main() {
    string fstr,sstr;
    cin>>fstr;
    cin>> sstr;
    int count = 0;
    char bytes[UCHAR_MAX + 1] = { 0 };
    char s1[100] = fstr;
    char s2[100] = sstr;

    for (int i = 0; s1[i] != '\0'; i++)
        bytes[(unsigned char)s1[i]] = 1;

    for (int j = 0; s2[j] != '\0'; j++)
    {
        int k = (unsigned char)s2[j];
        if (bytes[k] == 1)
        {
            bytes[k] = 0;
            count++;
        }
    }

    printf("%d\n",count);

    return 0;
}



bool cmp(pair<int,int>& first,pair <int,int>& sec){
    return first.second>sec.second;
}


void doit(){
    //int* arr=new int[100000];
    int y=0;
    for (int i = 0; i <10 ; ++i) {
        for (int j = 0; j <10000 ; ++j) {
            if(y<10000)y++;
            else{
                y=0;
            }


        }
    }
}
void doitfortry(){
    // int* arr=new int[100000];
    int y=0;
    for (int i = 0; i <10 ; ++i) {
        for (int j = 0; j <10000 ; ++j) {
            try{
                y++;
            }
            catch (runtime_error) {
                y=0;
            }


        }
    }
}
/*
 * // std::cout << "Hello, World!" << std::endl;

  //  auto start = chrono::steady_clock::now();
   time_t start, end, duration;
    puts ("DECODING DATA:");
    start = time (0);
// for milliseconds, use using ms = std::chrono::duration<double, std::milli>;
  //   auto before = clock::now();

    //doit();
    doitfortry();

      end = time (0);
    duration = end - start;
    printf ("DECODING TIME = %d\n", duration);

//    auto end = chrono::steady_clock::now();
    //std::cout<<"here\n";
   // std::cout << "It took  " << duration.count() << "ms" << std::endl;
/*
 *      before = clock::now();

    doit();
    //doitfortry();

    duration = clock::now() - before;

//    auto end = chrono::steady_clock::now();
    //std::cout<<"here\n";
    std::cout << "It took for :" << duration.count() << "ms" << std::endl;
 */


void mergesortarray(ll* llvector,ll left, ll right){
    if(left<right){
        ll  middle=left+(right-left)/2 ;  //left+(right-left)/2 == right+(left - right)/2
        mergesortarray(llvector,left,middle);
        mergesortarray(llvector, middle+1,right);

        vector<ll> leftvector;
        vector<ll> rightvector;
        for(ll i=left; i<middle+1;i++)leftvector.push_back(llvector[i]);
        for(ll i=middle+1; i<right+1;i++)rightvector.push_back(llvector[i]);

        ll left_Index=0;
        ll right_Index=0;
        ll index=left;
        while (index<right+1){
            if((right_Index>=rightvector.size()) || (left_Index<leftvector.size()&& leftvector[left_Index]< rightvector[right_Index])){
                llvector[index]=leftvector[left_Index];
                left_Index++;
            }

            else {
                llvector[index]=rightvector[right_Index];
                right_Index++;
            }

            index++;
        }

    }
}
void mergesort(vector<ll>& llvector,ll left, ll right){ // for vector
    if(left<right){
        ll  middle=left+(right-left)/2 ;  //left+(right-left)/2 == right+(left - right)/2
        mergesort(llvector,left,middle);
        mergesort(llvector, middle+1,right);

        vector<ll> leftvector;
        vector<ll> rightvector;
        for(ll i=left; i<middle+1;i++)leftvector.push_back(llvector[i]);
        for(ll i=middle+1; i<right+1;i++)rightvector.push_back(llvector[i]);

        ll left_Index=0;
        ll right_Index=0;
        ll index=left;
        while (index<right+1){
            if((right_Index>=rightvector.size()) || (left_Index<leftvector.size()&& leftvector[left_Index]< rightvector[right_Index])){
                llvector[index]=leftvector[left_Index];
                left_Index++;
            }

            else {
                llvector[index]=rightvector[right_Index];
                right_Index++;
            }

            index++;
        }

    }
}
int distributethejellies(){
    int person,jellies;

    cin>>person;
    cin>>jellies;

    ll* personarray;
    personarray=new ll[person];

    ll* jelliesarray;
    jelliesarray=new ll[jellies];


    int i=0;
    while(i<person){
        cin>>personarray[i];
        i++;
    }

    i=0;

    while(i<jellies){
        cin>>jelliesarray[i];
        i++;
    }


    mergesortarray(personarray,0,person-1);
    mergesortarray(jelliesarray,0,jellies-1);
    int ans=0;
    int jelliesindex=jellies-1;
   // bool  end;
    for (int j = person-1; j >=0 ; --j) {
       // end= false;
        for (int k =jelliesindex ; k >=0 ; --k) {
            if(personarray[j]>=jelliesarray[k]){
                ans++;
               // end= true;
                jelliesindex=k-1;
                break;
            }
        }
       // if(end) return ans;
    }
    return  ans;
}
int isbinarysearch(){
    int index=0;
    int row,column;
    cin>>row;
    cin>>column;
    int ans=0;
    int number;
    while(index++<(row*column)){
        cin>>number;
        if(number>0)ans++;
    }
    cout<<ans;
    return ans;
}
void string_a_b(){
    //cout<<"Hellow me!!"<<endl;
    unordered_set<char> hashset;
    string firststr;
    cin>>firststr;
    for (char c:firststr){
        hashset.insert(c);
    }
    string secstr;
    cin>>secstr;
    if(firststr.empty() ||firststr==" "){
        cout<<secstr.at(0);
        return;
    }
    for (char c:firststr){
        if(hashset.find(c)==hashset.end()){
            cout<<c;
            break;
        }
    }


}
