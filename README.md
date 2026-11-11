# Workshop 6 - Java Collections and OOP Concepts

Melbourne Polytechnic - Workshop 6. All seven exercises, compiled and run with JDK 21.

## Folder contents

| Path | What it is |
| --- | --- |
| `src/` | Java source files: `Exercise1.java` ... `Exercise7.java` and `Boxes.java` |
| `bin/` | Compiled `.class` files (output of `javac`) |
| `outputs/` | The console output of every program, saved as plain text |
| `screenshots/` | One screenshot per exercise, taken from the real run (used in the answer document) |
| `Workshop 6 - Java Collections (Answers).docx` | The submitted answer document: task, approach, code and output for each exercise |

## Exercises

| Exercise | File | Topic |
| --- | --- | --- |
| 1 (Easy) | `Exercise1.java` | Two parallel String arrays: 10 songs and their artists |
| 2 (Hard) | `Exercise2.java` | Bubble sort of the songs in alphabetical order, artists kept paired |
| 3 (Medium) | `Exercise3.java` | Reversing the letters of every word, punctuation kept in place |
| 4 (Easy) | `Exercise4.java` | Substitution-cipher decoder for "G tgsl Qefe." (output: "I like Java.") |
| 5 (Medium) | `Exercise5.java` | Search engine over an array of 10 paragraphs |
| 6 (Easy) | `Exercise6.java` | `IdentifyMyParts`: class variable vs instance variable, and its output |
| 7 (Medium) | `Boxes.java`, `Exercise7.java` | `Boxes` class (size 1-10, `toString`, `draw`) and the driver class |

## Compile and run

From this folder (JDK 21, `javac` and `java` on the PATH):

```
javac -encoding UTF-8 -d bin src\*.java
java -cp bin Exercise1
```

Replace `Exercise1` with `Exercise2` ... `Exercise7` to run the others.
`Exercise4` and `Exercise5` also accept the message or the search phrase as an argument, for example:

```
java -cp bin Exercise4 "G tgsl Qefe."
java -cp bin Exercise5 "Victoria"
```

## Run in VS Code

1. Open the folder `Workshop6_Java_Collections` (File > Open Folder), or double-click `Workshop6.code-workspace`.
2. `.vscode/settings.json` already declares `src` as the source root and `bin` as the output path, so the Java extension compiles all files together (Exercise 7 needs `Boxes.java`).
3. Open the Run and Debug panel (Ctrl+Shift+D) and pick one of the seven configurations, for example `Exercise 7 - Boxes`, then press F5. Output appears in the integrated terminal.
4. The configurations already pass `-Dstdout.encoding=UTF-8`, which is needed on Windows for the `\u2500` box of Exercise 7.

