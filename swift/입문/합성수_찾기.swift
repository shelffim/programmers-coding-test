// 합성수 찾기 문제

import Foundation

func solution(_ n:Int) -> Int {
    return (1...n).filter { (num) in (1...num).filter { num % $0 == 0 }.count >= 3 }.count
}