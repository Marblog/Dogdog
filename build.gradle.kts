import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "2.5.2"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    war
    kotlin("jvm") version "1.5.10"
    kotlin("plugin.spring") version "1.5.10"
}

group = "com.me"
version = "1.0"
java.sourceCompatibility = JavaVersion.VERSION_1_8


repositories {
    maven {
        setUrl("https://maven.aliyun.com/nexus/content/groups/public/")
    }
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web:2.5.6")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.13.0")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("com.github.xiaoymin:knife4j-spring-boot-starter:3.0.3")
    implementation("com.baomidou:mybatis-plus-boot-starter:3.4.3.4")
    implementation("org.springframework.boot:spring-boot-starter-data-redis:2.5.6")
    developmentOnly("org.springframework.boot:spring-boot-devtools:2.5.6")
    runtimeOnly("mysql:mysql-connector-java:8.0.25")
    providedRuntime("org.springframework.boot:spring-boot-starter-tomcat:2.5.6")
    testImplementation("org.springframework.boot:spring-boot-starter-test:2.5.6")

}
sourceSets {
    main {
        resources.srcDirs("src/main/java", "src/main/resources")
    }
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "1.8"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

