// 중복된 문자 제거 문제

import Foundation

func solution(_ my_string:String) -> String {
    var result = ""
    for s in my_string {
        if !result.contains(String(s)) {
            result += String(s)
        }
    }
    return result
}

// Set.joined() : Set은 Character들의 집합이므로 직접 joined()를 사용할 수 없습니다.