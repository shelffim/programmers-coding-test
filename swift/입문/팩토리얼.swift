// 팩토리얼 문제

import Foundation

func solution(_ n:Int) -> Int {
    return (1...10).filter {num in (1...num).reduce(1, *) <= n}.max()!
}