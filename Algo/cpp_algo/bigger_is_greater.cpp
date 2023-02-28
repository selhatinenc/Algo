//
// Created by selhatin on 28.1.2023.
//
#include <bits/stdc++.h>

using namespace std;

string ltrim(const string &);
string rtrim(const string &);

/*
 * Complete the 'biggerIsGreater' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING w as parameter.
 */
string biggerIsGreater(string w) {
    if (next_permutation(w.begin(), w.end())) return w;
    else return  "no answer";

}

string biggerIsGreater2(string w) {
    int n=w.length();
    bool cont= true;
    if(n==1)return  "no answer";;
    for (int i = 0; i <n-1 ; ++i) {
        if(w.at(i)<w.at(i+1)){
            cont= false;
            break;
        }
    }
    if(cont)return "no answer";
    int c=n-2;//smallest char between 1 and n -2
    int index_1=-1,index_2=n-1;
    for (int i = n-2; i>0 ; i--) {
        if(w[i]<w[n-2])c=i;

        if(w[i]<w[n-1]){
            index_1=i;
            break;
        }
    }
    if(index_1==-1&&w[0]<w[n-1])index_1=0;
    if(index_1 !=-1){
        char temp=w[n-1];
        cout<<w[index_1]<<endl;
        w[n-1]=w[index_1];
        w[index_1]=temp;
        cout<<w<<endl;

        sort(w.begin()+index_1+1,w.end());
        return w;
    }
    char temp=w[c];
    w.erase(w.begin()+c);
    sort(w.begin(),w.end());
    return temp+w;


}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    string T_temp;
    getline(cin, T_temp);

    int T = stoi(ltrim(rtrim(T_temp)));

    for (int T_itr = 0; T_itr < T; T_itr++) {
        string w;
        getline(cin, w);

        string result = biggerIsGreater(w);
        cout<<result;
        fout << result << "\n";
    }

    fout.close();

    return 0;
}

string ltrim(const string &str) {
    string s(str);

    s.erase(
            s.begin(),
            find_if(s.begin(), s.end(), not1(ptr_fun<int, int>(isspace)))
    );

    return s;
}

string rtrim(const string &str) {
    string s(str);

    s.erase(
            find_if(s.rbegin(), s.rend(), not1(ptr_fun<int, int>(isspace))).base(),
            s.end()
    );

    return s;
}
