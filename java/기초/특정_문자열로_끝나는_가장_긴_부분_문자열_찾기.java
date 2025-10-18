class Solution {
    public String solution(String myString, String pat) {
        int findIndex = myString.lastIndexOf(pat) + pat.length();
        return myString.substring(0, findIndex);
    }
}