import java.util.TreeSet;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0; // 각 꼭짓점을 받을때 set로 중복을 없애주면서 받은후 큰것-작은것으로 변의길이를 구한다
        TreeSet<Integer> horizonSet = new TreeSet<>();
        TreeSet<Integer> verticalSet = new TreeSet<>();
        for(int[] x : dots){
            horizonSet.add(x[0]);
        }
        for(int[] x : dots){
            verticalSet.add(x[1]);
        }
        return (horizonSet.first()-horizonSet.last())*(verticalSet.first()-verticalSet.last());
    }
}
