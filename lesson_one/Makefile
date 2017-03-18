
default: build

build: out/main.js

clean:
	-$(RM) -r out/*

auto_build:
	$(shell clojurescript auto.clj)

repl:
	+$(shell clojurescript repl.clj)

release: src/lesson_one/core.cljs
	$(shell clojurescript release.clj)

out/main.js: src/lesson_one/core.cljs
	$(shell clojurescript build.clj)

.PHONY: build clean auto_build repl release
