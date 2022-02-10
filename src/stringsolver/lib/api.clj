(ns stringsolver.lib.api
  (:require [clojure.string :as str]
            [clojure.set :as cljset]
            [compojure.core :refer :all]
            [compojure.route :as route]))

(defn string-splitter
  [word]
  (str/split word #""))

(defn get-uniques-pair [x y]
  (cljset/intersection (set x) (set y)))

(defn get-uniques-self [x]
  (set (distinct x)))

(defn check-full-word [{x :base y :target}]
 (cond
  (= (get-uniques-self y) (get-uniques-pair x y)) :true
  :else :false))
