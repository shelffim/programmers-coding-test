import Foundation

func solution(_ array:[Int], _ height:Int) -> Int {
    var array_height = array
    array_height.append(height)
    array_height.sort()
    if let height_index = array_height.lastIndex(of: height) {
        return array_height.count - height_index - 1
    }
    return 0
}