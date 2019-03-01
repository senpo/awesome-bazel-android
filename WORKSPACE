android_sdk_repository(
    name = "androidsdk",
    api_level = 28,
    build_tools_version = "28.0.3",
)

android_ndk_repository(
    name = "androidndk",
)

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

# https://github.com/square/bazel_maven_repository
MAVEN_REPOSITORY_RULES_VERSION = "1.0-rc5"
MAVEN_REPOSITORY_RULES_SHA = "294daa44084ec9a097e2308a9d1b2e73fda5788af232e4e142955fdbe4e60cb5"
http_archive(
    name = "maven_repository_rules",
    urls = ["https://github.com/square/bazel_maven_repository/archive/%s.zip" % MAVEN_REPOSITORY_RULES_VERSION],
    type = "zip",
    strip_prefix = "bazel_maven_repository-%s" % MAVEN_REPOSITORY_RULES_VERSION,
    sha256 = MAVEN_REPOSITORY_RULES_SHA,
)
load("@maven_repository_rules//maven:maven.bzl", "maven_repository_specification")
maven_repository_specification(
    name = "maven",
    artifacts = {
        "com.google.code.findbugs:jsr305:3.0.1": { "insecure": True },
        "com.google.errorprone:error_prone_annotations:2.1.3": { "insecure": True },
        "com.google.guava:guava:25.0-jre": { "insecure": True },
        "com.google.j2objc:j2objc-annotations:1.1": { "insecure": True },
        "org.checkerframework:checker-compat-qual:2.0.0": { "insecure": True },
        "org.codehaus.mojo:animal-sniffer-annotations:1.14": { "insecure": True },
    },
)

