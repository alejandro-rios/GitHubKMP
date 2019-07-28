package com.alejandrorios

expect fun platformName(): String

expect fun platformVersion(): String

class Greeting {
    fun greeting(): String = "Hello, ${platformName()} version ${platformVersion()}"
}
