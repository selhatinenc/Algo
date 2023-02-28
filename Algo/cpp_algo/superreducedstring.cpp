#include <bits/stdc++.h>

using namespace std;

/*
 * Complete the 'superReducedString' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

string superReducedString(string s) {
    stack<char> stack;
    for (char c:s) {
        if(stack.empty()||stack.top()!=c){
            //  cout<<"ss";
            stack.push(c);
        }
        else stack.pop();
    }
    string ans;
    while(!stack.empty()){
        //cout<<ans;
        ans+=stack.top();
        stack.pop();
    }
    if(ans.empty()) return "Empty String";
    for (int i = 0; i < ans.size() / 2; i++)
        swap(ans[i], ans[ans.size() - i - 1]);
    return ans;
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    string s;
    getline(cin, s);

    string result = superReducedString(s);

    fout << result << "\n";

    fout.close();

    return 0;
}
