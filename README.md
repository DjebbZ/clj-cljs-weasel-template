# clj-cljs-weasel

A Leiningen template that creates a project with support for both Clojure and ClojureScript.
It includes a basic ring setup serving the ClojureScript files and uses Weasel as the
browser REPL.

## Usage

To create a new project:
```
lein new clj-cljs-weasel hello-world
cd hello-world
```

To compile ClojureScript and get a working web page:
```
lein cljsbuild auto
```

To start a browser REPL:
```
lein repl
(start-repl)
```
then open the web page in a browser. Weasel works whether the web page is opened via a local file or through the ring
server.

To start a basic ring server for serving the ClojureScript web page:
```
lein ring server
```

## License

Copyright © 2014 Jason Jackson

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
