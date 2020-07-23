import com.android.build.gradle.BaseExtension

plugins {
    id("com.android.application")
}

configure<BaseExtension> {
    compileSdkVersion(28)
    defaultConfig {
        applicationId = "io.lucasvalenteds.testing"
        minSdkVersion(25)
        targetSdkVersion(28)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            postprocessing {
                isRemoveUnusedCode = false
                isRemoveUnusedResources = false
                isObfuscate = false
                isOptimizeCode = false
                proguardFile("proguard-rules.pro")
            }
        }
    }
    compileOptions {
        setTargetCompatibility(1.8)
        setSourceCompatibility(1.8)
    }
}

dependencies {
    implementation("com.android.support:appcompat-v7:28.0.0-rc01")

    testImplementation("junit:junit:4.12")

    androidTestImplementation("com.android.support.test:runner:1.0.2")
    androidTestImplementation("com.android.support.test.espresso:espresso-core:3.0.2")
    androidTestImplementation("com.android.support:appcompat-v7:28.0.0-rc01")
}
