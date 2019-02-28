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
* Use [gmaven_rules](https://github.com/bazelbuild/gmaven_rules) to load external repository targets for all artifacts in [Google Maven Repository](https://dl.google.com/dl/android/maven2/index.html).
  * For specific target names, check out the full list of generated targets in [gmaven.bzl](https://raw.githubusercontent.com/aj-michael/gmaven_rules/master/gmaven.bzl).

### Examples
* https://github.com/google/startup-os/tree/master/examples/android
* https://github.com/bazelbuild/bazel/tree/master/examples/android
* [Tensorflow Lite example](https://github.com/tensorflow/tensorflow/tree/master/tensorflow/lite/java/demo)
* [Firebase example](https://github.com/bazelbuild/examples/tree/master/android/firebase-cloud-messaging)

### Misc Tutorial
* https://codelabs.developers.google.com/codelabs/bazel-android-intro/index.html


### Other Awesome List
* https://github.com/jin/awesome-bazel
