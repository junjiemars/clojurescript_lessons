(ns rocks.trunk.arlo.calc
  (:require [rocks.trunk.arlo.base :as b]))

(enable-console-print!)

(.log js/console "Arlo, calculating")

(defn ^:export cube [n]
  (* n (b/square n)))


(def ^:const int-var 0x44332211)
