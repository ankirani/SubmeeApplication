plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-parcelize")
    id("androidx.navigation.safeargs.kotlin")
    id("com.google.gms.google-services")
    id("kotlin-kapt")
    id("com.google.dagger.hilt.android")
}


android {
    namespace = "com.kirani.submee"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.kirani.submee"
        minSdk = 28
        targetSdk = 33
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }

    buildFeatures{
        viewBinding = true
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.10.1")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.google.firebase:firebase-auth-ktx:22.1.1")
    implementation("com.google.firebase:firebase-firestore:24.7.1")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation("br.com.simplepass:loading-button-android:2.2.0")
    implementation("com.github.bumptech.glide:glide:4.13.0")
    implementation("de.hdodenhof:circleimageview:3.1.0")
    implementation("io.github.vejei.viewpagerindicator:viewpagerindicator:1.0.0-alpha.1")
    implementation("com.shuhart.stepview:stepview:1.5.1")
    implementation("androidx.navigation:navigation-fragment-ktx:2.5.2")
    implementation("androidx.navigation:navigation-ui-ktx:2.5.2")
    implementation("com.google.dagger:hilt-android:2.45")
    kapt("com.google.dagger:hilt-android-compiler:2.45")
    kapt("androidx.hilt:hilt-compiler:1.0.0")
    implementation ("androidx.lifecycle:lifecycle-viewmodel:2.6.1") // Use the latest version
    implementation ("androidx.lifecycle:lifecycle-livedata:2.6.1") // Use the latest version
    implementation ("androidx.lifecycle:lifecycle-viewmodel-savedstate:2.6.1") // Use the latest version
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4") // Use the latest version
    implementation ("androidx.fragment:fragment-ktx:1.6.1")


}

kapt {
    correctErrorTypes = true
}