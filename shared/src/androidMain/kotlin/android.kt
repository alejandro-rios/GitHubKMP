package com.alejandrorios

import android.os.Build

actual fun platformName(): String {
    return "Android ${Build.VERSION.RELEASE}"
}

actual fun platformVersion(): String {
    return " ${Build.VERSION.SDK_INT}"
}
