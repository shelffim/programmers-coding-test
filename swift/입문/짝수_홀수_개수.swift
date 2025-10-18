//
//  짝수_홀수_개수.swift
//  
//
//  Created by 박현준 on 6/25/25.
//

import Foundation

func solution(_ num_list:[Int]) -> [Int] {
    var answer = [0,0]
    for num in num_list {
        answer[num%2]+=1
    }
    return answer
}
