class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int totalDays=0;
        for(int i=1;i<a;i++){
        
            switch(i){
            case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : totalDays+=31;
                break;
            case 2: totalDays += 29;
                break;
            case 4 : case 6 : case 9 : case 11 : totalDays += 30;
                break;
            }
        }
        totalDays +=b;
        int weekday = (totalDays-1)%7;
        switch(weekday){
            case 0:answer = "FRI";
                break;
            case 1:answer = "SAT";
                break;
            case 2:answer = "SUN";
                break;
            case 3:answer = "MON";
                break;
            case 4:answer = "TUE";
                break;
            case 5:answer = "WED";
                break;
            case 6:answer = "THU";
                break;
        }
        return answer;
    }
}
