//
//  세균_증식.swift
//  
//
//  Created by 박현준 on 6/25/25.
//

import Foundation

func solution(_ n:Int, _ t:Int) -> Int {
    return Int(pow(Double(2),Double(t)) * Double(n))
}
