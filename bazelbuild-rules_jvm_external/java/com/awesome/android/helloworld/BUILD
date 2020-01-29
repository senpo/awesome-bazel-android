load("@rules_jvm_external//:defs.bzl", "artifact")
#load("@rules_android//android:rules.bzl", "android_binary")

android_binary(
    name = "helloworld",
    srcs = glob(["*.java"]),
    manifest = "AndroidManifest.xml",
    multidex = "native",
    resource_files = glob(["res/**"]),
    proguard_specs = [
    ],
    deps = [
        artifact("android.arch.lifecycle:common"),
        artifact("android.arch.lifecycle:viewmodel"),
        artifact("androidx.test.espresso:espresso-web"),
        artifact("junit:junit"),
        artifact("com.android.support:design"),
        "//third_party/java/auto:value",
    ],
)
