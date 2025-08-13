// 문자열 정렬하기 2 문제

import Foundation

func solution(_ my_string:String) -> String {
    return String(my_string.lowercased().sorted())
}

// func solution(_ my_string:String) -> String {
//     return my_string.map { $0.lowercased() }.sorted().joined()
// }

// sorted() vs sort()