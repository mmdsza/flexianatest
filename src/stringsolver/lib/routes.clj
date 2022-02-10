(ns stringsolver.lib.routes
  (:require
    [compojure.core :refer :all]
    [compojure.route :as route]
    [clojure.string :as str]
    [clojure.data.json :as json]
    [stringsolver.lib.api :as api]))


(defn unscramble
  [req]
  {:status 200
   :headers {"Content-Type" "application/json"}
   :body (-> (api/check-full-word (req :params)))})
