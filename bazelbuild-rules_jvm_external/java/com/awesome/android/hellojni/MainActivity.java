package com.awesome.android.hellojni;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.awesome.android.hellojni.nativelib.NativeLib;

public class MainActivity extends Activity {

  static {
    System.loadLibrary("hellojni");
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Log.v("MainActivity", "Hello, Android");

    // This function call takes the "testapp" argument and loads the "libtestapp.so" file.
    //
    // When building the app: $ bazel build //java/com/google/prototype/android/jni/hellojni/testapp:testapp
    // Bazel compiles all of the cc_libraries into a single shared object (.so) file, targeted for
    // the armeabi-v7a ABI by default.
    //
    // Use this command to know where lib/armeabi-v7a/libtestapp.so is located
    // $ zipinfo -1 bazel-bin/java/com/google/prototype/android/jni/hellojni/testapp/testapp.apk

    Log.v("MainActivity", "JNI says: " + NativeLib.stringFromJNI());
  }
}
