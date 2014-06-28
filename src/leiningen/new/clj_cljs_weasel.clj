(ns leiningen.new.clj-cljs-weasel
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "clj-cljs-weasel"))

(defn clj-cljs-weasel
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' clj-cljs-weasel project.")
    (->files data
             ["project.clj" (render "project.clj" data)]
             [".gitignore" (render ".gitignore" data)]
             "resources/public/css"
             "resources/public/js"
             "resources/public/img"
             ["resources/public/index.html" (render "index.html" data)]
             ["src/clj/user.clj" (render "user.clj" data)]
             ["src/clj/{{sanitized}}/core.clj" (render "cljcore.clj" data)]
             ["src/cljs/{{sanitized}}/connect.cljs" (render "connect.cljs" data)]
             ["src/cljs/{{sanitized}}/core.cljs" (render "cljscore.cljs" data)])))
