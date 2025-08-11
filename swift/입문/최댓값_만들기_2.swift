import Foundation

func solution(_ numbers:[Int]) -> Int {
    guard (2...100).contains(numbers.count),
        numbers.allSatisfy({(-10000...10000).contains($0)})
    else {
        return 0
    }
    
    let sorted_numbers = numbers.sorted()
    let len_numbers = numbers.count
    
    return max(sorted_numbers[0] * sorted_numbers[1], sorted_numbers[len_numbers - 1] * sorted_numbers[len_numbers - 2] )
}