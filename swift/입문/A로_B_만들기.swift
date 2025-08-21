// A로 B 만들기 문제

import Foundation

func solution(_ before:String, _ after:String) -> Int {
    return before.filter { after.contains($0) }.sorted() == after.sorted() ? 1 : 0
}

// filter, contains, 비교할 때는 sorted() 사용