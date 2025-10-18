// 암호 해독 문제
import Foundation

func solution(_ cipher:String, _ code:Int) -> String {
    guard (1...1000).contains(cipher.count),
        1 <= code && code <= cipher.count,
        cipher.allSatisfy({$0.isLetter || $0 == " "}) 
    else {
        return ""
    }
    var answer = ""
    for (idx, c) in Array(cipher).enumerated() {
        if (idx + 1) % code == 0 {
            answer += String(c)
        }
    }
    return answer
}

// stride, enumerated().filter