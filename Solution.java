public class Solution {
    public int solution(int a, int b) {//약분+인수분해했을때 분모에 2와 5만 남으면 되더라
        int answer = 0;
        boolean divBy2= true;
        boolean divBy5= true;
        int c=b;
        while(divBy2||divBy5){ //분모를 인수분해 했을때 기준으로 2와5인수를 제거
            if(c%2==0) c=c/2;
            else divBy2 = false;
            if(c%5==0) c=c/5;
            else divBy5 = false;
        }
        if(a%c==0) answer=1; //2와 5인수를 제거한 분모의 수를 분자가 인수로 가지면됨(나누어떨어지면 된다)
        else answer =2;
        return answer;
    }
}


/*class Solution {
    public int solution(int a, int b) {
        int answer = ((a*512*625)%b == 0) ? 1 : 2;
        return answer;
    }
}
*/
