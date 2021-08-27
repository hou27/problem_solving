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
    
    sort(pairV.begin(), pairV.end());
    reverse(pairV.begin(), pairV.end());
    
    for(auto element : pairV){
        answer.push_back(element.second);
    }
    
    return answer;
}