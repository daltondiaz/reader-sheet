(ns reader-sheet.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "I am a little teapot!"))

; Bind a name to a value
; In this case fruits is a vector with three String
(def fruits
  ["Melon"
   "Orange"
   "Banana"])


; Other example
(def fruits-day "Melon")

; Change the fruit and you'll the result
(def my-fruit "Melon")

(def message "Today fruit ")
(if (= fruits-day my-fruit)
  (def message (str message "is " fruits-day))
  (def message (str message "isn't " fruits-day)))

(println message)

; end Other example
