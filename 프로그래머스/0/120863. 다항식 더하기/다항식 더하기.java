class Solution {
    public String solution(String polynomial) {
        int xSum = 0; 
        int numSum = 0;

        String[] terms = polynomial.split(" \\+ ");

        for (String term : terms) {
            if (term.contains("x")) {
                if (term.equals("x")) {
                    xSum += 1;
                } else {
                    xSum += Integer.parseInt(term.replace("x", ""));
                }
            } else { 
                numSum += Integer.parseInt(term);
            }
        }
        if (xSum == 0) return String.valueOf(numSum); 
        if (numSum == 0) return (xSum == 1 ? "x" : xSum + "x"); 
        return (xSum == 1 ? "x" : xSum + "x") + " + " + numSum;
    }
}
