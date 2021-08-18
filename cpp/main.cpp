#include <string>
#include <vector>
#include <stack>
#include <iostream>

using namespace std;

void showAll(stack<int> s) {
    while (!s.empty()) {
        cout << s.top() << ' ';
        s.pop();
    }
}

int solution(vector<vector<int>> board, vector<int> moves) {
    
    int answer = 0;
    stack<int> basket;
    
    for(int l = 0; l < moves.size(); l++) {
        int location = moves[l] - 1;
        for(int i = 0; i < board.size(); i++) {
            
            if(board[i][location] != 0) {
                cout << board[i][location] << endl;
                if(!basket.empty() && basket.top() == board[i][location]) {
                    cout << "stack ";
                    showAll(basket);
                    basket.pop();
                    answer += 2;
                    continue;
                }
                else {
                    cout << "input "<<board[i][location] << endl;
                    basket.push(board[i][location]);
                }
                    
                board[i][location] = 0;
            }
        }
    }
	
    return answer;
}