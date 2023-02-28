//
// Created by selhatin on 31.1.2023.
//
#include <bits/stdc++.h>

using namespace std;

string ltrim(const string &);
string rtrim(const string &);
vector<string> split(const string &);

void dorotation(vector<vector<int>>& matrix,int x_index, int y_index, int row, int col, int r);
/*
 * Complete the 'matrixRotation' function below.
 *
 * The function accepts following parameters:
 *  1. 2D_INTEGER_ARRAY matrix
 *  2. INTEGER r
 *  1
 *


  1 2
  3 4

  1 2 3
  4 5 6

  1 2
  3 4
  5 6

  1 2 3 4
  5 6 7 8
  9 a b c
  d e f g

  1 2 3 4 f g
  5 6 7 8 f g
  9 a b c f g
  d e f g f g
  9 a b c f g
  d e f g f g

  uzakl?k form?l =4x-4
  */

void matrixRotation(vector<vector<int>> matrix, int r) {
    int row=matrix.size(),col=matrix[0].size();
    int nofcircum=min(row,col)/2;
    int x_index=0,y_index=0;
    while(nofcircum-->0){
        //cout<<nofcircum<<endl;
        dorotation(matrix,x_index,y_index,row,col,r);
        row=row-2;
        col=col-2;
        x_index++;
        y_index++;
    }
    for (auto& vec:matrix) {
        for (auto& i:vec) {
            cout<<i<<" ";
        }
        cout<<endl;
    }
}

void dorotation(vector<vector<int>>& matrix,int x_index, int y_index, int row, int col, int r) {
    int all_cell_in_circum=2*(col+row)-4;
    r%=all_cell_in_circum;
    int temp;
    //x_temp=x_index,y_temp=y_index;
    while(r-->0){
        //  cout<<matrix[x_index][y_index];

        temp=matrix[x_index][y_index];
        int count=x_index+row-1;


        while(x_index!=count){
            x_index++;                       swap(temp,matrix[x_index][y_index]);


        }
        count=y_index+col-1;
        while(y_index!=count){
            ++y_index;

            swap(temp,matrix[x_index][y_index]);
        }
        count=x_index-(row-1);
        while(x_index!=count){
            --x_index;
            swap(temp,matrix[x_index][y_index]);

            //swap(matrix[++x_index][temp],matrix[x_index][y_index]);
        }
        count=y_index-(col-1);
        while(y_index!=count){
            --y_index;
            swap(temp,matrix[x_index][y_index]);

            // swap(matrix[x_index][temp],matrix[x_index][--y_index]);
        }
    }
}

int main()
{
    string first_multiple_input_temp;
    getline(cin, first_multiple_input_temp);

    vector<string> first_multiple_input = split(rtrim(first_multiple_input_temp));

    int m = stoi(first_multiple_input[0]);

    int n = stoi(first_multiple_input[1]);

    int r = stoi(first_multiple_input[2]);

    vector<vector<int>> matrix(m);

    for (int i = 0; i < m; i++) {
        matrix[i].resize(n);

        string matrix_row_temp_temp;
        getline(cin, matrix_row_temp_temp);

        vector<string> matrix_row_temp = split(rtrim(matrix_row_temp_temp));

        for (int j = 0; j < n; j++) {
            int matrix_row_item = stoi(matrix_row_temp[j]);

            matrix[i][j] = matrix_row_item;
        }
    }

    matrixRotation(matrix, r);

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
