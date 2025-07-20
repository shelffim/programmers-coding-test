//
//  제곱수_판별하기.swift
//  
//
//  Created by 박현준 on 6/25/25.
//

import Foundation

func solution(_ n:Int) -> Int {
    let result = sqrt(Double(n)).truncatingRemainder(dividingBy: 1)
    return result > 0 ? 2 : 1
}
