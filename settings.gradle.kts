include("common")
include("common-test")
include("parser-antlr-kotlin")
include("grammar-kotlin-parser-common")
include("grammar-kotlin-parser-test")
include("grammar-kotlin-parser-antlr-kotlin")

pluginManagement {
    repositories {
        // used when developing antlr-kotlin gradle plugin
        mavenLocal()
        // used to download antlr-kotlin gradle plugin
        maven("https://jitpack.io")
        // used to download kotlin gradle plugin
        gradlePluginPortal()
    }
}

// Enables KotlinMultiplatform publication and resolving (in dependencies)
enableFeaturePreview("GRADLE_METADATA")
