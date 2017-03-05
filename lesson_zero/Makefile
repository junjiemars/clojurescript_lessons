
default: build

build: out/main.js
clean:
	-$(RM) -r out/*

out/main.js: src/hello_world/core.cljs
	$(shell clojurescript build.clj)

.PHONY: build clean
