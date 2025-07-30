import Foundation

func solution(_ my_string:String, _ n:Int) -> String {
    guard (my_string.count >= 2 && my_string.count <= 5), (n>=2 && n<=10), (my_string.allSatisfy({$0.isLetter && $0.isASCII})) else { return "" }
    return my_string.reduce("") { $0 + String(repeating:$1, count: n) }
}

// reduce , reduce vs map,join, repeating