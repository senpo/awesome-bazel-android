android_binary(
    name = "helloworld",
    srcs = glob(["*.java"]),
    manifest = "AndroidManifest.xml",
    multidex = "native",
    resource_files = glob(["res/**"]),
    proguard_specs = [
    ],
    deps = [
        "@maven//com/google/guava:guava",
        "@maven//com/github/bumptech/glide:glide",
        "@maven//com/google/auto/value:value",
    ],
)
