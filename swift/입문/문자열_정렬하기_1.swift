import Foundation

func solution(_ my_string:String) -> [Int] {
    guard (1...100).contains(my_string.count),
          my_string.contains(where: { $0.isNumber }),
          my_string.allSatisfy({ $0.isNumber || ($0 >= "a" && $0 <= "z")            })
    else {
        return []
    }
    return my_string.compactMap{Int(String($0))}.sorted()
}

// map vs compactMap