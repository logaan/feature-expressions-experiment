(ns feature-expressions.core
  (:require [feature-expressions.other :refer [foo]]))

(defn -main [& args]
  (foo "kittens"))

(comment
  
  (require 'feature-expressions.core)

  (feature-expressions.core/-main)

  )
