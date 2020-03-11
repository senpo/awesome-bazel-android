package com.senpo.android.hello.hellojni.nativelib;

public class NativeLib {

  // The native keyword in this method declaration tells the virtual machine that the function is in
  // the shared library (that is, implemented on the native side).
  public static native String stringFromJNI();
}
