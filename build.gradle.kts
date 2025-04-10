plugins {
    `java-library`
    id("me.philippheuer.configuration") version "0.16.3"
}

version = properties["version"] as String

projectConfiguration {
    type.set(me.philippheuer.projectcfg.domain.ProjectType.LIBRARY)
    javaVersion.set(JavaVersion.VERSION_1_8)
    artifactGroupId.set("io.github.cidverse.test")
    artifactId.set("java-library-gradle")
    artifactDisplayName.set("Library - Java Gradle")
    artifactDescription.set("A simple Java library for testing purposes")

    pom = { pom ->
        pom.url.set("https://github.com/cidverse/test-library-java-gradle")
        pom.issueManagement {
            system.set("GitHub")
            url.set("https://github.com/cidverse/test-library-java-gradle/issues")
        }
        pom.inceptionYear.set("2025")
        pom.developers {
            developer {
                id.set("PhilippHeuer")
                name.set("Philipp Heuer")
                email.set("git@philippheuer.de")
                roles.addAll("maintainer")
            }
        }
        pom.licenses {
            license {
                name.set("MIT Licence")
                distribution.set("repo")
                url.set("https://github.com/cidverse/test-library-java-gradle/blob/main/LICENSE")
            }
        }
        pom.scm {
            connection.set("scm:git:https://github.com/cidverse/test-library-java-gradle.git")
            developerConnection.set("scm:git:git@github.com:cidverse/test-library-java-gradle.git")
            url.set("https://github.com/cidverse/test-library-java-gradle")
        }
    }
}

dependencies {
    // annotations
    compileOnly("org.jetbrains:annotations:26.0.2")
}
