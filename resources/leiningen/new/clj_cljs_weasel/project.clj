(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.1.8"]

                 [org.clojure/clojurescript "0.0-2268"]
                 [com.cemerick/piggieback "0.1.3"]
                 [weasel "0.3.0"]]

  :plugins [[lein-cljsbuild "1.0.3"]
            [lein-ring "0.8.11"]]

  :repl-options {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}

  :source-paths ["src/clj", "src/cljs"]

  :resource-paths ["resources", "target/cljsout"]

  :ring {:handler {{name}}.core/handler}

  :cljsbuild {
    :builds {
      :dev
        {:source-paths ["src/cljs"]
         :compiler     {
           :output-to     "target/cljsout/public/js/{{sanitized}}.js"
           :output-dir    "target/cljsout/public/js"
           :optimizations :whitespace
           ;:source-map    "target/cljsout/public/js/{{sanitized}}.js.map"
           }}}})
