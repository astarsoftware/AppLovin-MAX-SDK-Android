plugins {
    id("adapter-config")
}

afterEvaluate {
    apply(plugin = "adapter-publish")
}

val libraryVersionName by extra("7.4.2.0")

