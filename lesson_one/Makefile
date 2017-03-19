
default: build

build: out/main.js

clean:
	-$(RM) -r out/*

auto:
	clojurescript auto.clj

repl:
	clojurescript repl.clj

release: src/lesson_one/core.cljs
	clojurescript release.clj

out/main.js: src/lesson_one/core.cljs
	shell clojurescript build.clj

.PHONY: build clean auto repl release
