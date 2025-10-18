import Foundation

func solution(_ str1:String, _ str2:String) -> Int {
    guard (str1.count >= 1 && str1.count <= 100),(str2.count >= 1 && str2.count <= 100) else {
        return 0
    }
    return str1.contains(str2) ? 1 : 2 

}
// components
// func solution(_ str1:String, _ str2:String) -> Int {
//     return str1.range(of: str2, options: .regularExpression) != nil ? 1 : 2
// }