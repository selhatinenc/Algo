//
// Created by selhatin on 17.1.2023.
//
#include <bits/stdc++.h>
using namespace std;

string strings[3]; // define max string


/*
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

void fizzBuzz(int n) {
    for (int i = 0; i <n ; ++i) {
        if(i%3==0)cout<<"Fizz";
        if(i%5==0)cout<<"Buzz";
        else if(i%3!=0)cout<<i;

    }
}
int len(string str)
{
    int length = 0;
    for (int i = 0; str[i] != '\0'; i++)
    {
        length++;

    }
    return length;
}

// create custom split() function
void split (string str, char seperator)
{
    int currIndex = 0, i = 0;
    int startIndex = 0, endIndex = 0;
    while (i <= len(str))
    {
        if (str[i] == seperator || i == len(str))
        {
            endIndex = i;
            string subStr = "";
            subStr.append(str, startIndex, endIndex - startIndex);
            strings[currIndex] = subStr;
            currIndex += 1;
            startIndex = endIndex + 1;
        }
        i++;
    }
}
string timeConversion(string s) {
    string ans;
    string h;
    int hour;
    if(s.c_str()[8]=='A'){

        ans=s.substr(0,8);
        split(ans,':');
        hour= ::atoi( strings[0].c_str());
        //  cout<<"hour:"<<hour<<endl;
//        cout<<ans<<endl;
        if(hour==12){
            h="00";
        }
        else h= to_string(hour);
        ans=ans.substr(2,8);
        ans=h+ans;

        //cout<<"yep!\n";
    }
    else{
        //cout<<"yep!\n";


        ans=s.substr(0,8);
        split(ans,':');
        hour= ::atoi( strings[0].c_str());
        hour=hour+12;
        if(hour==12){
            h="00";
        }
        else h= to_string(hour);
        ans=ans.substr(2,8);
        ans=h+ans;

    }

    cout<<ans<<endl;

    return ans;
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    string s;
    getline(cin, s);

    string result = timeConversion(s);

    fout << result << "\n";

    fout.close();

    return 0;
}
