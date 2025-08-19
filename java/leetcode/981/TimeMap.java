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
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) {
            return "";
        }

        List<Data> datas = map.get(key);
        String result = "";

        int maxTimestamp = Integer.MIN_VALUE;
        for (Data data : datas) {
            if (data.timestamp <= timestamp && data.timestamp > maxTimestamp) {
                maxTimestamp = data.timestamp;
                result = data.value;
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