// 피자 나눠 먹기 2 문제

import Foundation

func solution(_ n:Int) -> Int {
    let div = [6,3,2,1].filter { n % $0 == 0}
    return n / div[0]
}