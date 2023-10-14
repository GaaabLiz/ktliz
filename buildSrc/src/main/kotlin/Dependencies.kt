@file:Suppress( "ConstPropertyName", "SpellCheckingInspection")


object Deps {

    object GradlePlugins {
        const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
        const val agp = "com.android.tools.build:gradle:${Versions.agp}"
        const val compose = "org.jetbrains.compose:compose-gradle-plugin:${Versions.compose}"
    }

    object Plugins {
        const val mavenPublish = "maven-publish"
        const val benManesVersions = "com.github.ben-manes.versions"
        const val benManesVersionsPlugin = "com.github.ben-manes:gradle-versions-plugin:0.38.0"
        const val kotlinMultiplatform = "org.jetbrains.kotlin.multiplatform"
        const val kotlinSerializationPlugin = "org.jetbrains.kotlin:kotlin-serialization:${Versions.kotlin}"
        const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
        const val mavenVanniktechGradlePlugin = "com.vanniktech:gradle-maven-publish-plugin:0.18.0"
        const val composeGradlePlugin = "org.jetbrains.compose:compose-gradle-plugin:${Versions.compose}"
        const val compose = "org.jetbrains.compose"
        const val androidBuildToolGradlePlugin = "com.android.tools.build:gradle:7.1.0-alpha02"
        const val dokkaPlugin = "org.jetbrains.dokka:dokka-gradle-plugin:${Versions.dokka}"
        const val dokka = "org.jetbrains.dokka"
    }

    object Libs {

