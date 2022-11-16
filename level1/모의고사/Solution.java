import java.util.ArrayList;
import java.util.stream.Stream;

class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> arraylist = new ArrayList<>();
        int[] supo1 = {1,2,3,4,5};
        int[] supo2 = {2,1,2,3,2,4,2,5};
        int[] supo3 = {3,3,1,1,2,2,4,4,5,5};
        int a=0; int b=0; int c=0;//점수
        int set1=0; int set2=0; int set3=0;//배열을 순환하게하는 수
        for (int ans : answers) {
            if(supo1[set1++]==ans) a+=1;
            if(supo2[set2++]==ans) b+=1;
            if(supo3[set3++]==ans) c+=1;
            set1%=5;
            set2%=8;
            set3%=10;
        }
        //최대수 구하기
        int max= (a>=b) ? a : b;
        max = (max >=c) ? max : c;
        if(max==a) arraylist.add(1);
        if(max==b) arraylist.add(2);
        if(max==c) arraylist.add(3);
        return arraylist.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
