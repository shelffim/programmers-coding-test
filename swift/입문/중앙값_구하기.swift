import Foundation

func solution(_ array:[Int]) -> Int {
    guard array.count % 2 == 1,
        array.count > 0,
        array.count < 100,
        array.allSatisfy({$0 > -1000 && $0 < 1000})
    else { return 0 }
    var sort_array = array
    sort_array.sort()
    return sort_array[sort_array.count / 2]
}