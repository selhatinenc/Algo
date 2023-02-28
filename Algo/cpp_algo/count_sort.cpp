//
// Created by selhatin on 28.1.2023.
//
#include <bits/stdc++.h>

using namespace std;

string ltrim(const string &);
string rtrim(const string &);
vector<string> split(const string &);

/*
 * Complete the 'countSort' function below.
 *
 * The function accepts 2D_STRING_ARRAY arr as parameter.
 */

void countSort(vector<vector<string>> arr) {
    // unordered_set<string  >map;
    int max=0;
    for (auto & i : arr) {
        int temp=stoi(i[0]);
        //  cout<<temp<<endl;
        if(temp>max)max=temp;
    }
    // cout<<max<<endl;
    vector<vector<string>> ans(max+1);
    for (int i = 0; i < arr.size(); ++i) {
        //     cout<<::stoi(arr[i][0])<<endl;
        //   cout<<arr[i][1]<<endl;

        if (i < (arr.size() + 1) / 2) {
            ans[::stoi(arr[i][0])].emplace_back("-");
        } else {
            ans[::stoi(arr[i][0])].push_back(arr[i][1]);

        }
        //     map.insert(arr[i][1]+arr[i][0]);


    }
    for (auto & an : ans) {
        for (const auto & k : an) {
            cout << k << " ";

        }

    }
}
int main() {
    string n_temp;
    getline(cin, n_temp);

    int n = stoi(ltrim(rtrim(n_temp)));

    vector<vector<string>> arr(n);

    for (int i = 0; i < n; i++) {
        arr[i].resize(2);

        string arr_row_temp_temp;
        getline(cin, arr_row_temp_temp);

        vector<string> arr_row_temp = split(rtrim(arr_row_temp_temp));

        for (int j = 0; j < 2; j++) {
            string arr_row_item = arr_row_temp[j];

            arr[i][j] = arr_row_item;
        }
    }

    countSort(arr);

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

vector<string> split(const string &str) {
    vector<string> tokens;

    string::size_type start = 0;
    string::size_type end = 0;

    while ((end = str.find(" ", start)) != string::npos) {
        tokens.push_back(str.substr(start, end - start));

        start = end + 1;
    }

    tokens.push_back(str.substr(start));

    return tokens;
}
