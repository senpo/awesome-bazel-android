package com.awesome.android.helloworld;

import com.google.auto.value.AutoValue;

// See https://github.com/google/auto/blob/master/value/userguide/index.md
@AutoValue
abstract class Animal {
  static Animal create(String name, int numberOfLegs) {
    return new AutoValue_Animal(name, numberOfLegs);
  }

  abstract String name();
  abstract int numberOfLegs();
}
