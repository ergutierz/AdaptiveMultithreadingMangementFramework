pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "AMMF SDK"
include(":ThreadManagementEngine")
include(":PerformanceMonitoring")
include(":AMMF-Api")
include(":ResourceAllocation")
