class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] figure = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i=0;i<10;i++){
            s=s.replace(figure[i],Integer.toString(i));
        }
        answer = Integer.valueOf(s);
        return answer;
    }
}
