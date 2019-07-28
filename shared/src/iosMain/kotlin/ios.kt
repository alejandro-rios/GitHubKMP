package com.alejandrorios

import platform.UIKit.UIDevice

actual fun platformName(): String {
    return UIDevice.currentDevice.systemName
}

actual fun platformVersion(): String {
    return UIDevice.currentDevice.systemVersion
}
