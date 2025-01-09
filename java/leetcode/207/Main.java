import java.util.*;

public class Main {
}

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer, HashSet<Integer>> preHashMap = new HashMap<>();
        boolean[] checked = new boolean[numCourses];

        if (prerequisites.length < 2) {
            return true;
        }

        for (int[] prerequisite : prerequisites) {
            if (preHashMap.containsKey(prerequisite[0])) {
                HashSet<Integer> prerequisiteSet = preHashMap.get(prerequisite[0]);
                prerequisiteSet.add(prerequisite[1]);
            } else {
                HashSet<Integer> prerequisiteSet = new HashSet<>();
                prerequisiteSet.add(prerequisite[1]);
                preHashMap.put(prerequisite[0], prerequisiteSet);
            }
        }

        // // print hashmap
        // for (Map.Entry<Integer, HashSet<Integer>> entry : preHashMap.entrySet()) {
        // System.out.println(entry.getKey() + " : " + entry.getValue());
        // }

        for (int[] prerequisite : prerequisites) {
            if (!checkPossiblity(preHashMap, checked, numCourses, prerequisite[0]))
                return false;
            System.out.println("Print check");
            for (boolean check : checked) {
                System.out.println(check);
            }
        }

        return true;
    }

    // Check cycle
    static boolean checkPossiblity(HashMap<Integer, HashSet<Integer>> prerequisite, boolean[] checked, int numCourses,
            int initCourse) {
        Queue<Status> queue = new LinkedList<>();
        boolean[] visited = new boolean[numCourses];
        Status initial = new Status(initCourse, visited);
        queue.add(initial);

        System.out.println("initCourse : " + initCourse);

        while (!queue.isEmpty()) {
            Status curr = queue.poll();
            int currIdx = curr.id;
            boolean[] currVisited = curr.visited;
            System.out.println("currIdx : " + currIdx);

            if (currVisited[currIdx])
                continue;
            currVisited[currIdx] = true;

            if (!prerequisite.containsKey(currIdx))
                continue;

            for (int course : prerequisite.get(currIdx)) {
                if (currVisited[course] && !checked[course]) {
                    System.out.println("return false at " + course);
                    return false;
                } else if (!currVisited[course] && !checked[course]) {
                    System.out.println("add " + course);
                    boolean[] newVisited = currVisited.clone();
                    queue.add(new Status(course, newVisited));
                } else
                    continue;
            }
        }
        checked[initCourse] = true;

        return true;
    }
}

class Status {
    public int id;
    public boolean[] visited;

    Status(int id, boolean[] visited) {
        this.id = id;
        this.visited = visited;
    }
}