(ns day02-test
  (:require day02
            [clojure.test :refer [deftest is]]))

(def example (day02/parse-input (slurp "examples/day02.txt")))

(deftest paper-order
  (is (= (day02/paper-order example)
         101)))
