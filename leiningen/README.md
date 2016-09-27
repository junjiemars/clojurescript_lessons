Leiningen
===========
[Leiningen](https://github.com/technomancy/leiningen) had been designed carefully,
but it is stable and faster, so you don't warry fuck it up.


## Requirements
1. [clojure1.6+](https://github.com/clojure/clojure.git)
2. [lein2.2+](https://github.com/technomancy/leiningen.git)

## How to build
* Clean the generated JavaScript file:
```sh
rm resources/public/js/main.js
```
* Build for Debug:
```sh
DEBUG=1 lein with-profiles dev cljsbuild once
```
* Build for Production:
```sh
DEBUG=1 lein with-profiles pro cljsbuild once
```



