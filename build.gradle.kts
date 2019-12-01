plugins {
    kotlin("jvm") version "1.3.60"
}

group = "aoc.2019.bart"
version = "1.0-SNAPSHOT"


subprojects {
    repositories {
        mavenCentral()
    }

    apply(plugin = "kotlin")

    dependencies {
        implementation(kotlin("stdlib-jdk8"))
        implementation(project(":base"))
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.2")
    }

    tasks {
        compileKotlin {
            kotlinOptions.jvmTarget = "1.8"
        }
        compileTestKotlin {
            kotlinOptions.jvmTarget = "1.8"
        }
    }

}

