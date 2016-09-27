(require '[cljs.repl :as repl])
(require '[cljs.build.api :as api])
(require '[cljs.repl.browser :as browser])

(api/build "src"
           {:output-to "out/main.js"
            :main 'lesson_one.core
            :verbose true})

(repl/repl (browser/repl-env)
           :watch "src"
           :output-dir "out")
