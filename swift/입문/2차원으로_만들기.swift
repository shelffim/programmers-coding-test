// 2차원으로 만들기 문제

import Foundation

func solution(_ num_list:[Int], _ n:Int) -> [[Int]] {
    return stride(from: 0, to: num_list.count, by: n).map { index in
        Array(num_list[index..<(index + n)])
    }
}

// stride(from:to:by:), array[index..<(index + n)]