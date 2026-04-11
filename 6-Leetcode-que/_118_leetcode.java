import java.util.ArrayList;
import java.util.List;

public class _118_leetcode {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>ans =new ArrayList<>();
        for(int i=0;i<numRows;i++){
            int val=1;
            List<Integer>row= new ArrayList<>();
            for(int j=0;j<=i;j++){
                row.add(val);
                val=val*(i-j)/(j+1);
            }
            ans.add(row);
        }
        return ans;
    }
}
