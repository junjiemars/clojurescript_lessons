(ns arlo.rocks.core
  (:require [clojure.string :as s]
            [clojure.set :as c]
            [arlo.rocks.brepl :as brepl]))

(defn say-hello []
  (js/alert "Hello, Arlo!"))

(defn ^:export epoch
  "Returns the epoch of now."
  ([] (.getTime (js/Date.)))
  ([s] (.getTime (js/Date. s))))

(defn ^:export str-epoch
  "Returns the string representation of epoch t."
  [t]
  (str (js/Date. t)))

(defn ^:export set-item [k v]
  (.setItem js/localStorage k
            (.stringify js/JSON (clj->js v))))

(defn ^:export get-item [k]
  (when-let [i (.getItem js/localStorage k)]
    (js->clj (.parse js/JSON i) :keywordize-keys true)))

(defn ^:export remove-item [k]
  (.removeItem js/localStorage k))

(defn ^:export length []
  (.-length js/localStorage))

(defn ^:export clear-items
  "Clear all items"
  []
  (.clear js/localStorage))

(defn ^:export item-key
  "Returns the key via the zero based n."
  [n]
  (.key js/localStorage n))

(defn ^:export as-json
  "Returns json of clojure object."
  [o] (clj->js o))


(defn init []
  (if (and js/document
           (.-getElementById js/document))
    (let [m "Hello, from core::->brepl/init..."]
      (brepl/init))))
