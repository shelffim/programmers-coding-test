// 모스부호 1 문제

import Foundation

func solution(_ letter:String) -> String {
    let morse = [ 
        ".-":"a","-...":"b","-.-.":"c","-..":"d",".":"e","..-.":"f",
        "--.":"g","....":"h","..":"i",".---":"j","-.-":"k",".-..":"l",
        "--":"m","-.":"n","---":"o",".--.":"p","--.-":"q",".-.":"r",
        "...":"s","-":"t","..-":"u","...-":"v",".--":"w","-..-":"x",
        "-.--":"y","--..":"z"
    ]
    let str = letter.components(separatedBy: " ")
    return str.map { morse[$0]! }.joined()
}