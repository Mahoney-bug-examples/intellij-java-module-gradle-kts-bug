import org.gradle.api.JavaVersion.VERSION_11

plugins {
  java
}

val javaVersion = VERSION_11

java {
  sourceCompatibility = javaVersion
  targetCompatibility = javaVersion
}
