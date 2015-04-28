(ns feature-expressions.core
  (:require [feature-expressions.other :refer [foo]]))

(defn -main [& args]
  (foo "hello"))

(comment
  
  (require 'feature-expressions.core)

  )
