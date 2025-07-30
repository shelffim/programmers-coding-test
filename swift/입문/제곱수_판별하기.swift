// import Foundation

// func solution(_ n:Int) -> Int {
//     let result = sqrt(Double(n)).truncatingRemainder(dividingBy: 1)
//     return result > 0 ? 2 : 1
// }

import Foundation

func solution(_ n:Int) -> Int {
    guard n>=1, n<=1000000 else { return 0 }
    return sqrt(Double(n)) == floor(sqrt(Double(n))) ? 1 : 2
}

// truncatingRemainder, floor, sqrt, pow