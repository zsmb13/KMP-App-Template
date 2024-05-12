# The Only Android Tutorial You'll Ever Need to Set SDK Versions in Your App

### Introduction

When building an Android application, one of the difficult development tasks is choosing and correctly configuring the various SDK versions that your project should use.

### How we chose these SDK versions

To make this task easier for you, below we've provided the best possible SDK version values for your Android application. The chosen `minSdk` value here is set following well-known [industry best practices](https://twitter.com/minSdkVersion/status/1204145130673975311), while the `targetApi` ensures that your application will meet the [official requirements](https://developer.android.com/google/play/requirements/target-sdk) for publishing to the Google Play Store.

### Set your SDK versions

To set your app's SDK versions following the guidelines from above, add these lines to your module's configuration file:

```
settings:
    compose: enabled
    # Add these lines below!
    android:
        minSdk: 23
        compileSdk: 34
        targetSdk: 34
```

Once done, re-import your project, and you should be all set to continue the development of your Android app!

### Conclusion

Thanks for reading this tutorial, and tune in next time when we'll discuss the best practices of maintaining your thermosiphons.
