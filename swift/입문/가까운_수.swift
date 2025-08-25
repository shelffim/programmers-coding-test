// 가까운 수 문제

import Foundation

func solution(_ array:[Int], _ n:Int) -> Int {
    let sorted_array = array.sorted()
    var result = sorted_array[0]
    var min_diff = abs(n - sorted_array[0])
    for i in (1..<sorted_array.count) {
        let diff = abs(n - sorted_array[i])
        if min_diff > diff {
            result = sorted_array[i]
            min_diff = diff
        }
    }
    return result
}

// min(by:)