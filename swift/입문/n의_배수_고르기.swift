import Foundation

func solution(_ n:Int, _ numlist:[Int]) -> [Int] {
    guard (n >= 1 && n <= 10000), (numlist.count >= 1 && numlist.count <= 100) else {
        return []
    }
    
    return numlist.filter { $0 % n == 0 }
}