plugins {
    application
    kotlin("jvm") version "1.3.71"
}

version = "1.0.2"
group = "org.gradle.sample"

application {
    mainClassName = "org.gradle.sample.MainKt"
}

repositories {
    mavenCentral()
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.6.1")
    testCompile("com.willowtreeapps.assertk:assertk-jvm:0.22")
}
