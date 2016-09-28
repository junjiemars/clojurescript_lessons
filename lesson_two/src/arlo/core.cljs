(ns arlo.core)

(enable-console-print!)

(.log js/console "Arlo, go")

(defn ^:export square [n]
  (* n n))
