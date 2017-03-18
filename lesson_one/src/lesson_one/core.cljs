(ns lesson-one.core)

(enable-console-print!)

(println "Welcome to ClojureScript's World")

(defn ^:export square [n]
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

(defn ^:export square-root [n]
  (square-iter 1.0 n))

(comment
(defn ^:export fibnacci [n]
	(defn fib-iter [a b n]
		(if (zero? n)
			a
			(fib-iter b (+ a b) (dec n))))
	(fib-iter 0 1 n))
)
