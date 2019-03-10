android_binary(
    name = "helloworld",
    srcs = glob(["*.java"]),
    manifest = "AndroidManifest.xml",
    multidex = "native",
    resource_files = glob(["res/**"]),
    proguard_specs = [
    ],
    deps = [
        "@google_bazel_common//third_party/java/jsr305_annotations",
        "@google_bazel_common//third_party/java/guava",
    ],
)
