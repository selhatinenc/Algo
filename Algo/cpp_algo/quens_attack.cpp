#include <bits/stdc++.h>

using namespace std;

string ltrim(const string &);
string rtrim(const string &);
vector<string> split(const string &);

/*
 * Complete the 'queensAttack' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER k
 *  3. INTEGER r_q
 *  4. INTEGER c_q
 *  5. 2D_INTEGER_ARRAY obstacles
 *  arr[i][0]=0;
        arr[i][1]=1;
 */
int inc_1(  int row,int col,int n){
    if(row !=0) return n-col+2;
    return 0;
}
int diagonal_sum(int a,int b,int r,int c);
int queensAttack(int n, int k, int r_q, int c_q, vector<vector<int>> obstacles) {
    int arr[8][2]={0};

    for (vector<int> vec:obstacles) {
        if(vec[0]<0||vec[0]>n||vec[1]<0||vec[1]>n)continue;

        if(r_q==vec[0]){
            if(vec[1]>arr[0][1]&&vec[1]<c_q){
                arr[0][0]=vec[0];
                arr[0][1]=vec[1];
            }
            else if((vec[1]<arr[1][1]||arr[1][1]==0)&&vec[1]>c_q){
                arr[1][0]=vec[0];
                arr[1][1]=vec[1];
            }
        }
        else   if(c_q==vec[1]){
            if(vec[0]>arr[2][0]&&vec[0]<r_q){
                arr[2][0]=vec[0];
                arr[2][1]=vec[1];
            }
            else if((vec[1]<arr[3][0]||arr[3][0]==0)&&vec[0]>r_q){
                arr[3][0]=vec[0];
                arr[3][1]=vec[1];
            }
        }
        else if(vec[0]+vec[1]==c_q+r_q){
            if((vec[0]<arr[4][0]||arr[4][0]==0)&&vec[0]>r_q){
                arr[4][0]=vec[0];
                arr[4][1]=vec[1];
            }
            else if(vec[0]>arr[5][0]&&vec[0]<r_q){
                arr[5][0]=vec[0];
                arr[5][1]=vec[1];
            }
        }
        else if(r_q-c_q==vec[0]-vec[1]){
            if(vec[1]>arr[6][1]&&vec[1]<c_q){
                arr[6][0]=vec[0];
                arr[6][1]=vec[1];
            }
            else if((vec[1]<arr[7][1]||arr[7][1]==0)&&vec[1]>c_q){
                arr[7][0]=vec[0];
                arr[7][1]=vec[1];
            }
        }
    }
    int obs_points=0;//closed points
    int diagonal_obs=0;//open diagonal points

    // for left horizontal
    n--;
    obs_points+=arr[0][1];
    //for right horizontal
    obs_points+= inc_1(arr[1][0],arr[1][1],n);
    // for down vertical
    obs_points+=arr[2][0];
    //for up vertical
    obs_points+= inc_1(arr[3][1],arr[3][0],n);
    //for left_up diagonal
    if(arr[4][0]!=0){
        diagonal_obs+= abs(arr[4][0]-r_q-1);

    }
    else diagonal_obs+= diagonal_sum(n+1,1,r_q,c_q);
    //for left_down diagonal

    if(arr[5][0]!=0){
        diagonal_obs+= abs(-arr[5][0]+r_q-1);
    }
    else
        diagonal_obs+= diagonal_sum(1,n+1,r_q,c_q);
    //for left_up diagonal
    if(arr[6][0]!=0){
        diagonal_obs+= abs(-arr[6][0]+r_q-1);
/*
 *
 * 4 3
4 1
3 1
4 2
3 2

4 3
1 1
1 2
2 1
2 2
 */
    }
    else
        diagonal_obs+= diagonal_sum(1,1,r_q,c_q);
    //for left_down diagonal
    if(arr[7][0]!=0){
        // cout<<diagonal_obs<<endl;

        diagonal_obs+= abs(-arr[7][0]+r_q+1);
        //    cout<<diagonal_obs<<endl;

    }
    else
        diagonal_obs+= diagonal_sum(n+1,n+1,r_q,c_q);
    cout<<diagonal_obs<<endl;
    cout<<obs_points<<endl;

    cout<<2*n-obs_points+diagonal_obs;
    return 2*n-obs_points+diagonal_obs;
}
int diagonal_sum(int a,int b,int r,int c){
    return min(abs(a-r), abs(b-c));
}
int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    string first_multiple_input_temp;
    getline(cin, first_multiple_input_temp);

    vector<string> first_multiple_input = split(rtrim(first_multiple_input_temp));

    int n = stoi(first_multiple_input[0]);

    int k = stoi(first_multiple_input[1]);

    string second_multiple_input_temp;
    getline(cin, second_multiple_input_temp);

    vector<string> second_multiple_input = split(rtrim(second_multiple_input_temp));

    int r_q = stoi(second_multiple_input[0]);

    int c_q = stoi(second_multiple_input[1]);

    vector<vector<int>> obstacles(k);

    for (int i = 0; i < k; i++) {
        obstacles[i].resize(2);

        string obstacles_row_temp_temp;
        getline(cin, obstacles_row_temp_temp);

        vector<string> obstacles_row_temp = split(rtrim(obstacles_row_temp_temp));

        for (int j = 0; j < 2; j++) {
            int obstacles_row_item = stoi(obstacles_row_temp[j]);

            obstacles[i][j] = obstacles_row_item;
        }
    }

    int result = queensAttack(n, k, r_q, c_q, obstacles);

    fout << result << "\n";

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
