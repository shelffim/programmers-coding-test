class Solution {
    public int[] solution(int money) {
        int coffeePrice = 5500;
        int[] answer = {money / coffeePrice, money % coffeePrice};
        return answer;
    }
}