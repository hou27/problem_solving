import java.util.*;

class TimeMap {
    private Map<String, List<Data>> map;

    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }
        map.get(key).add(new Data(timestamp, value));
        Collections.sort(map.get(key), (a, b) -> Integer.compare(a.timestamp, b.timestamp));
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) {
            return "";
        }

        List<Data> datas = map.get(key);
        String result = "";

        int left = 0;
        int right = datas.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (datas.get(mid).timestamp <= timestamp) {
                result = datas.get(mid).value;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    private class Data {
        int timestamp;
        String value;

        public Data(int timestamp, String value) {
            this.timestamp = timestamp;
            this.value = value;
        }
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */