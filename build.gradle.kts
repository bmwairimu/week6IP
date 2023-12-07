plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    // https://mvnrepository.com/artifact/org.apache.spark/spark-core
    implementation 'org.apache.spark:spark-core_2.13:3.5.0'


}

tasks.test {
    useJUnitPlatform()
}