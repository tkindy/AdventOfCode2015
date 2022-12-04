(ns day02)

(defn parse-input [input]
  (throw (RuntimeException. "Not yet implemented")))

(defn read-input []
  (parse-input (slurp "inputs/day02.txt")))

(defn paper-order [boxes]
  (throw (RuntimeException. "Not yet implemented")))

(defn -main []
  (let [boxes (read-input)]
    (println "Part 1:" (paper-order boxes))))
