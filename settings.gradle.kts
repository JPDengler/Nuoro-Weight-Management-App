pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven { url = uri("https://jitpack.io") } // Ensure JitPack is included
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS) // Change this to avoid failures
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") } // Ensure JitPack is added
    }
}

rootProject.name = "Nuoro Weight Management App"
include(":app")
