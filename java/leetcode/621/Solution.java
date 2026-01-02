import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

class Obj {
    char key;
    int remains;
    int gap;
    int n;

    Obj(char key, int remains, int gap) {
        this.key = key;
        this.remains = remains;
        this.gap = gap;
        this.n = gap;
    }
}

class ObjComparator implements Comparator<Obj> {
    @Override
    public int compare(Obj o1, Obj o2) {
        if (o1.gap >= o1.n && o2.gap >= o2.n) {
            return o2.remains - o1.remains;
        } else {
            return o2.gap - o1.gap;
        }
    }
}

class Solution {
    public int leastInterval(char[] tasks, int n) {
        int result = 0;
        PriorityQueue<Obj> pQ = new PriorityQueue<>(new ObjComparator());
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < tasks.length; i++) {
            if (map.containsKey(tasks[i])) {
                int remains = map.get(tasks[i]);
                map.replace(tasks[i], ++remains);
            } else {
                map.put(tasks[i], 1);
            }
        }

        Character[] keySet = map.keySet().toArray(new Character[0]);
        for (char key : keySet) {
            pQ.add(new Obj(key, map.get(key), n));
        }

        /**
         * 0 -> 놓은 적 없음 놔도됨!
         * 0 < < n -> 안됨 더 가야함
         * n <= 놓아도됨 단 놓고 1로 가야함
         * n + 1 놓아진게 없는거
         */

        while (pQ.size() != 0) {
            result++;
            Obj currObj = pQ.poll();

            if (currObj.gap >= n) {
                currObj.gap = -1;
                currObj.remains--;
                // cursor = (cursor + 1) % map.size();
            } else if (currObj.gap >= 0) {
                // currObj.gap++;
            }

            if (currObj.remains != 0) {
                pQ.add(currObj);
            }

            int currSize = pQ.size();
            PriorityQueue<Obj> tmpPQ = new PriorityQueue<>(new ObjComparator());
            for (int j = 0; j < currSize; j++) {
                Obj tmpObj = pQ.poll();
                if (tmpObj.gap != n) {
                    tmpObj.gap++;
                }
                tmpPQ.add(tmpObj);
            }
            pQ = tmpPQ;
        }

        return result;
    }
}