import Foundation

func solution(_ money:Int) -> [Int] {
    guard (money>0 && money<=1000000) else {
        return []
    }
    let price = 5500
    return [money / price , money % price]
}