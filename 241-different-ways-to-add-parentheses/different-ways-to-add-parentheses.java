class Solution {

    public List<Integer> solve(String s) {

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '+' || ch == '-' || ch == '*') {

                List<Integer> left = solve(s.substring(0, i));
                List<Integer> right = solve(s.substring(i + 1));

                for (int x : left) {

                    for (int y : right) {

                        if (ch == '+') {
                            ans.add(x + y);
                        } 
                        else if (ch == '-') {
                            ans.add(x - y);
                        } 
                        else {
                            ans.add(x * y);
                        }
                    }
                }
            }
        }

        if (ans.size() == 0) {
            ans.add(Integer.parseInt(s));
        }

        return ans;
    }

    public List<Integer> diffWaysToCompute(String s) {
        return solve(s);
    }
}