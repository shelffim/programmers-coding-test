// 약수 구하기 문제

import Foundation

func solution(_ n:Int) -> [Int] {
    return Array(1...n).filter { n % $0 == 0 }
}