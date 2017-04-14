(defproject arlo "0.1.1-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.473"]]
  
  :plugins [[lein-figwheel "0.5.9"]
            [lein-cljsbuild "1.1.5"]]
  
  :clean-targets ^{:protect false} ["resources/public/js"
                                    "resources/public/js/arlo.js"
                                    :target-path]
  

  :profiles {:dev {:dependencies [[figwheel-sidecar "0.5.9"]
                                  [com.cemerick/piggieback "0.2.1"]]
                   :cljsbuild
                   {:builds [{:id "dev"
                              :source-paths ["src" "externs"]
                              :figwheel {
                                         :open-urls ["http://localhost:3449/index.html"]
                                         }
                              :compiler {:main "arlo.core"
                                         ;; :externs []
                                         :asset-path "js/out"
                                         :output-to "resources/public/js/arlo.js"
                                         :output-dir "resources/public/js/out"
                                         :optimizations :none
                                         }}]
                    }
                   }
             
             :pro {:cljsbuild
                   {:builds
                    [{:source-paths ["src" "externs"]
                      :compiler {:externs []
                                 :output-to "resources/public/js/arlo.js"
                                 ;; :closure-output-charset "US-ASCII"
                                 :optimizations :advanced
                                 ;; :optimize-constants true
                                 ;; :static-fns true
                                 :pretty-print false}
                      }]}
                   }
             }

  :figwheel {
             :css-dirs ["resources/public/css"]
             :open-file-command "emacsclient"
             :server-logfile ".figwheel.log"
             }

  :aliases {"pro"     ["with-profile" "pro"
                       "do"
                       ["clean"]
                       ["cljsbuild" "once"]]
            }
  )
