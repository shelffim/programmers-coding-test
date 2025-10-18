// 한 번만 등장한 문자 문제

import Foundation

func solution(_ s:String) -> String {
    var result: [String: Int] = [:]
    for str in s {
        result[String(str), default: 0] += 1
    }
    return result.filter { $0.value == 1 }.map { $0.key }.sorted().joined()
}

// reduce()를 사용해서 딕셔너리 만들기
// Dictionary(grouping:by:)
// mapValues