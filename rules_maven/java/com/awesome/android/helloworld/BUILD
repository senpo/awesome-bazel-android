load("@rules_maven//:defs.bzl", "artifact")

android_binary(
    name = "helloworld",
    srcs = glob(["*.java"]),
    manifest = "AndroidManifest.xml",
    multidex = "native",
    resource_files = glob(["res/**"]),
    proguard_specs = [
    ],
    deps = [
        artifact("android.arch.lifecycle:common:1.1.1"),
        artifact("android.arch.lifecycle:viewmodel:1.1.1"),
        artifact("androidx.test.espresso:espresso-web:3.1.1"),
        artifact("junit:junit:4.12"),
        artifact("com.android.support:design:27.0.2"),
    ],
)
