// 숫자 찾기 문제

import Foundation

func solution(_ num:Int, _ k:Int) -> Int {
    if let idx = String(num).map{ Int(String($0)) }.firstIndex(of: k) {
        return idx + 1
    } else {
        return -1
    }
}