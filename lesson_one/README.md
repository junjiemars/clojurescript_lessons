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
> Checkout the commit with comment "Wild Hello World".
It does works yet.

## It's working
> Checkout the commit with comment "Lesson_One:It's working".
```sh
clojurescript build.clj
```

## Specify **main** on build
> Checkout the commit with comment "Lesson_One:Specify main on build".
Observe the changes in **index.html**

## Auto building
> Checkout the commit with comment "Lesson_One:Auto building".
ClojureScript will watching **src** directory for changing.
```sh
$ clojurescript auto.clj
```

## REPL
> Checkout the commit with comment "Lesson_One:REPL".
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
Checkout the commit with comment "Lesson_One:The simplest Release".



