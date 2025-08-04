import Foundation

func solution(_ rsp:String) -> String {
    guard rsp.count > 0, rsp.count <= 100, rsp.allSatisfy({$0=="0" || $0=="2" || $0=="5"}) else {
        return ""
    }
    let RSP = ["2":"0","0":"5","5":"2"]
    return rsp.map { RSP[String($0)]! }.joined()
}