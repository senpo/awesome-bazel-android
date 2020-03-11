package com.awesome.android.hello;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

//import com.awesome.android.helloworld.R;

public class MainActivity extends Activity {

  private static final String TAG = "helloworld";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Log.v(TAG, "Hello, Android");
  }
}
