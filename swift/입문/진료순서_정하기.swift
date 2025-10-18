// 진료순서 정하기 문제

import Foundation

func solution(_ emergency:[Int]) -> [Int] {
    let sort_emergency = emergency.sorted(by: >)
    return emergency.map { sort_emergency.firstIndex(of: $0)! + 1 }
}

// emergency.map { data in
//         emergency.filter { $0 > data }.count + 1
//     }