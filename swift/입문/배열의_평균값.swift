//
//  배열의_평균값.swift
//  
//
//  Created by 박현준 on 6/25/25.
//

import Foundation

func solution(_ numbers:[Int]) -> Double {
    return Double(numbers.reduce(0,+)) / Double(numbers.count)
}
