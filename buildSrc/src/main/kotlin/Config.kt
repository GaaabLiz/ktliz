@file:Suppress("unused", "ConstPropertyName")
import org.gradle.api.JavaVersion
import java.util.Locale

object Config {

    object Developer {
        const val id = "gaaabliz"
    }

    object Project {
        const val groupId = "io.github.gaaabliz"
        const val name = "ktliz"
        val nameLowercase = name.lowercase(Locale.ROOT)
        const val version = "0.0.1"
        val javaVersion = JavaVersion.VERSION_17
        const val jvmTarget = "17"
        const val description = "kmm lib"
    }

    object Android {
        const val namespace = "${Project.groupId}.${Project.name}"
        const val compileSdk = 33
        const val minSdk = 27
        const val targetSdk = 33
        const val versionCode = 1
        const val versionName = Project.version
        const val testInstrumentRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

}