#include<iostream>
#include<sstream>
#include<string>
#include<vector>

using namespace std;

vector<string> split(string input, char delimiter);

/**
  문자열을 다룰 때 유용하게 사용 가능한 Class입니다.

  1) istringstream

    - 문자열 포맷을 parsing 할 때 사용합니다.

  2) ostringstream

    - 문자열 format을 조합하여 저장할 때 사용합니다.

  3) stringstream

    - 문자열에서 내가 원하는 자료형의 데이터를 추출할 때 사용합니다.
 */

int main() {
  string name;
  cout << "What is your name? ";
  getline(cin, name);
  cout << "Hello " << name << ", nice to meet you.\n";

  // stringstream 은 마치 문자열을 입력 스트림으로 생각하게 해줍니다.
  istringstream input;
  input.str("1\n2\n3\n4\n5\n6\n7\n");
  int sum = 0;
  for (string line; getline(input, line);) {
    cout << line << endl;
    sum += stoi(line);
  }
  cout << "\nThe sum is: " << sum << "\n";
}

vector<string> split(string input, char delimiter) {
    vector<string> result;
    stringstream ss(input);
    string tmp;
 
    while (getline(ss, tmp, delimiter)) {
        result.push_back(tmp);
    }
 
    return result;
}