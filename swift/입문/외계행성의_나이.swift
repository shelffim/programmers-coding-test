// 외계행성의 나이 문제

import Foundation

func solution(_ age:Int) -> String {
    let alienAge = ["a","b","c","d","e","f","g","h","i","j"]
    return String(age).map { alienAge[Int(String($0))!] }.joined()
}