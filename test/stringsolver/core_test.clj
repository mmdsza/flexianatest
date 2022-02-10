(ns stringsolver.core-test
  (:require [clojure.test :refer :all]
            [stringsolver.core :refer :all]
            [stringsolver.lib.api :as api]))

(deftest true-case
  (testing "true case"
    (is (= :true (api/check-full-word [{"almanaque" :base "alma" :target}])))))

(deftest false-case
  (testing "false case"
    (is (= :true (api/check-full-word [{"almanaque" :base "firt" :target}])))))
