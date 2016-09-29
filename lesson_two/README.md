# Lesson Two
Learn how [Figwheel](https://github.com/bhauman/lein-figwheel) build ClojureScript code and how REPL works. 

Go into **lesson_two** directory.


## Wild
> Checkout tag:[Lesson_two/wild](https://github.com/junjiemars/clojurescript_lessons/tree/lesson_two/wild)

### Console REPL
The default port of Figwheel is **3449**, and default web root at **resources/public**. 
Go [Figwheel Server-Side Configuration](https://github.com/bhauman/lein-figwheel#figwheel-server-side-configuration) for details.

```sh
$ cd lesson_two
$ lein figwheel dev
```
* Open browser and goto ```file:///<lesson_two-dir>/resources/public/index.html``` or
goto ```http://localhost:<server-port>/<your-html-filename>```
* Now, you can REPL


## nREPL
> Checkout tag:[lesson_two/emacs](https://github.com/junjiemars/clojurescript_lessons/tree/lesson_two/emacs)

Play with nREPL in [Emacs/cider](https://github.com/bhauman/lein-figwheel/wiki/Using-the-Figwheel-REPL-within-NRepl#integration-with-emacscider).

First, setup Emacs:
```sh
$ cd
$ git clone --depth=1 --branch=master https://github.com/junjiemars/.emacs.d.git
```

Second, open your Emacs, then **cider-jack-in-clojurescript**


