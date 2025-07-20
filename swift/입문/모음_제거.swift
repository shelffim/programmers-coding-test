import Foundation

func solution(_ my_string:String) -> String {
    let filter_my_string = my_string.filter { ["a","e","i","o","u"].contains($0) == false }
    return filter_my_string
}