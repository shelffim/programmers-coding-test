class Solution {
    public int solution(String before, String after) {
        for(int i = 0; i < before.length(); i++) {
            after = after.replaceFirst(before.charAt(i) + "", "");
        }
        return after.equals("") ? 1 : 0;
    }
}

/*
 * String.replace() vs replaceFirst() vs replaceAll() 차이점:
 * - replace(): 일치하는 모든 문자/문자열을 교체 (정규표현식 미지원)
 * - replaceFirst(): 정규표현식 패턴으로 일치하는 첫 번째 부분만 교체
 * - replaceAll(): 정규표현식 패턴으로 일치하는 모든 부분을 교체
 * 
 * 예시:
 * "hello".replace("l", "X")        → "heXXo" (모든 'l'을 'X'로)
 * "hello".replaceFirst("l", "X")   → "heXlo" (첫 번째 'l'만 'X'로)
 * "hello".replaceAll("l", "X")     → "heXXo" (모든 'l'을 'X'로)
 */