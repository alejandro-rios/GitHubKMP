package com.alejandrorios

import kotlin.coroutines.CoroutineContext

expect fun platformName(): String

expect fun platformVersion(): String

class Greeting {
    fun greeting(): String = "Hello, ${platformName()} version ${platformVersion()}"
}

internal expect val ApplicationDispatcher: CoroutineContext