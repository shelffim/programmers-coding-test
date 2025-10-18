//
//  짝수의_합.swift
//  
//
//  Created by 박현준 on 6/25/25.
//

import Foundation

func solution(_ n:Int) -> Int {
    var answer:Int=0
    for i in 1...n {
        answer += i % 2 == 0 ? i : 0
    }
    return answer
}
