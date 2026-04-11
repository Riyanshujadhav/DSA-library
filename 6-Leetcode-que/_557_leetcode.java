public class _557_leetcode {

public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        StringBuilder word = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '&&word.length()==0){
                continue;
            }
            if(s.charAt(i)!=' '){
                word.append(s.charAt(i));
            }
            if (s.charAt(i) == ' ' && word.length() != 0) {
                word.reverse();
                ans.append(word);
                word.setLength(0);
                ans.append(' ');
            }
        }
            if (word.length() != 0) {
                word.reverse();
                ans.append(word);
                word.setLength(0);
            }
            if (ans.length() != 0 && ans.charAt(ans.length() - 1) == ' ') {
                ans.deleteCharAt(ans.length() - 1);
            }
            return ans.toString();
    }

    // public String reverseWords(String s) {
    //     String[] words = s.split(" ");
    //     StringBuilder ans = new StringBuilder();

    //     for (int i = 0; i < words.length; i++) {
    //         StringBuilder temp = new StringBuilder(words[i]);
    //         ans.append(temp.reverse());

    //         if (i != words.length - 1) {
    //             ans.append(" ");
    //         }
    //     }

    //     return ans.toString();
    // }
}
