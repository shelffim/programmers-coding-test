import Foundation

func solution(_ numbers:[Int]) -> [Int] {
    guard numbers.allSatisfy({ $0 >= -10000 && $0 <= 10000 }),
            numbers.count >= 1,
            numbers.count <= 1000 
    else { return [] }
    return numbers.map { $0 * 2 }
}