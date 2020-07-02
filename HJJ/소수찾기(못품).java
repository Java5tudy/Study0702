class Solution {
    public int solution(int n) {
        int answer = 0;
        int number = new int[n+1];
        for(int i = 2; i <= n; i++){
            number[i] = i;
        }
        // for(int i = 2; i <= n; i++){
        //     if( i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0){
        //         number[i] == 0;
        //     }
        }
        for(int i = 0; i < number.length; i++){
            if(number[i] != 0){
                answer++;
            }
        }
        return answer;
    }
}