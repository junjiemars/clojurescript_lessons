(defproject arlo "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.229"]]
  :plugins [[lein-figwheel "0.5.9"]]
  :clean-targets ^{:protect false} ["resources/public/js"
                                    "resources/public/js/arlo.js"
                                    :target-path]
  :source-paths ["src"]
  :profiles {:dev {:dependencies [[figwheel-sidecar "0.5.9"]
                                  [com.cemerick/piggieback "0.2.1"]]
                   :source-paths ["src"]}}
  :repl-options {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}
  :cljsbuild {
              :builds [{:id "dev"
                        :figwheel true
                        :source-paths ["src"]
                        :compiler {:main "rocks.trunk.arlo.calc"
                                   :asset-path "js/out"
                                   :output-to "resources/public/js/arlo.js"
                                   :output-dir "resources/public/js/out"
                                   :optimizations :none
                                   :modules {:base
                                             {:output-to "resources/public/js/base.js"
                                              :entries #{"rocks.trunk.arlo.base"}}
                                             :calc
                                             {:output-to "resources/public/js/calc.js"
                                              :entries #{"rocks.trunk.arlo.calc"}
                                              :depends-on #{:base}}}
                                   }}
                       {:id "pro"
                        :source-paths ["src"]
                        :compiler {:output-to "resources/public/js/arlo.js"
                                   :optimizations :advanced
                                   :pretty-print false}}]
              }
  :figwheel {:css-dirs ["resources/public/css"]
             :open-file-command "emacsclient"})
