android_library(
    name = "nativelib",
    srcs = ["NativeLib.java"],
    visibility = ["//visibility:public"],
    deps = [":my_nativelib"],
)

cc_library(
    name = "my_nativelib",
    srcs = ["my_native_lib.cc"],
)
