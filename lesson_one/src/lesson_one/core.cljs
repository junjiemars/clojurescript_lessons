(ns lesson-one.core
  (:require [clojure.browser.repl :as repl]))

(defonce conn
  (repl/connect "http://localhost:9000/repl"))

(enable-console-print!)

(println "Welcome to ClojureScript's World")


(defn square [n]
  (* n n))

(defn average [x y]
  (/ (+ x y) 2))

(defn abs [x]
  (if (< x 0)
    (- 0 x)
    x))

(defn good-enough? [guess x]
  (< (abs (- (square guess) x))
     (* 0.001 x)))

(defn improve [guess x]
  (average guess (/ x guess)))

(defn square-iter [guess x]
  (if (good-enough? guess x)
    guess
    (square-iter (improve guess x) x)))

(defn square-root [n]
  (square-iter 1.0 n))
