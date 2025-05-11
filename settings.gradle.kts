pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
        google()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
    //add on1
//        versionCatalogs {
//            create("libs") {
//                from(files("gradle/libs.versions.toml"))
//            }
        //}

    //add on2
}

rootProject.name = "MoviesApp"
include(":app")
