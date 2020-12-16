
plugins {
    java
    id("com.github.johnrengelman.shadow") version "6.1.0"
}

dependencies {
    compile(fileTree("lib"))
}

tasks {
    named<com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar>("shadowJar") {
//        archiveBaseName.set("shadow")
        mergeServiceFiles()
        manifest {
            attributes(mapOf("Main-Class" to "edu.harvard.fas.zfeledy.fiximulator.ui.FIXimulatorFrame"))
        }
    }
}
