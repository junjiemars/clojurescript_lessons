(ns arlo.rocks.brepl
  (:require [clojure.browser.repl :as repl]))

(defn connect []
  (repl/connect "http://localhost:9000/repl"))

(defn ^:export init []
  (do (connect)
      (.log js/console "#inited arlo.rocks.brepl")
      true))

