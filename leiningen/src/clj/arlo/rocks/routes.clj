(ns arlo.rocks.routes
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [compojure.handler :as handler]
            [arlo.rocks.views :as v])
  (:gen-class))

(defn init []
  (println "#init lein ring..."))

(defn destroy []
  (println "#destroy lein ring..."))

(defroutes app-routes
  (GET "/" [] "<p>cOOl!</p>")
  (GET "/repl" [] (v/repl-demo-page))
  (route/resources "/")
  (route/not-found "<h1>Page not found</h1>"))

(def app
  (-> (handler/site app-routes)))


