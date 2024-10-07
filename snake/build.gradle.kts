plugins {
    kotlin("jvm") version "2.0.20"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://raw.githubusercontent.com/kotlin-graphics/mary/master")
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("com.github.ajalt.mordant:mordant:3.0.0")
    implementation("com.googlecode.lanterna:lanterna:3.1.2")
    implementation("org.jline:jline:3.27.0")
    implementation("com.github.ajalt.mordant:mordant-jvm-ffm:3.0.0")
    //implementation ("io.github.spair:imgui-java-app:1.87.5")

    implementation("kotlin.graphics:imgui-core:1.79+05")
    implementation("kotlin.graphics:imgui-gl:1.79+05")
    implementation("kotlin.graphics:imgui-glfw:1.79+05")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(22)
}



application {
    mainClass = "org.example.MainKt"
    applicationDefaultJvmArgs = listOf("--enable-native-access=ALL-UNNAMED")

}

