
// cannot convert value of type 'ClosedRange<Int>' to expected element type 'Int'
// signal: illegal instruction (core dumped)
// Array(1..<n+1) vs [1..<n+1]

import Foundation

func solution(_ n:Int) -> Int {
    return Array(1..<n+1).filter { n % $0 == 0 }.count
}