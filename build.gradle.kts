buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:3.3.0-alpha06")
    }
}

plugins {
    id("se.patrikerdes.use-latest-versions") version "0.2.3"
    id("com.github.ben-manes.versions") version "0.20.0"
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

tasks.create<Delete>("clean") {
    delete = setOf(rootProject.buildDir)
}
