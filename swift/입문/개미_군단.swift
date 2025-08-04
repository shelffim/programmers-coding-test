import Foundation

func solution(_ hp:Int) -> Int {
    guard hp >= 0, hp <= 1000 else {
        return 0
    }
    
    let general = hp / 5
    let soldier = (hp % 5) / 3
    let work = (hp % 5) % 3
    return general + soldier + work
}