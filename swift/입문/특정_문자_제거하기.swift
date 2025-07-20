//
//  특정_문자_제거하기.swift
//  
//
//  Created by 박현준 on 6/25/25.
//

import Foundation

func solution(_ my_string: String, _ letter: String) -> String {
    return my_string.replacingOccurrences(of: letter, with: "")
}
