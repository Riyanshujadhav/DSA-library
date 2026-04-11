public class _1678_leetcode {
    public String interpret(String command) {
    StringBuilder ans = new StringBuilder();
    for (int i = 0; i < command.length(); ) {
        if (command.charAt(i) == 'G') {
            ans.append("G");
            i++;
        }
        else if (i + 1 < command.length() && command.substring(i, i + 2).equals("()")) {
            ans.append("o");
            i += 2;
        }
        else if (i + 3 < command.length() && command.substring(i, i + 4).equals("(al)")) {
            ans.append("al");
            i += 4;
        }
    }
    return ans.toString();
    }
}
