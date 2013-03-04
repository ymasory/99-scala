# 99-scala #

Purely functional solutions to Phil Gold's [99 Scala Problems](http://aperiodic.net/phil/scala/s-99/).

Features:
- I define all non-primitive types myself.
For example, I don't use Scala's List, but instead show how to define it.
- The solutions can serve as a simple demonstration of:
  - typeclasses
  - implicit type enhancement ("type pimping")
  - context bounds
- All solutions terminate in values for all inputs.
Instead of exceptions or partial functions, I use `Option` and related types where appropriate.

Non-goals:
- Unfortunately, the solutions aren't especially readable for programmers new to Scala. 

## Build ##

```sh
$ cd 99-scala
$ ./sbt
> compile
```

## Contact ##

- Yuvi Masory
- <a href="ymasory@gmail.com">ymasory@gmail.com</a>
