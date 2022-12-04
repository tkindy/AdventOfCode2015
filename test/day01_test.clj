(ns day01-test
  (:require day01
            [clojure.test :refer [deftest is]]))

(def example (day01/parse-input (slurp "examples/day01.txt")))

(deftest end-floor
  (is (= (day01/end-floor example)
         3)))
