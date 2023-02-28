#include <bits/stdc++.h>
using namespace std;
#define  ll  long long
ll MOD=1000000007;
int doit();
int binarySearch(int arr[], int l, int r, int x);
int main() {
    cout<<    doit();
    std::cout << "Hello, World!" << std::endl;
    return 0;
}


// A recursive binary search function. It returns
// location of x in given array arr[l..r] is present,
// otherwise -1
int binarySearch(vector<int> arr, int l, int r, int x,int size)
{
    if (r >= l) {
        int mid = l + (r - l) / 2;

        // If the element is present at the middle
        // itself
        if (arr[mid] == x)
            return mid;

        // If element is smaller than mid, then
        // it can only be present in left subarray
        if (arr[mid] > x)
            return binarySearch(arr, l, mid - 1, x,size);

        // Else the element can only be present
        // in right subarray
        return binarySearch(arr, mid + 1, r, x,size);
    }
    else {
        if(l<0)return -1;
        else if(arr[l]>x&&l<size)return l-1;
        else if(l>=size) return -1;
        return l;
    }

    // We reach here when element is not
    // present in array
    return -1;
}
int doit(){
    int n;
    cin>>n;
    vector<int> z;
    vector<int> e;
    vector<int> r;
    vector<int> o;
    char c;
    int index=0;
    int z_index = 0, e_index = 0, r_index = 0, o_index = 0;
    while(n-->0){
        cin>>c;
        if(c=='z')z.push_back(index++);
        else if(c=='e')e.push_back(index++);
        else if(c=='r')r.push_back(index++);
        else if(c=='o')o.push_back(index++);


    }
    int ans=0;


    for (int x:z){

        for (int i = binarySearch(e,0,e.size()-1,x,e.size()); i <e.size() ; ++i) {
            if(i==-1)break;
            for (int j = binarySearch(r,0,r.size()-1,e.at(i),r.size()); j <r.size() ; ++j) {
                if(j==-1)break;

                for (int k = binarySearch(o,0,o.size()-1,r.at(j),o.size()); k <o.size() ; ++k) {
                    if(k==-1)break;

                    ans++;
                }
            }
        }

    }



    return  ans;
}
