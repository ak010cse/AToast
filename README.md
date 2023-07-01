# AToast
Simple Toast Library

> Step 1. Add the JitPack repository to your build file
```gradle
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
> Step 2. Add the dependency
```gradle
dependencies {
	        implementation 'com.github.ak010cse:AToast:1.0.5'
	}
```
# Builder usage
```gradle
 AToast.showToast(context,"Message")
```
