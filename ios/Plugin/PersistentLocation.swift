import Foundation

@objc public class PersistentLocation: NSObject {
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
}
