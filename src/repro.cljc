(ns repro
  (:require
   [lambdaisland.ornament :refer [defstyled]]))

(defn init
  []
  (prn 'init))

;; Works
(defstyled component :div
  {:border (#?(:cljs cljs.core/str
               :clj clojure.core/str)
            "1px solid red")}
  ([props]
   [:<> "foo"]))

;; Doesn't work
#_(defstyled component :div
  {:border (str "1px solid red")}
  ([props]
   [:<> "foo"]))
