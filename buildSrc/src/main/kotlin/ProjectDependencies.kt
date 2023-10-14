import org.gradle.api.artifacts.dsl.DependencyHandler
import org.jetbrains.kotlin.gradle.plugin.KotlinDependencyHandler

fun DependencyHandler.addComposeDependencies() {
    implementation(Deps.Libs.AndroidX.ComposeBom.runtime)
    implementation(Deps.Libs.AndroidX.ComposeBom.ui)
    implementation(Deps.Libs.AndroidX.ComposeBom.material)
    implementation(Deps.Libs.AndroidX.ComposeBom.uiToolingPreview)
    debugImplementation(Deps.Libs.AndroidX.ComposeBom.uiTooling)
    implementation(Deps.Libs.Ui.composeLottieAndroid)
    implementation(Deps.Libs.AndroidX.Accompanist.pager)
    implementation(Deps.Libs.AndroidX.Compose.navigationCompose)
}

fun DependencyHandler.addAndroidCoreDependencies() {
    implementation(Deps.Libs.AndroidX.appcompact)
    implementation(Deps.Libs.AndroidX.coreKtx)
    implementation(Deps.Libs.AndroidX.material)
    implementation(Deps.Libs.AndroidX.splashScreen)
}

fun KotlinDependencyHandler.addAndroidCoreDependencies() {
    implementation(Deps.Libs.AndroidX.appcompact)
    implementation(Deps.Libs.AndroidX.coreKtx)
    implementation(Deps.Libs.AndroidX.material)
    implementation(Deps.Libs.AndroidX.splashScreen)
    implementation(Deps.Libs.Logging.timberAndroid)
}

fun DependencyHandler.addAndroidTestDependencies() {
    testImplementation(Deps.Libs.Test.junit)
    androidTestImplementation(Deps.Libs.AndroidX.Test.Ext.junit)
    androidTestImplementation(Deps.Libs.AndroidX.Test.espressoCore)
    androidTestImplementation(Deps.Libs.AndroidX.Compose.uiTestJunit4)
    debugImplementation(Deps.Libs.AndroidX.ComposeBom.uiTestManifest)
}

fun DependencyHandler.addAndroidUtilsDependencies() {
    implementation(Deps.Libs.AndroidX.ComposeExtra.activity)
    implementation(Deps.Libs.AndroidX.Lifecycle.runtimeKtx)
    implementation(Deps.Libs.AndroidX.Lifecycle.viewModelCompose)
    implementation(Deps.Libs.Data.easyValidationAndroidCore)
    implementation(Deps.Libs.Data.easyValidationAndroidToast)
    implementation(Deps.Libs.AndroidX.gsmPlayServiceLocation)
}

fun DependencyHandler.addProjectCommonDependecies() {
    //implementation("it.gabliz:kliz-lib:0.0.5")
    implementation(Deps.Libs.Jvm.apacheCommons)
    implementation(Deps.Libs.Jvm.commonsIo)
    implementation(Deps.Libs.Coroutines.android)
    implementation(Deps.Libs.Data.gson)
    implementation(Deps.Libs.Data.kotlinFaker)
    implementation(Deps.Libs.Kotlin.reflect)
}

fun DependencyHandler.addFirebaseDependencies() {
    implementation(Deps.Libs.AndroidX.Firebase.auth)
    implementation(Deps.Libs.AndroidX.Firebase.database)
    implementation(Deps.Libs.AndroidX.Firebase.firestore)
    implementation(Deps.Libs.AndroidX.Firebase.messaging)
    implementation(Deps.Libs.AndroidX.Firebase.storage)
}