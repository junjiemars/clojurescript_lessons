(require '[cljs.build.api :as api])

(api/watch "src"
           {:output-to "out/main.js"
            :main 'lesson_one.core})
