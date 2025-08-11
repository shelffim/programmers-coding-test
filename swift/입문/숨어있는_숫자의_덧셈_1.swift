import Foundation

func solution(_ my_string:String) -> Int {
    guard (1...1000).contains(my_string.count), my_string.allSatisfy({ $0.isLetter || $0.isNumber }) else {
        return 0
    }
    return my_string.compactMap{Int(String($0))}.reduce(0) { $0 + $1 }
}

// reduce, isLetter, isNumber