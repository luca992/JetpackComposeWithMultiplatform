
plugins {
    id("com.android.application")
    //kotlin("multiplatform")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("kotlin-kapt")
}

android {
    compileSdkVersion(29)

    defaultConfig {
        applicationId = "com.example.myapplication"
        minSdkVersion(29)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        targetCompatibility = JavaVersion.VERSION_1_8
        sourceCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerVersion = "1.3.70-dev-withExperimentalGoogleExtensions-20200424"
        kotlinCompilerExtensionVersion = "0.1.0-dev10"
    }
}

tasks.withType(org.jetbrains.kotlin.gradle.tasks.KotlinCompile::class.java) {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}
/*
kotlin {
    targets {
        android()
    }

    sourceSets["androidMain"].dependencies {

        compileOnly("javax.annotation:jsr250-api:1.0")

        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${rootProject.extra["kotlin_version"]}")
        implementation("androidx.core:core-ktx:1.2.0")
        implementation("androidx.appcompat:appcompat:1.1.0")
        implementation("com.google.android.material:material:1.1.0")

        implementation("androidx.ui:ui-framework:0.1.0-dev10")
        implementation("androidx.ui:ui-layout:0.1.0-dev10")
        implementation("androidx.ui:ui-material:0.1.0-dev10")
        implementation("androidx.ui:ui-tooling:0.1.0-dev10")
        implementation("androidx.constraintlayout:constraintlayout:1.1.3")
        implementation("com.github.pengrad:jdk9-deps:1.0")

    }
}*/

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    implementation("androidx.core:core-ktx:1.2.0")
    implementation("androidx.appcompat:appcompat:1.1.0")
    implementation("com.google.android.material:material:1.1.0")
    implementation("androidx.ui:ui-framework:0.1.0-dev10")
    implementation("androidx.ui:ui-layout:0.1.0-dev10")
    implementation("androidx.ui:ui-material:0.1.0-dev10")
    implementation("androidx.ui:ui-tooling:0.1.0-dev10")
    implementation("androidx.constraintlayout:constraintlayout:1.1.3")
    implementation("com.github.pengrad:jdk9-deps:1.0")

}


