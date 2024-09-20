# Simple SBT project for Scala 3

## Running the main method(s)

There is a single “sample” _main method_ available in the `src/scala/Main.scala` file (the function `mainProg`). To use/invoke it from the SBT command prompt issue the following command:

```sh
run
```

If there will be more “main methods” defined you can execute a specific one, e.g., `mainProg` via:

```sh
runMain mainProg
```

## Scalafmt

The project also contains a configuration for the [`Scalafmt`](https://scalameta.org/scalafmt/) tool, which can be used to automatically format the source code.

To check wheather the code requires any adjustments, from the SBT commandline, issue the following command:

```sh
scalafmtCheck
```

To actually apply the needed changes invoke:

```sh
scalafmt
```
