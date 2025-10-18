import Foundation

func solution(_ n:Int) -> [Int] {
    guard n >= 1, n <= 100 else { return [] }
    return (1...n).filter { $0 % 2 == 1 }
}