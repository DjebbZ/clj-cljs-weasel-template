(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.1.8"]

                 [org.clojure/clojurescript "0.0-2234"]
                 [com.cemerick/piggieback "0.1.3"]
                 [weasel "0.2.1"]]

  :plugins [[lein-cljsbuild "1.0.3"]
            [lein-ring "0.8.11"]]

  :repl-options {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}

  :source-paths ["src/clj", "src/cljs"]

  :ring {:handler {{name}}.core/handler}

  :cljsbuild {
    :builds [{:id "{{name}}"
              :source-paths ["src/cljs"]
              :compiler {
                :output-to "resources/public/js/{{sanitized}}.js"
                :output-dir "resources/public/js/out"
                :optimizations :none
                :source-map true
                :pretty-print true}}]})
