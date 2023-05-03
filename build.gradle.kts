plugins {
    kotlin("jvm") version "1.8.0"
    application
}

group = "me.voinel01"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.spekframework.spek2:spek-dsl:2.0.18")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.2")
    testImplementation(kotlin("test"))
    testRuntimeOnly ("org.spekframework.spek2:spek-runner-junit5:2.0.18")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}

application {
    mainClass.set("MainKt")
}