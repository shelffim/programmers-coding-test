import Foundation

func solution(_ n:Int) -> Int {
    var total: Int = 0
    let strN = String(n)
    for s in strN {
        if let s = s.wholeNumberValue {
            total += s
        }
    }
    return total
}