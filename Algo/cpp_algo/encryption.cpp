//
// Created by selhatin on 28.1.2023.
//
#include <bits/stdc++.h>

using namespace std;

/*
 * Complete the 'encryption' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */
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
string remove_spaces(const string &s)
{
    int last = s.size() - 1;
    while (last >= 0 && s[last] == ' ')
        --last;
    return s.substr(0, last );
}
string encryption(string s) {
    int row= ::sqrt(s.length());
    int col=row;
    if(row*col!=s.length()){
        col++;
        row=((row*col)>=s.length())?row:row+1;
    }

    string ans="";

    for (int i = 0; i <col ; ++i) {
        for (int j = 0; j <row ; ++j) {
            if(j*col+i>s.length()-1);
            ans+=s[j*col+i];
        }
        if(i!=col-1)
            ans+=" ";
    }
    cout<<ans;
    /*
     * for (int i = 0; i <s.length() ; i++) {
        cout<<s[i];
        ans+=s[i];
        if((i+1)%col==0){
            ans+="\n";
            cout<<endl;
        }
    }
     */
    return ans;

}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    string s;
    getline(cin, s);

    string result = encryption(s);

    fout << result << "\n";

    fout.close();

    return 0;
}
