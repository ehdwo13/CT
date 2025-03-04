class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] speakArr = new String[]{"aya","ye","woo","ma"};
        for(String word : babbling){
            for(String str : speakArr){
                if(word.contains(str)){
                    word = word.replace(str, " ");
                }
            }
            word = word.replace(" ", "");
            if(word.equals("")){
                answer++;
            }
        }
        return answer;
    }
}