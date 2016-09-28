# Lesson One

## Install ClojureScript
You can install ClojureScript from Bash, use Git-Bash if you on Windows.
```sh
# install
$ HAS_CLOJURESCRIPT=1 bash <(curl https://raw.githubusercontent/junjiemars/kit/master/ul/install-java-kits.sh)

# run
$ clojurescript
```

## Wild Hello World
> Checkout tag:[lesson_one/wild](https://github.com/junjiemars/clojurescript_lessons/tree/lesson_one/wild) which commented with "Wild Hello World".
It doesn't works yet.

## It's working
> Checkout tag:[lesson_one/working](https://github.com/junjiemars/clojurescript_lessons/tree/lesson_one/working) which commented with "Lesson_One:It's working".
```sh
clojurescript build.clj
```

## Specify **main** on build
> Checkout tag:[lesson_one/main](https://github.com/junjiemars/clojurescript_lessons/tree/lesson_one/main) which commented with "Lesson_One:Specify main on build".
Observe the changes in **index.html**

## Auto building
> Checkout tag:[lesson_one/auto](https://github.com/junjiemars/clojurescript_lessons/tree/lesson_one/auto) wich  commented with "Lesson_One:Auto building".
ClojureScript will watching **src** directory for changing.
```sh
$ clojurescript auto.clj
```

## REPL
> Checkout tag:[lesson_one/repl](https://github.com/junjiemars/clojurescript_lessons/tree/lesson_one/repl) which commented with "Lesson_One:REPL".
* run repl.clj
```sh
$ clojurescript repl.clj

# to quit, type: :cljs/quit
```
* run auto.clj watching **src**
```sh
$ clojurescript auto.clj
```
* open browser and go http://localhost:9000
* wating REPL's log
```sh
$ tail -f out/watch.log
```

## The simplest Release
> Checkout the commit with comment "Lesson_One:The simplest Release".

* Cut the **REPL** code out;
* **^:export** to export **square** and **square-root** functions;

```sh
# build to release
$ clojurescript release.clj
```



