# FeedParser

[![language: kotlin](https://img.shields.io/badge/language-kotlin-blue.svg)](https://kotlinlang.org/) [![language: java](https://img.shields.io/badge/language-java-orange.svg)](https://kotlinlang.org/) [![MIT license](https://img.shields.io/badge/License-MIT-blue.svg)](https://github.com/ygpedroso/feedParser/blob/master/LICENSE)

## Installation
### Gradle

Add the JitPack repository in your root `build.gradle` at the end of repositories:
```groovy
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

Add the following line to the `dependencies` section of your `build.gradle` file:
```groovy
implementation 'com.github.ygpedroso:feedParser:0.2'
```

### Maven

Add the JitPack repository in your `build` file:
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

Add the dependency in your `build` file:
```xml
<dependency>
    <groupId>com.github.ygpedroso</groupId>
    <artifactId>feedParser</artifactId>
    <version>0.2</version>
</dependency>
```

## How to use
### Java
```java
Parser parser = new Parser(rssSource);
Rss rss = parser.getRss();
```

### Kotlin
```kotlin
var parser = Parser(rssSource)
var rss = parser.getRss()
```

The `rssSource` variable that the `Parser` class receives as a constructor parameter, can be of any of this class types:
* `String`
* `java.io.File`
* `java.io.Reader`
* `java.io.InputStream`
* `org.simpleframework.xml.stream.InputNode`


## License
FeedParser is [MIT-licensed](https://github.com/ygpedroso/feedParser/blob/master/LICENSE).
