import Foundation

func solution(_ s1:[String], _ s2:[String]) -> Int {
    var result = 0
    for s in s1 {
        if s2.contains("\(s)") {
            result += 1
        }
    }
    return result
}