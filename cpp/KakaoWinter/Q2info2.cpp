#include<iostream>
#include<string>
#include <algorithm> //need this
using namespace std;

// 사용자 정의 함수
bool compare(const pair<int, int>&a, const pair<int, int>&b){
	return a.second < b.second;
}

int main(void) {
    // 기본적으로 vector<pair<int, int» 는 sort 함수 사용 시 first 값을 기준으로 정렬

	// compare 함수를 정의하여 pair의 두 번째를 기준으로 정렬하게 바꾸는 방법
	vector<pair<int, int> vecs;
	
	// ......pair vector 초기화 후
	
	sort(vecs.begin(), vecs.end(), compare);
	// 위와 같이 sort 함수의 세 번째 인자에 정의한 함수명을 넣어서 사용
}


//출처: https://chanhuiseok.github.io/posts/algo-52/