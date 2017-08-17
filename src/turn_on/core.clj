(ns turn-on.core
  (:require [toledohue.hue :refer [get-light-info]])
  (:use [toledohue.hue])
  (:gen-class))


(defn -main
  "turns on my hue light"
  []
  (turn-on 1 (get-user)))


