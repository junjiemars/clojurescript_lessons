(defproject arlo "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.229"]]
  :plugins [[lein-figwheel "0.5.8"]]
  :clean-targets ^{:protect false} ["resources/public/js"
                                    "resources/public/js/arlo.js"
                                    :target-path]
  :source-paths ["src"]
  :cljsbuild {
              :builds [{:id "dev"
                        :source-paths ["src"]
                        :figwheel true
                        :compiler {:main "arlo.core"
                                   :asset-path "js/out"
                                   :output-to "resources/public/js/arlo.js"
                                   :output-dir "resources/public/js/out"
                                   :optimizations :none
                                   }
                        }]
              }
  :figwheel {:css-dirs ["resources/public/css"]
             :open-file-command "emacsclient"})
