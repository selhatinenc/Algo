//
// Created by selhatin on 31.1.2023.
//
//
// Created by selhatin on 31.1.2023.
//
#include <bits/stdc++.h>

using namespace std;

/*
 * Complete the 'commonChild' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. STRING s1
 *  2. STRING s2
 */

int commonChild(string s1, string s2) {
    int l1=s1.length()+1;
    int l2=s2.length()+1;
    int arr[l1][l2];
    for (int i = l1-1; i >=0 ; i--) {
        for (int j = l2-1; j>=0 ; j--) {
            arr[i][j]=0;
        }
    }

    for (int i = l1-2; i >=0 ; i--) {
        for (int j = l2-2; j>=0 ; j--) {
            if(s1[i]==s2[j])arr[i][j]=1+arr[i+1][j+1];
            else arr[i][j]=max(arr[i+1][j],arr[i][j+1]);
        }
    }
    return arr[0][0];
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    string s1;
    getline(cin, s1);

    string s2;
    getline(cin, s2);

    int result = commonChild(s1, s2);

    fout << result << "\n";

    fout.close();

    return 0;
}
