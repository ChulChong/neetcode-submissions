class Solution {
    public String encode(List<String> strs) {
        if (strs.isEmpty())
            return "\u0000";
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        if (str.equals("\u0000"))
            return new ArrayList<String>();
        List<String> list = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = str.indexOf("#", i);
            int len = Integer.parseInt(str.substring(i, j));
            list.add(str.substring(j + 1, j + 1 + len));
            i = j + 1 + len;
        }
        return list;
    }
}
