(defproject xwf "0.0.1"
  :description "Leiningen ClojureScript Application"
  :source-paths ["src/clj" "src/cljs" "src/brepl"]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.8.40"
                  :exclusions [org.apache.ant/ant]]
                 [compojure "1.5.0"]
                 [ring/ring-core "1.5.0-RC1"]
                 [ring/ring-jetty-adapter "1.5.0-RC1"]
                 [hiccup "1.0.5"]]
  :plugins [[lein-cljsbuild "1.1.3"]
            [lein-ring "0.9.7"
             :exclusions [org.clojure/clojure]]]
  :hooks [leiningen.cljsbuild]
  :profiles {:dev
             {:dependencies []
              :ring
              {:handler arlo.rocks.routes/app
               :init arlo.rocks.routes/init
               :destroy arlo.rocks.routes/destroy
               :repl-options {:repl-listen-port 9000}
               :auto-refresh? true}
              :cljsbuild
              {:builds
               [{:source-paths ["src/brepl" "src/cljs"]
                 :target-path "out"
                 :compiler {:externs []
                            :output-to
                            "resources/public/js/main.js"
                            :optimizations :whitespace
                            :pretty-print true}}]}}
             :pro
             {:cljsbuild
              {:builds
               [{:source-paths ["src/cljs"]
                 :target-path "out"
                 :compiler {:externs []
                            :clojure-output-charset "US-ASCII"
                            :output-to
                            "resource/public/js/main.js"
                            :optimizations :advanced
                            :pretty-print false
                            :warnings true}}]}}})
