import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] arr = s.split(" ");//문자열 쪼개주기
        ArrayList<String> arraylist1 = new ArrayList<>(Arrays.asList(arr));
        ArrayList<String> arraylist2 = new ArrayList<>();
        for(int i=0;i<arr.length;i++){//list1에서 list2로 Z가 아니면 넣어주고 Z면 list2의 마지막요소 삭제
            if(arraylist1.get(i).equals("Z")){
                if(arraylist2.size()!=0){
                    arraylist2.remove(arraylist2.size()-1);
                }
            }
            else arraylist2.add(arraylist1.get(i));
        }
        Iterator<String> iterator = arraylist2.iterator();//합계구하기
        while(iterator.hasNext()){
            String x = iterator.next();
            answer += Integer.parseInt(x);
        }

        return answer;
    }
}
