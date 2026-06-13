class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hm = new HashMap<>();
        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String str = new String(arr);
            if (hm.containsKey(str)) {
                hm.get(str).add(s);
            } else {
                hm.put(str, new ArrayList<>(Arrays.asList(s)));
            }
        }
        return new ArrayList<>(hm.values());
    }
}
