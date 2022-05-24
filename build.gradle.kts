import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.21"
    id("fabric-loom") version "0.11-SNAPSHOT"
}

group = "de.dasphiller"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    minecraft("com.mojang:minecraft:1.18.2")
    mappings("net.fabricmc:yarn:1.18.2+build.3")
    modImplementation("net.fabricmc:fabric-loader:0.14.6")
    modImplementation("net.fabricmc.fabric-api:fabric-api:0.53.4+1.18.2")
    modImplementation("net.fabricmc:fabric-language-kotlin:1.7.4+kotlin.1.6.21")
    modImplementation("net.axay:fabrikmc-core:1.7.4")

}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "17"
}