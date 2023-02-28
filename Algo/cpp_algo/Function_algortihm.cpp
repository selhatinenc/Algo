//
// Created by as_as on 15.12.2022.
//
#include <cmath>

#include <bits/stdc++.h>
using namespace std;
#define  ll  long long
 int MOD=1000000007;
int count_func_time=0;
int find_Advanced_reccurence(ll* arr_array,int n, ll* const coeffarr );
ll findf_n(int n,int* arrarray,int* coeeffarray);
ll find_fibbo(ll number,ll *fiboarray);

int decreaseindex(int x){
    x--;
    return (x<0)?50:x;
}
int increaseindex(int y){
    y++;
    return (y<50)?y:0;
}
/*
ll fiftyone_array(int myindex,int current,ll* arr,ll* const coeffarr,int count, int n){
    count++;
    if(count<n+1)
    {
        ll sum=0;
        for (int i = 0; i <50 ; ++i) {

            sum+=(arr[current]*coeffarr[i+1])%MOD;
            sum%=MOD;
            current= decreaseindex(current);
        }
        //cout<<"sum:"<<sum<<endl;
        arr[myindex]=sum;
        return fiftyone_array(increaseindex(myindex),current,arr,coeffarr,count,n);
    }
    if(myindex==0)myindex=50;
    else myindex--;
    return arr[myindex];



}
 */
double find_out_f_n(double x){
    return ((1/sqrt(5))* pow(((1+sqrt(5))/2),x))-((1/sqrt(5))* (pow(((1-sqrt(5))/2),x)));
}

int main(){
    double n;
    cin>>n;
    double x;//temp number
    double coeeffarray[51];// 50 number : 0 index if null
    int index=1;
    while (index<51){
        cin>>x;
        coeeffarray[index]=x;
        index++;
    }

    cout<< find_out_f_n(n);




    return  0;
}




    /*arrarray[1]=1;
    for (int i = 2; i <n+2 ; ++i) {
        arrarray[i]=0;
       // cout<<arrarray[i]<<endl;
    }

    cout<<find_Advanced_reccurence(arrarray,n,coeeffarray);
    cout<<findf_n(n,arrarray,coeeffarray);// answer
   // cout<<"Count:"<<count_func_time<<endl;




      ll arrarray[51];
    arrarray[0]=coeeffarray[1];

    for (int i = 1; i <52 ; ++i) {
        arrarray[i]=0;
        // cout<<arrarray[i]<<endl;
    }
 //
 //
 //
 //   cout<< fiftyone_array(1,0,arrarray,coeeffarray,0,n);









int find_Advanced_reccurence(ll* arr_array,int n, ll* const coeffarr ){
    ll ans=0;
    for (int i = 1; i <51 ; ++i) {
        if(n-i<0)break;
        ans+= (find_fibbo(n-i,arr_array)*coeffarr[i]);
        /*   cout<<"Coo eff:"<<coeffarr[i]<<endl;
           cout<<"fibbo of "<<n-i<<":"<< find_fibbo(n-i,arr_array)<<endl;
           cout<<"ans:"<<ans<<endl;
        // ans%=MOD;
    }
    return ans;
}



ll find_fibbo(ll number,ll *fiboarray){
    if(fiboarray[number]!=0){
        //  cout<<"fiboarray "<< number<<" :"<<fiboarray[number]<<endl;
        return fiboarray[number];
    }
    fiboarray[number]=(find_fibbo(number-2,fiboarray)+find_fibbo(number-1,fiboarray))%MOD;
    //  cout<<"fiboarray[number]:"<<fiboarray[number]<<endl;
    return fiboarray[number];
}

ll findf_n(int n,int* arrarray,int* coeeffarray){
    count_func_time++;
    if(n==0)return 1;
    ll sum=0;
    for (int i = 1; i <51 ; ++i) {

        if(n-i<0) break;
        else{
            //   cout<<"arrarray[n-i]:"<<arrarray[n-i]<<endl;
            if(arrarray[ n-i] ==-1){
                arrarray[n-i]= findf_n(n-i,arrarray,coeeffarray)%MOD;
            }
            sum+=(arrarray[n-i]*coeeffarray[i]);
        }

    }
    // cout<<"F="<<n<<" result:"<<sum<<endl;
    return sum;
}
*/