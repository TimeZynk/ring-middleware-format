(defproject com.timezynk/ring-middleware-format "0.2.1"
  :description "Ring middleware for parsing parameters and emitting responses in various formats. See https://github.com/ngrunwald/ring-middleware-format"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [org.clojure/core.memoize "0.5.1"]
                 [ring/ring-core "1.1.0"]
                 [cheshire "4.0.0"]]
  :omit-default-repositories true
  :repositories {"timezynk" "http://code.timezynk.com/nexus/content/groups/public/"}
  :deploy-repositories {"releases" {:url "http://code.timezynk.com/nexus/content/repositories/releases/"
                                    :username "deployment" :password "nexus"}
                        "snapshots" {:url "http://code.timezynk.com/nexus/content/repositories/snapshots/"
                                    :username "deployment" :password "nexus"}})
