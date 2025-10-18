import Foundation

func solution(_ price:Int) -> Int {
    guard price >= 10, price <= 1_000_000 else {
        return 0
    }
    if price >= 500_000 {
        return Int(Double(price) * 0.8)
    } else if price >= 300_000 {
        return Int(Double(price) * 0.9)
    } else if price >= 100_000 {
        return Int(Double(price) * 0.95)
    }
    return price
}