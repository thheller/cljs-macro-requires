(ns bare.core
  (:require-macros [cljs.core.async.macros :refer (go)]))

(go (js/console.log (+ 2 2)))
