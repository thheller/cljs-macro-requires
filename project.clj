(defproject barecljs "0.1.0"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2080"]
                 [org.clojure/core.async "0.1.242.0-44b1e3-alpha"]]

  :source-paths ["src"]

  :plugins [[lein-cljsbuild "1.0.0"]]

  :cljsbuild
  {:builds
    [{:id "dev"
      :source-paths ["src"]
      :compiler {:output-to "main.js"
                 :output-dir "out"
                 :optimizations :none}}
     {:id "node"
      :source-paths ["src"]
      :compiler {:output-to "main.js"
                 :optimizations :simple
                 :pretty-print true}}] })
