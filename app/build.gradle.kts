plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.example.p15eventorias"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.p15eventorias"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.8.0")

    implementation ("com.squareup.okhttp3:okhttp:4.12.0")

    implementation ("com.google.firebase:firebase-messaging:24.0.1")


    // Find the latest Glide releases here: https://goo.gl/LpksbR
    implementation ("com.github.bumptech.glide:glide:4.13.2")
// If you're using Kotlin (and therefore, kapt), use kapt instead of annotationProcessor
    annotationProcessor ("com.github.bumptech.glide:compiler:4.13.2")

    // Firebase UI for Firestore
    implementation ("com.firebaseui:firebase-ui-firestore:8.0.0")
    // Firebase UI for Storage
    implementation ("com.firebaseui:firebase-ui-storage:8.0.0")


    implementation ("com.google.firebase:firebase-firestore-ktx:25.1.0")

    implementation("com.google.firebase:firebase-inappmessaging-display")

    // AndroidX Activity KTX for Jetpack
    implementation("androidx.activity:activity-ktx:1.9.2")

    // Firebase Authentication KTX
    implementation("com.google.firebase:firebase-auth-ktx:23.0.0")

    // Firebase UI for Authentication
    implementation("com.firebaseui:firebase-ui-auth:8.0.2")

    // Firebase BOM (Bill of Materials) for managing Firebase library versions
    implementation(platform("com.google.firebase:firebase-bom:33.2.0"))

    // Firebase Analytics
    implementation("com.google.firebase:firebase-analytics-ktx")

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}