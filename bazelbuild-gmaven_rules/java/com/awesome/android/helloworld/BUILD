load("@gmaven_rules//:defs.bzl", "gmaven_artifact")

android_binary(
    name = "helloworld",
    srcs = glob(["*.java"]),
    manifest = "AndroidManifest.xml",
    multidex = "native",
    resource_files = glob(["res/**"]),
    proguard_specs = [
    ],
    deps = [
        gmaven_artifact("com.android.support:appcompat-v7:aar:28.0.0"),
        gmaven_artifact("com.android.support:cardview-v7:aar:28.0.0"),
        gmaven_artifact("com.android.support:design:aar:28.0.0"),
        gmaven_artifact("com.android.support:drawerlayout:aar:28.0.0"),
        gmaven_artifact("com.android.support:recyclerview-v7:aar:28.0.0"),
        gmaven_artifact("com.android.support:support_annotations:jar:28.0.0"),
        gmaven_artifact("com.android.support:support-compat:aar:28.0.0"),
        gmaven_artifact("com.android.support:support-fragment:aar:28.0.0"),
        gmaven_artifact("com.android.support:support-v4:aar:28.0.0"),
        gmaven_artifact("com.android.support.constraint:constraint-layout:aar:1.1.3"),
    ],
)
