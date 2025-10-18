//
//  각도기.swift
//  
//
//  Created by 박현준 on 6/24/25.
//

import Foundation

func solution(_ angle:Int) -> Int {
    return angle < 90 ? 1 : angle == 90 ? 2 : angle < 180 ? 3 : 4
}
