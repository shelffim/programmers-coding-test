import Foundation

let n = readLine()!.components(separatedBy: [" "]).map { Int($0)! }

var star = ""
for i in 0..<n[0] {
    for _ in 1...i+1 {
        star += "*"
    }
    star += "\n"
}
print(star)

// String(repeating: "*", count: i)