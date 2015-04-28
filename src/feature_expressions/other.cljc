(ns feature-expressions.other)

(defn foo [x]
  #?(:cljs (.log js/console "Hello from ClojureScript"))
  (println x "Hello, World!"))


(comment
  
  (require 'feature-expressions.other)

  (feature-expressions.other/foo "asdf")

  )
