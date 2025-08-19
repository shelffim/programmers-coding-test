// 369게임 문제

import Foundation

func solution(_ order:Int) -> Int {
    return String(order).filter { ["3","6","9"].contains(String($0)) }.count
}

// String.contains() 메서드는 Character를 직접 받을 수 있습니다
// in 연산자