        object Kotlin {
            const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
            const val reflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlin}"
            const val testCommon = "org.jetbrains.kotlin:kotlin-test-common:${Versions.kotlin}"
            const val testJunit = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}"
            const val testAnnotationsCommon = "org.jetbrains.kotlin:kotlin-test-annotations-common:${Versions.kotlin}"
            const val dateTime = "org.jetbrains.kotlinx:kotlinx-datetime:0.2.1"
            const val serialization = "org.jetbrains.kotlinx:kotlinx-serialization-core:1.4.0"
            const val serializationJson = "org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.2"
            const val collectionImmutable = "org.jetbrains.kotlinx:kotlinx-collections-immutable:0.3.5"
        }

        object Coroutines {
            const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutinesVersion}"
            const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutinesVersion}"
            const val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutinesVersion}"
            const val swing = "org.jetbrains.kotlinx:kotlinx-coroutines-swing:${Versions.coroutinesVersion}"
            const val playService = "org.jetbrains.kotlinx:kotlinx-coroutines-play-services:${Versions.coroutinesVersion}"
        }

        object Test {
            const val junit = "junit:junit:4.13.2"
        }

        object AndroidX {

            const val appcompact = "androidx.appcompat:appcompat:1.6.1"
            const val coreKtx = "androidx.core:core-ktx:1.9.0"
            const val material = "com.google.android.material:material:1.8.0"
            const val gsmPlayServiceAuth = "com.google.android.gms:play-services-auth:20.4.1"
            const val gsmPlayServiceLocation = "com.google.android.gms:play-services-location:21.0.1"
            const val splashScreen = "androidx.core:core-splashscreen:1.0.0"
            const val datastore = "androidx.datastore:datastore:1.0.0"


            object Accompanist {
                const val insets = "com.google.accompanist:accompanist-insets:0.13.0"
                /** runtimeOnly */ const val navigationAnimation = "com.google.accompanist:accompanist-navigation-animation:0.28.0"
                const val pager = "com.google.accompanist:accompanist-pager:0.28.0"
                const val pagerIndicators = "com.google.accompanist:accompanist-pager-indicators:0.28.0"
                const val swipeRefresh = "com.google.accompanist:accompanist-swiperefresh:0.28.0"
                const val placeholderMaterial = "com.google.accompanist:accompanist-placeholder-material:0.25.1"
            }

            object Compose {
                const val runtime = "androidx.compose.runtime:runtime:${Versions.compose}"
                const val ui = "androidx.compose.ui:ui:${Versions.compose}"
                const val runtimeLivedata = "androidx.compose.runtime:runtime-livedata:${Versions.compose}"
                const val material = "androidx.compose.material:material:${Versions.compose}"
                const val foundation = "androidx.compose.foundation:foundation:${Versions.compose}"
                const val layout = "androidx.compose.foundation:foundation-layout:${Versions.compose}"
                const val uiTooling = "androidx.compose.ui:ui-tooling:${Versions.compose}"
                const val uiToolingPreview = "androidx.compose.ui:ui-uiTooling-preview:${Versions.compose}"
                const val animation = "androidx.compose.animation:animation:${Versions.compose}"
                const val uiTestJunit4 = "androidx.compose.ui:ui-test-junit4:${Versions.compose}"
                const val navigationCompose = "androidx.navigation:navigation-compose:2.5.3"
            }

            object ComposeBom {
                const val bom = "androidx.compose:compose-bom:${Versions.composeBom}"
                const val animation = "androidx.compose.animation:animation"
                const val animationCore = "androidx.compose.animation:animation-core"
                const val animationGraphics = "androidx.compose.animation:animation-graphics"
                const val runtime = "androidx.compose.runtime:runtime"
                const val ui = "androidx.compose.ui:ui"
                const val runtimeLivedata = "androidx.compose.runtime:runtime-livedata"
                const val material = "androidx.compose.material:material"
                const val materialIconsCore = "androidx.compose.material:material-icons-core"
                const val materialIconsExtended = "androidx.compose.material:material-icons-extended"
                const val foundation = "androidx.compose.foundation:foundation"
                const val foundationLayout = "androidx.compose.foundation:foundation-layout"
                const val layout = "androidx.compose.foundation:foundation-layout"
                const val uiText = "androidx.compose.ui:ui-text"
                const val uiTooling = "androidx.compose.ui:ui-tooling"
                const val uiToolingPreview = "androidx.compose.ui:ui-tooling-preview"
                const val uiUtil = "androidx.compose.ui:ui-util"
                const val uiTestManifest = "androidx.compose.ui:ui-test-manifest"
            }

            object ComposeExtra {
                const val constraintLayout = "androidx.constraintlayout:constraintlayout-compose:1.0.0-alpha07"
                const val navigation = "androidx.navigation:navigation-compose:2.5.3"
                const val paging = "androidx.paging:paging-compose:1.0.0-alpha14"
                const val activity = "androidx.activity:activity-compose:1.7.0"
            }

            object Lifecycle {
                const val viewModelCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:1.0.0-alpha07"
                const val viewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1"
                const val runtime = "androidx.lifecycle:lifecycle-runtime:2.3.1"
                const val runtimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:2.6.1"
                const val commons = "androidx.lifecycle:lifecycle-common-java8:2.3.1"
                const val liveDataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:2.6.1"
            }

            object Firebase {
                const val bom = "com.google.firebase:firebase-bom:32.0.0"
                const val analytics = "com.google.firebase:firebase-analytics-ktx"
                const val crashlytics = "com.google.firebase:firebase-crashlytics-ktx"
                const val auth = "com.google.firebase:firebase-auth-ktx"
                const val firestore = "com.google.firebase:firebase-firestore-ktx"
                const val storage = "com.google.firebase:firebase-storage-ktx"
                const val functions = "com.google.firebase:firebase-functions-ktx"
                const val messaging = "com.google.firebase:firebase-messaging-ktx"
                const val database = "com.google.firebase:firebase-database-ktx"
                const val firePush = "com.github.karanatwal:FirePush:1.0.0"
            }

            object Test {
                private const val version = "1.4.0"
                const val runner = "androidx.test:runner:$version"
                const val rules = "androidx.test:rules:$version"

                object Ext {
                    private val version = "1.1.3"
                    val junit = "androidx.test.ext:junit-ktx:$version"
                }

                const val espressoCore = "androidx.test.espresso:espresso-core:3.5.1"
            }
        }

        object Jvm {
            const val apacheCommons = "org.apache.commons:commons-lang3:3.12.0"
            const val commonsIo = "commons-io:commons-io:2.11.0"
            const val logback = "ch.qos.logback:logback-classic:1.4.5"
            const val skija = "org.jetbrains.skija:skija:0.93.6"
            const val skijaLinux = "org.jetbrains.skija:skija-linux:0.93.6"
            const val skijaMacos = "org.jetbrains.skija:skija-macos:0.93.6"
            const val skijaWindows = "org.jetbrains.skija:skija-windows:0.93.6"
        }

        object Network {
            const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofitVersion}"
            const val retrofitConverterGson = "com.squareup.retrofit2:converter-gson:${Versions.retrofitVersion}"
            const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttpVersion}"
            const val okhttpIntercepter = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttpVersion}"
        }

        object Data {
            const val moshiConverter = "com.squareup.retrofit2:converter-moshi:${Versions.retrofitVersion}"
            const val gson = "com.google.code.gson:gson:2.8.8"
            const val easyValidationAndroidCore = "com.wajahatkarim:easyvalidation-core:1.0.4"
            const val easyValidationAndroidToast = "com.wajahatkarim:easyvalidation-toast:1.0.4"
            const val kotlinFaker = "io.github.serpro69:kotlin-faker:1.14.0"
        }

        object Images {
            const val coilCompose = "io.coil-kt:coil-compose:2.2.2"
            const val kamel = "com.alialbaali.kamel:kamel-image:0.3.0"
        }

        object Ui {
            const val composeMarkdownAndroid = "com.github.jeziellago:compose-markdown:0.3.1"
            const val composeLottieAndroid = "com.airbnb.android:lottie-compose:6.0.0"
        }

        object Logging {
            const val napierKmm="io.github.aakira:napier:2.6.1"
            const val timberAndroid = "com.jakewharton.timber:timber:4.0.1"
        }
    }
}



