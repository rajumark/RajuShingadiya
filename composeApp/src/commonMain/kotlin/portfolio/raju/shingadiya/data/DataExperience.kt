package portfolio.raju.shingadiya.data

import portfolio.raju.shingadiya.screens.experience.Experience
import rajushingadiya.composeapp.generated.resources.Res
import rajushingadiya.composeapp.generated.resources.ic_esjay
import rajushingadiya.composeapp.generated.resources.ic_evince
import rajushingadiya.composeapp.generated.resources.ic_light
import rajushingadiya.composeapp.generated.resources.ic_ub

object DataExperience {

    val experiences = listOf(
        Experience(
            companyName = "Evince Development (CMMI Level 3 Certified)",
            role = "Android Developer",
            duration = "Jan 2023 - Present (2 years 3 months)",
            location = "Ahmedabad, Gujarat, India",
            logoUrl = Res.drawable.ic_evince,
            description = "Worked on AOSP & firmware, advancing into system-level Android development.",
            workTags = listOf(
                "AOSP Development & Custom ROM",
                "Firmware Development",
                "Hardware Abstraction Layer (HAL)",
                "System Services & Custom Framework",
                "SELinux Policies & Secure OS Customization",
                "Advanced Kotlin (Multiplatform, Coroutines, Flow)",
                "Proguard & R8 Security Optimization",
                "Bluetooth & IoT Integration",
                "Android TV & WearOS Development",
                "CI/CD Pipelines (GitHub Actions, Jenkins, Fastlane)"
            )
        ),
        Experience(
            companyName = "Light Link Solutions",
            role = "Android Developer",
            duration = "Oct 2021 - Dec 2023 (2 years 3 months)",
            location = "Rajkot, Gujarat, India",
            logoUrl = Res.drawable.ic_light,
            description = "Developed E-commerce apps, implemented Jetpack libraries & modern UI.",
            workTags = listOf(
                "Jetpack Compose UI Development",
                "MVVM Architecture & Clean Code",
                "Paging Library for Data Handling",
                "Hilt Dependency Injection",
                "Coroutines & Flow",
                "Room Database & Offline Caching",
                "Firebase Services (Auth, Firestore, Analytics)",
                "Google Maps & Location Services",
                "Stripe & Razorpay Payment Integration",
                "Play Store App Bundles & Dynamic Features"
            )
        ),
        Experience(
            companyName = "EsJay IT Solutions Pvt. Ltd.",
            role = "Android Developer",
            duration = "Aug 2020 - Oct 2021 (1 year 3 months)",
            location = "Rajkot, Gujarat, India",
            logoUrl = Res.drawable.ic_esjay,
            description = "Gained domain knowledge in FinTech, focusing on security & performance.",
            workTags = listOf(
                "Secure Android Development (SSL Pinning, Encryption)",
                "Multi-Factor Authentication (Biometric, OTP, MFA)",
                "Room Database & Encrypted Storage (SQLCipher)",
                "Dagger & Hilt for Dependency Injection",
                "WorkManager & Background Processing",
                "Jetpack Navigation Component",
                "LiveData & ViewModel State Management",
                "Retrofit & GraphQL API Communication",
                "Performance Optimization & Profiling",
                "Unit Testing & UI Testing (JUnit, Espresso, Mockito)"
            )
        ),
        Experience(
            companyName = "UnusedBrain Studios",
            role = "Android Developer",
            duration = "Jun 2018 - May 2020 (2 years)",
            location = "Rajkot Area, India",
            logoUrl = Res.drawable.ic_ub,
            description = "Started as an Android Developer, learned the fundamentals and built social media apps.",
            workTags = listOf(
                "Core Android Basics (Activities, Fragments, Lifecycle)",
                "Java & Android SDK Framework",
                "UI/UX Design & XML Layouts",
                "RESTful APIs & JSON Parsing",
                "SQLite & Room Database",
                "Push Notifications (FCM, OneSignal)",
                "Social Media SDKs (Google, Facebook, Twitter)",
                "Version Control (Git, GitHub, Bitbucket)",
                "Google Play Store Deployment",
                "Debugging & Performance Optimization"
            )
        )
    )
}