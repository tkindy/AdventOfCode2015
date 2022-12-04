(ns day01
  (:require [clojure.string :as str]))

(defn parse-instruction [instruction]
  (case instruction
    \( :up
    \) :down))

(defn parse-input [input]
  (map parse-instruction (str/trim input)))

(defn read-input []
  (parse-input (slurp "inputs/day01.txt")))

(defn follow-instruction [floor instruction]
  (case instruction
    :up   (inc floor)
    :down (dec floor)))

(defn end-floor [instructions]
  (reduce follow-instruction 0 instructions))

(defn first-basement [instructions]
  (->> instructions 
       (reductions (fn [[i floor] inst] 
                     [(inc i) (follow-instruction floor inst)]) 
                   [0 0])
       (filter (fn [[_ floor]] (< floor 0)))
       first
       first))

(defn -main []
  (let [instructions (read-input)]
    (println "Part 1:" (end-floor instructions))
    (println "Part 2:" (first-basement instructions))))
