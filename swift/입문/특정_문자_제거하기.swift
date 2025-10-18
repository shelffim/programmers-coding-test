// import Foundation

// func solution(_ my_string: String, _ letter: String) -> String {
//     return my_string.replacingOccurrences(of: letter, with: "")
// }

import Foundation

func solution(_ my_string:String, _ letter:String) -> String {
    guard (1...100).contains(my_string.count), letter.count == 1, my_string.allSatisfy({$0.isLetter && $0.isASCII}), letter.allSatisfy({$0.isLetter && $0.isASCII}) else { return "" }
    
    return my_string.filter { !letter.contains($0) }
}

// replacingOccurrences, string filter 하면 $0 타입 뭔지