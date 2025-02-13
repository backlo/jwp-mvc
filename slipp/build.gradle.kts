plugins {
    idea
}

idea {
    module {
        inheritOutputDirs = false
        outputDir = file("webapp/WEB-INF/classes")
    }
}

dependencies {
    api(project(":nextstep-mvc"))

    val springVersion = rootProject.extra.get("springVersion")
    val tomcatVersion = rootProject.extra.get("tomcatVersion")

    implementation("org.springframework:spring-jdbc:$springVersion")
    implementation("org.springframework:spring-web:$springVersion")

    implementation("org.apache.commons:commons-dbcp2:2.6.0")

    runtimeOnly("com.h2database:h2:1.4.199")

    implementation("org.apache.tomcat.embed:tomcat-embed-core:$tomcatVersion")
    implementation("org.apache.tomcat.embed:tomcat-embed-logging-juli:8.5.2")
    implementation("org.apache.tomcat.embed:tomcat-embed-jasper:$tomcatVersion")
    implementation("commons-io:commons-io:2.6")
    
    testImplementation("org.apache.logging.log4j:log4j-api:2.11.2")
    testImplementation("org.apache.logging.log4j:log4j-core:2.11.2")
}
