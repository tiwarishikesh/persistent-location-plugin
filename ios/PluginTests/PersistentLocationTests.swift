import XCTest
@testable import Plugin

class PersistentLocationTests: XCTestCase {
    override func setUp() {
        super.setUp()
        // Put setup code here. This method is called before the invocation of each test method in the class.
    }

    override func tearDown() {
        // Put teardown code here. This method is called after the invocation of each test method in the class.
        super.tearDown()
    }

    func teststart() {
        // This is an example of a functional test case for a plugin.
        // Use XCTAssert and related functions to verify your tests produce the correct results.

        let implementation = PersistentLocation()
        let value = "Hello, World!"
        let result = implementation.start(value)

        XCTAssertEqual(value, result)
    }
}
