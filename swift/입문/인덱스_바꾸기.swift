// 인덱스 바꾸기 문제

import Foundation

func solution(_ my_string:String, _ num1:Int, _ num2:Int) -> String {
    var strArr = Array(my_string)
    strArr.swapAt(num1, num2)
    return String(strArr)
}