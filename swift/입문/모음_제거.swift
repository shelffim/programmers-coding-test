import Foundation

func solution(_ my_string:String) -> String {
    guard (1...1000).contains(my_string.count),
      my_string.allSatisfy({ ($0 >= "a" && $0 <= "z") || $0 == " " }) else { return "" }
    return my_string.filter { !["a","e","i","o","u"].contains($0) }
}

// import Foundation

// func solution(_ my_string:String) -> String {
//     guard (1...1000).contains(my_string.count),
//       my_string.allSatisfy({ ($0 >= "a" && $0 <= "z") || $0 == " " }) else {
//     return ""
// }
//     return Array(my_string).filter { !["a","e","i","o","u"].contains($0) }.map { String($0) }.joined(separator: "")
// }

// filter 반환, swift는 in 없음(파이썬이랑 헷갈림)