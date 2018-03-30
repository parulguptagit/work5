
(ns work5.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  ;(println "Hello, World!")
  (println "==>defining a vector reference variable x1")
  (def x1 (ref []))
  (println "==> defining a defrecord i.e. class BigTkt[cntr]")
  (defrecord BigTkt[cntr])
  (println "==> instantiating BigTkt with a ref to x1")
  (def myTkt(work5.core.BigTkt. (ref x1)))
  (println "==> printing both x1 & myTkt")
  (println x1)
  (println myTkt)
  (println "===> modifying x1")
  (dosync (ref-set x1 (conj (deref x1) "223-456")))
  (println "===> printing both x1 & myTkt")
  (println x1)
  (println myTkt)
  )
