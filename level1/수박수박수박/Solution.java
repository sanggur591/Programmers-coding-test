public class Solution {
    public String solution(int n) {
        String answer = "";
        for (int i=1;i<n+1;i++) {
            String suOrBak = (i%2==0)? "박" : "수";
            answer+=suOrBak;
        }
        return answer;
    }
}


