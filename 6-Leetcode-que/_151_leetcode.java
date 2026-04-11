public class _151_leetcode {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
    StringBuilder j = new StringBuilder();

    for (int i = s.length() - 1; i >= 0; i--) {

        if (s.charAt(i) == ' ' && j.length() == 0) {
            continue;
        }

        if (s.charAt(i) != ' ') {
            j.append(s.charAt(i));
        }

        if (s.charAt(i) == ' ' && j.length() != 0) {
            j.reverse();
            ans.append(j);
            ans.append(" ");
            j.setLength(0); // clear
        }
    }

    // last word
    if (j.length() != 0) {
        j.reverse();
        ans.append(j);
    }

    // remove trailing space
    if (ans.length() > 0 && ans.charAt(ans.length() - 1) == ' ') {
        ans.deleteCharAt(ans.length() - 1);
    }

    return ans.toString();
    }
}
