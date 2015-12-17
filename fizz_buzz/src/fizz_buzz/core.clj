(ns fizz-buzz.core
  (:gen-class))

(defn fizz? [number]
  (zero? (rem number 3)))

(defn buzz? [number]
  (zero? (rem number 5)))

(defn fizz-buzz? [number]
  (and (fizz? number) (buzz? number)))

(defn fizz-buzz [number]
  (cond 
    (fizz-buzz? number) (println "fizzbuzz")
    (buzz? number) (println "buzz")
    (fizz? number) (println "fizz")
    :else (println number)))

(defn -main [& args]
  (doall (map fizz-buzz (range 1 101))))
