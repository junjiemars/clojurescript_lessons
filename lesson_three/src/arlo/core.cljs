(ns arlo.core)

(enable-console-print!)

(.log js/console "Arlo, go")

(defn ^:export square [n]
  (* n n))

(defn ^:export fibonacci [n]
  (defn fib-iter [a b n]
    (if (zero? n)
      a
      (fib-iter b (+ a b) (dec n))))
  (fib-iter 0 1 n))

(def ^:const int-var 0x44332211)
