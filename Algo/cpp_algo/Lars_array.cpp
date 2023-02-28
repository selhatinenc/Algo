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
int count_child(string s1 ,string s2){
    int count=0;
    map<char,queue<int>> map;
    for (int i = 0; i <s1.size() ; ++i) {
        map[s1[i]].push(i);
        // index of char is pushed
    }
    queue<int> temp;
    int min_index=-1;
    for (int i = 0; i <s2.size() ; ++i) {
        temp=map[s2[i]];
        if(!temp.empty()&&i>min_index&&s2[i]==temp.front()){
            count++;
            min_index=i;
            temp.pop();
        }
    }
    return count;
}
int commonChild(string s1, string s2) {
    return max(count_child(s1,s2), count_child(s2,s1));
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
