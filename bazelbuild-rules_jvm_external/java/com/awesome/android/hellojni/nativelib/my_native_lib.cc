#include <jni.h>

const char* hello = "Hello JNI";

// the function name, which is based on the Java function name and the path to the file containing
// it. Construct it according to the following rules:
// 1) Prepend Java_ to it.
// 2) Describe the filepath relative to the top-level source directory.
// 3) Use underscores in place of forward slashes.
// 4) Omit the .java file extension.
// 5) After the last underscore, append the function name.

// jstring, is a data type defined in the Java Native Interface Specification. It is not actually a
// string, but a pointer to a Java string.
extern "C"
JNIEXPORT jstring
JNICALL
Java_com_senpo_android_hello_hellojni_nativelib_NativeLib_stringFromJNI(JNIEnv *env, jclass clazz) {
  // return NewStringLatin1(env, hello);
  return env->NewStringUTF("Hello from JNI");
}
