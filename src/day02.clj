(ns day02
  (:require [clojure.string :as str]))

(defn parse-line [line]
  (->> (str/split line #"x")
       (mapv parse-long)))

(defn parse-input [input]
  (map parse-line (str/split-lines (str/trim input))))

(defn read-input []
  (parse-input (slurp "inputs/day02.txt")))

(defn paper-order [boxes]
  (throw (RuntimeException. "Not yet implemented")))

(defn -main []
  (let [boxes (read-input)]
    (println "Part 1:" (paper-order boxes))))
