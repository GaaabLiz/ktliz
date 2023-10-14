
buildscript {

    extra.apply{
        set("kotlinVersion", Versions.kotlin)
        set("kotlin_version", Versions.kotlin)
        set("compose_ui_version", Versions.compose)
    }

    repositories {
        gradlePluginPortal()
        google()
        mavenLocal()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        maven("https://packages.jetbrains.team/maven/p/skija/maven")
        maven("https://oss.sonatype.org/content/repositories/snapshots/")
        maven("https://plugins.gradle.org/m2/")
    }

    dependencies {
        classpath(Deps.GradlePlugins.kotlin)
        classpath(Deps.GradlePlugins.agp)
        classpath(Deps.GradlePlugins.compose)
        classpath("io.github.gradle-nexus:publish-plugin:1.3.0")
    }

}

plugins {
    id("io.github.gradle-nexus.publish-plugin") version "1.3.0"
}

apply(file("${rootDir}\\scripts\\publish-root.gradle"))

allprojects {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        maven("https://jitpack.io")
        gradlePluginPortal()
    }
}


