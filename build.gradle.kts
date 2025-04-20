plugins {
    alias(hlaeja.plugins.kotlin.jvm)
    alias(hlaeja.plugins.kotlin.spring)
    alias(hlaeja.plugins.ltd.hlaeja.plugin.service)
    alias(hlaeja.plugins.spring.dependency.management)
    alias(hlaeja.plugins.springframework.boot)
}

dependencies {
    implementation(hlaeja.fasterxml.jackson.module.kotlin)
    implementation(hlaeja.kotlin.reflect)
    implementation(hlaeja.kotlinx.coroutines)
    implementation(hlaeja.projectreactor.kotlin.reactor.extensions)
    implementation(hlaeja.springboot.starter.actuator)
    implementation(hlaeja.springboot.starter.webflux)

    testImplementation(hlaeja.kotlin.test.junit5)
    testImplementation(hlaeja.kotlinx.coroutines.test)
    testImplementation(hlaeja.projectreactor.reactor.test)
    testImplementation(hlaeja.springboot.starter.test)

    testRuntimeOnly(hlaeja.junit.platform.launcher)
}

group = "ltd.hlaeja"
