// 대문자와 소문자 문제

import Foundation

func solution(_ my_string:String) -> String {
    guard (1...1000).contains(my_string.count), my_string.allSatisfy({$0.isLetter}) else {
        return ""
    }
    return my_string.map { ("a"..."z").contains($0) ? $0.uppercased() : $0.lowercased()}.joined(separator: "")
}

// isLowercase