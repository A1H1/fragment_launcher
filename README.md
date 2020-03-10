# Fragment Launcher
An Android library to launch Fragment from already created instance

## Code
```Kotlin
val fragmentLauncher = FragmentLauncher(supportFragmentManager, R.id.fragment)

fragmentLauncher.startFragment(HomeFragment::class.java)

val data = Bundle()
data.putString("key", "value")
        
fragmentLauncher.startFragment(HomeFragment::class.java, data)
```

## Installation
### Gradle
#### Add it in your root build.gradle at the end of repositories:
```Shell
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
```
  
#### Add the dependency
```Shell
dependencies {
  implementation 'com.github.A1H1:fragment_launcher:v0.1.0'
}
```

### Maven
#### Add the JitPack repository to your build file
```xml
<repositories>
  <repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
  </repository>
</repositories>
```
#### Add the dependency
```xml
<dependency>
  <groupId>com.github.A1H1</groupId>
  <artifactId>fragment_launcher</artifactId>
  <version>v0.1.0</version>
</dependency>
```
