#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int solution(int n, vector<vector<int>> costs) {
    int answer = 0;
    vector<int> parent(n, 0); // 부모 노드를 저장할 배열 (Union-Find)

    // kruskal's Algorithm을 사용하기 위해 비용을 오름차순으로 정렬
    sort(costs.begin(), costs.end(), [](vector<int> a, vector<int> b) {
        return a[2] < b[2];
    });

    // 부모 노드를 자기 자신으로 초기화
    for (int i = 0; i < n; i++) {
        parent[i] = i;
    }

    for (int i = 0; i < costs.size(); i++) {
        int source = costs[i][0];
        int target = costs[i][1];
        int cost = costs[i][2];

        // union find를 통해 사이클이 발생하지 않는 경우인지 체크
        if (parent[source] != parent[target]) {
            int tmp = parent[target];
            // target의 부모 노드를 전부 source의 부모 노드로 변경
            for (int j = 0; j < n; j++) {
                if (parent[j] == tmp) {
                    parent[j] = parent[source];
                }
            }
            answer += cost;
        }
    }

    return answer;
}