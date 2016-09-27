(require '[cljs.build.api :as api])

(api/build "src"
           {:output-to "out/main.js"
            :main 'lesson_one.core})
