(defproject arlo "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.229"]]
  :plugins [[lein-figwheel "0.5.8"]]
  :clean-targets ^{:protect false} ["resources/public/js"
                                    "resources/public/js/arlo.js"
                                    :target-path]
  :source-paths ["src"]
  :profiles {:dev {:dependencies [[figwheel-sidecar "0.5.8"]
                                  [com.cemerick/piggieback "0.2.1"]]
                   :source-paths ["src"]}}
  :repl-options {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}
  :cljsbuild {
              :builds [{:id "dev"
                        :figwheel true
                        :source-paths ["src"]
                        :compiler {:main "arlo.core"
                                   :asset-path "js/out"
                                   :output-to "resources/public/js/arlo.js"
                                   :output-dir "resources/public/js/out"
                                   :optimizations :none
                                   }}
                       {:id "pro"
                        :source-paths ["src"]
                        :compiler {:output-to "resources/public/js/arlo.js"
                                   :optimizations :advanced
                                   :pretty-print false}}]
              }
  :figwheel {:css-dirs ["resources/public/css"]
             :open-file-command "emacsclient"})
