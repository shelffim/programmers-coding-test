import Foundation

func solution(_ strlist:[String]) -> [Int] {
    guard (strlist.count >= 1 && strlist.count <= 100) else {
        return []
    }
    return strlist.map { $0.count }
}