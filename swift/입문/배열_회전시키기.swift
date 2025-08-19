// 배열 회전시키기 문제

import Foundation

func solution(_ numbers:[Int], _ direction:String) -> [Int] {
    var result = numbers
    if direction == "left" {
        let first = result.removeFirst()
        result.append(first)
    } else {
        let last = result.removeLast()
        result.insert(last, at: 0)
    }
    return result
}

// popFirst() 메서드의 반환 타입 문제
// Array(rotate) 생성자 호출 문제
// ArraySlice<Int>
// removeFirst() vs popFirst()