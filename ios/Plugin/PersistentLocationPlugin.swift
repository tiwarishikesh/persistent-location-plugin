import Foundation
import Capacitor

/**
 * Please read the Capacitor iOS Plugin Development Guide
 * here: https://capacitorjs.com/docs/plugins/ios
 */
@objc(PersistentLocationPlugin)
public class PersistentLocationPlugin: CAPPlugin {
    private let implementation = PersistentLocation()

    @objc func start(_ call: CAPPluginCall) {
        let value = call.getString("value") ?? ""
        call.resolve([
            "value": implementation.start(value)
        ])
    }
}
