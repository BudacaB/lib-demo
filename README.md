# Demo Library
### This project is a library for padding Strings in Java.

---

WARNING

Don't use this in production. It was created for demo purposes only.

---

## How to use it:
Add the following dependency:

```
<dependency>
    <groupId>io.github.budacab</groupId>
    <artifactId>lib-demo</artifactId>
    <version>${VERSION}</version>
</dependency>
```

The code

```
StringPadder test = StringPadderFactory.createStringPadder();
System.out.println(test.padLeft("test", 6, 'b'));
```

Will print:

```
---------------------My String
```