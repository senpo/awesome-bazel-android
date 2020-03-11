android_binary(
    name = "hellojni",
    srcs = [
        "MainActivity.java",
    ],
    manifest = "AndroidManifest.xml",
    multidex = "native",
    resource_files = glob(["res/**"]),
    deps = [
        "//java/com/awesome/android/hellojni/nativelib",
    ],
)
