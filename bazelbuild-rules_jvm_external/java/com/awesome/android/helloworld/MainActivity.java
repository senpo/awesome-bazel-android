package com.awesome.android.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

  private static final String TAG = "helloworld";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Log.v(TAG, "Hello, Android");

    Animal animal = Animal.create("Lion", 4);
    Log.i(TAG, "animal: " + animal);
  }
}
