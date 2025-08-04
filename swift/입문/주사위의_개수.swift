import Foundation

func solution(_ box:[Int], _ n:Int) -> Int {
    guard box.count == 3,
      box.allSatisfy({ (1...100).contains($0) }),
      (1...50).contains(n),
      box.allSatisfy({ $0 >= n }) 
    else {
        return 0
    }
    return (box[0] / n) * (box[1] / n) * (box[2] / n)
}

// reduce