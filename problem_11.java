import java.util.*;
public class problem_11 {

    static void permuteRec(StringBuilder s, int idx) {
      
        if (idx == s.length() - 1) {
            System.out.println(s);
            return;
        }

        for (int i = idx; i < s.length(); i++) {
          
            swap(s, idx, i);

            permuteRec(s, idx + 1);

            swap(s, idx, i);
        }
    }

    static void permute(String s) {
        permuteRec(new StringBuilder(s), 0);
    }

    static void swap(StringBuilder s, int i, int j) {
        char temp = s.charAt(i);
        s.setCharAt(i, s.charAt(j));
        s.setCharAt(j, temp);
    }

    public static void main(String[] args) {
        String s = "ABC";
        permute(s);
    }
}
    

