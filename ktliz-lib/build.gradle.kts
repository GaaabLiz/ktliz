@file:Suppress("UnstableApiUsage")

import org.jetbrains.kotlin.gradle.plugin.KotlinDependencyHandler


plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id ("org.jetbrains.compose")
    id("maven-publish")
}

group = Config.Project.groupId
version = Config.Project.version
description = Config.Project.description


kotlin {
    android {
        publishAllLibraryVariants()
    }
    jvm()
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(Deps.Libs.Kotlin.stdlib)
            }
        }
        val commonTest by getting {
            dependencies {
                //implementation(Dep.Test.common)
                //implementation(Dep.Test.annotation)
                //implementation(Dep.Coroutines.core)
            }
        }
        val androidMain by getting {
            dependencies {
                api(compose.runtime)
                api(compose.foundation)
                api(compose.material)
                api(compose.ui)
                api(compose.animation)
                api(compose.materialIconsExtended)
                api(compose.preview)
                addAndroidCoreDependencies()
            }
        }
        val jvmMain by getting {
            dependencies {
                api(compose.desktop.currentOs)
                api(compose.desktop.common)
                //api(Deps.Libs.Jvm.skijaWindows)
                implementation(Deps.Libs.Jvm.logback)
            }
        }
    }
}

android {
    namespace = Config.Android.namespace
    compileSdk = Config.Android.compileSdk

    defaultConfig {
        minSdk = Config.Android.minSdk
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Versions.composeCompiler
    }

    sourceSets {
        getByName("main") {
            manifest.srcFile("src/androidMain/AndroidManifest.xml")
        }
    }

    compileOptions {
        sourceCompatibility = Config.Project.javaVersion
        targetCompatibility = Config.Project.javaVersion
    }
}

