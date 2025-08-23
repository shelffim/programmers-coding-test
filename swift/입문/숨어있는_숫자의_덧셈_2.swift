// 숨어있는 숫자의 덧셈 2 문제

import Foundation

func solution(_ my_string:String) -> Int {
    let result = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".reduce(my_string) { $0.replacingOccurrences(of: "\($1)", with: " ") }
    return result.components(separatedBy: " ").reduce(0) { $0 + Int($1) }
}

// reduce(), compactMap(), isNumber, split {}
