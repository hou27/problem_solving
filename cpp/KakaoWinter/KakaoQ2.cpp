#include <string>
#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

vector<int> solution(string s) {
    vector<int> answer;
    string tmp;
    
    int cnt[100000] = {[0 ... 99999] = 0};
    
    vector<pair<int, int>> pairV;
    
    for(auto c : s){
        if(c-0 > 47 && c-0 < 58) {
            cout << c << endl;
            tmp += c;
        }
        else if(tmp.length()) {
            cout << "here it is ::: " << stoi(tmp) << endl;
            cnt[stoi(tmp)-1]++;
            tmp = "";
        }
    }
    
    for(int i = 0; i < 100000; i++){
        if(cnt[i]){
            pairV.push_back({cnt[i],i + 1});
        }
    }
    
    sort(pairV.begin(), pairV.end());	// sort함수는 algorithm헤더파일을 삽입 후 사용 가능. 기본적으로 pair의 왼쪽 값으로 정렬되며, 3번째 인자로 사용자 정의 함수를 넘겨주어 다른 방식으로 정렬 또한 가능하다.
    reverse(pairV.begin(), pairV.end());	// reverse함수는 algorithm헤더파일을 삽입 후 사용 가능.
    
    for(auto element : pairV){	// auto
        answer.push_back(element.second);
    }
    
    return answer;
}