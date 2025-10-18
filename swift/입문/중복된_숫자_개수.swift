import Foundation

func solution(_ array:[Int], _ n:Int) -> Int {
    guard array.count >= 1,
          array.count <= 100,
          array.allSatisfy({ $0 >= 0 && $0 <= 1000 }),
          n >= 0,
          n <= 1000 else {
        return 0
    }
    return array.filter { $0 == n }.count
}