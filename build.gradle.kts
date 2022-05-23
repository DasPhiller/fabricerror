import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.21"
    id("fabric-loom") version "0.12-SNAPSHOT"
    id("io.github.juuxel.loom-quiltflower") version "1.7.2"
    id("org.quiltmc.quilt-mappings-on-loom") version "3.1.2"

}

group = "de.dasphiller"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    minecraft("com.mojang:minecraft:1.18.2")
    mappings(loom.layered {
        addLayer(quiltMappings.mappings("org.quiltmc:quilt-mappings:1.18.2+build.24:v2"))
        officialMojangMappings()
    })
    modImplementation("net.fabricmc:fabric-loader:0.14.6")
    modImplementation("net.fabricmc.fabric-api:fabric-api:0.53.3+1.18.2")
    modImplementation("net.fabricmc:fabric-language-kotlin:1.7.4+kotlin.1.6.21")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.17"
}