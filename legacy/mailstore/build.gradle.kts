plugins {
    id(ThunderbirdPlugins.Library.android)
}

android {
    namespace = "app.k9mail.legacy.mailstore"
}

dependencies {
    implementation(projects.mail.common)
}
