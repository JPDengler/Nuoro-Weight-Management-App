// Project-level build.gradle.kts
plugins {
    id("com.android.application") version "8.0.2" apply false
    id("com.android.library") version "8.0.2" apply false
}

repositories {
    google() // Google's Maven repository for Android dependencies
    mavenCentral() // Central repository for other libraries
    maven { url = uri("https://jitpack.io") } // JitPack for MPAndroidChart and other libraries
}
