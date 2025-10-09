class Solution {
    public int solution(String binomial) {
        String[] func = binomial.split(" ");
        int a = Integer.parseInt(func[0]), b = Integer.parseInt(func[2]);
        switch(func[1]) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
        }
        return 0;
    }
}