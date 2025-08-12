// 가장 큰 수 찾기 문제

import Foundation

func solution(_ array:[Int]) -> [Int] {
    return [array.max()!, array.firstIndex(of: array.max()!)!]
}