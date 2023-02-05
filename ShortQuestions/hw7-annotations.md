##### @Override
- check if the override function is right

##### @Controller
- annotation in class, check if the method use @RequestMapping to deal with http request

##### @FunctionalInterface 
@FunctionalInterface annotation, introduced in Java SE 8, indicates that the type declaration is intended to be a functional interface, as defined by the Java Language Specification.

##### @Deprecated 
@Deprecated annotation indicates that the marked element is deprecated and should no longer be used. The compiler generates a warning whenever a program uses a method, class, or field with the @Deprecated annotation. When an element is deprecated, it should also be documented using the Javadoc @deprecated tag, as shown in the following example. The use of the at sign (@) in both Javadoc comments and in annotations is not coincidental: they are related conceptually. Also, note that the Javadoc tag starts with a lowercase d and the annotation starts with an uppercase D.
```
@Deprecated
static void deprecatedMethod() { }
}
```
