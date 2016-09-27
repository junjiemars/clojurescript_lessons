(require '[cljs.build.api :as api])

(api/build "src"
           {:output-to "out/main.js"
            :optimizations :advanced
            :verbose true})

(System/exit 0)
