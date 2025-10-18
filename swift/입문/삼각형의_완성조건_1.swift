import Foundation

func solution(_ sides:[Int]) -> Int {
    var sides3 = sides
    sides3.sort()
    if sides3[0] + sides3[1] > sides3[2] {
        return 1
    } else {
        return 2
    }
}

// max는 옵셔널 반환