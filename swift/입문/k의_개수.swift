// k의 개수 문제

func solution(_ i:Int, _ j:Int, _ k:Int) -> Int {
    return (i...j).flatMap { String($0).map { String($0) } }.filter {$0 == String(k)}.count
}

// flatMap, map, filter
// Python에서 문자열은 이미 문자들의 배열처럼 동작하므로 count() 메서드로 바로 계산 가능
// Swift에서 flatMap이 필요한 이유는 문자열은 문자들의 시퀸스가 아니기 때문에 문자열을 문자들의 배열로 변환해야 함