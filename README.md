# Awesome Bazel for Android
A curated list of building Android stuff with Bazel

### Official Bazel Docs
* References
  * [Workspace Rules](https://docs.bazel.build/versions/master/be/workspace.html)
  * [Android Rules](https://docs.bazel.build/versions/master/be/android.html)
  * [bazel Command-Line Reference](https://docs.bazel.build/versions/master/command-line-reference.html)
  * [bazel mobile-install](https://docs.bazel.build/versions/master/mobile-install.html)
* Tutorials
  * [Official Android App Tutorial](https://docs.bazel.build/versions/master/tutorial/android-app.html)
  * [Android NDK with Bazel](https://docs.bazel.build/versions/master/android-ndk.html)
* [Examples](https://github.com/bazelbuild/examples)
  * [Firebase example](https://github.com/bazelbuild/examples/tree/master/android/firebase-cloud-messaging)
* Manage Dependencies
  * [Working with external dependencies](https://docs.bazel.build/versions/master/external.html)
  * [Generate external dependencies from Maven projects](https://docs.bazel.build/versions/master/generate-workspace.html)
* Deep Dives
  * [How Android Builds Work in Bazel](https://blog.bazel.build/2018/02/14/how-android-builds-work-in-bazel.html)
* Bazel for Java stuff. Might be useful...
  * [Migrating from Maven to Bazel](https://docs.bazel.build/versions/master/migrate-maven.html)
* Future Planning Docs
  * [Bazel External Deps Roadmap](https://www.bazel.build/roadmaps/external-deps.html)

### Android Studio with Bazel
* https://ij.bazel.build/docs/bazel-plugin.html
* https://ij.bazel.build/docs/import-project.html
* https://ij.bazel.build/docs/project-views.html

### Bazel Practices
* Use [bazel_maven_repository](https://github.com/square/bazel_maven_repository) or [rules_jvm_external](https://github.com/bazelbuild/rules_jvm_external) to fetch and resolve Maven artifacts, including the ones on Google Maven Repository.
* Build the [bazel plugin from source](https://github.com/bazelbuild/intellij). Why? The version of Bazel plugin on the JetBrains' plugin repository is not always built for the latest Android Studio version. Then you won’t be able to find it while you are in the latest Android Studio.

### Examples
* https://github.com/google/startup-os/tree/master/examples/android
* https://github.com/bazelbuild/bazel/tree/master/examples/android
* [Tensorflow Lite example](https://github.com/tensorflow/tensorflow/tree/master/tensorflow/lite/java/demo)

### Misc Tutorial
* https://codelabs.developers.google.com/codelabs/bazel-android-intro/index.html


### Other Awesome List
* https://github.com/jin/awesome-bazel
