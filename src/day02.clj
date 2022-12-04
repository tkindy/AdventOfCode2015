(ns day02
  (:require [clojure.string :as str]))

(defn parse-line [line]
  (->> (str/split line #"x")
       (mapv parse-long)))

(defn parse-input [input]
  (map parse-line (str/split-lines (str/trim input))))

(defn read-input []
  (parse-input (slurp "inputs/day02.txt")))

(defn face-areas [[l w h]]
  [(* l w)
   (* w h)
   (* l h)])

(defn paper-needed [box]
  (let [[a b c] (face-areas box)]
    (+ (* 2 a)
       (* 2 b)
       (* 2 c)
       (min a b c))))

(defn paper-order [boxes]
  (->> boxes
       (map paper-needed)
       (apply +)))

(defn ribbon-order [boxes]
  0)

(defn -main []
  (let [boxes (read-input)]
    (println "Part 1:" (paper-order boxes))
    (println "Part 2:" (ribbon-order boxes))))
