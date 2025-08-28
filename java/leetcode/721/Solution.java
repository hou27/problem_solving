import java.util.*;

class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        List<List<String>> output = new ArrayList<>();
        Map<String, Set<String>> graph = new HashMap<>();
        Map<String, String> emailToName = new HashMap<>();

        for (List<String> account : accounts) {
            String name = account.get(0);
            for (int i = 1; i < account.size(); i++) {
                String email = account.get(i);
                emailToName.put(email, name);
                graph.putIfAbsent(email, new HashSet<>());

                if (i > 1) { // 양방향 연결 추가
                    graph.get(account.get(i - 1)).add(email);
                    graph.get(email).add(account.get(i - 1));
                }
            }
        }

        // DFS
        Set<String> visited = new HashSet<>();
        for (String email : emailToName.keySet()) {
            if (!visited.contains(email)) {
                List<String> component = dfs(graph, email, visited);
                Collections.sort(component); // 정렬
                component.add(0, emailToName.get(email)); // 앞에 이름 추가
                output.add(component);
            }
        }

        return output;
    }

    private List<String> dfs(Map<String, Set<String>> graph, String email, Set<String> visited) {
        Stack<String> stack = new Stack<>();
        List<String> component = new ArrayList<>();
        stack.push(email);

        while (!stack.isEmpty()) {
            String currEmail = stack.pop();
            if (visited.contains(currEmail)) {
                continue;
            }
            visited.add(currEmail);
            component.add(currEmail);
            for (String neighbor : graph.get(currEmail)) {
                if (!visited.contains(neighbor)) {
                    stack.push(neighbor);
                }
            }
        }

        return component;
    }
}