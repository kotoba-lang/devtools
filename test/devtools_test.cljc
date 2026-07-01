(ns devtools-test
  (:require [clojure.test :refer [deftest is testing]]
            [devtools]))
(deftest namespace-loads
  (testing "the restored CLJC namespace loads"
    (is (some? devtools))))
