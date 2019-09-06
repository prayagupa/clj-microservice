(defproject nepleaks "0.1.0-SNAPSHOT"
  :description "nepleaks"
  :url "http://nepleaks.org/"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [compojure "1.1.5"]
                 [enlive  "1.1.1"]
                 [net.cgrand/moustache "1.1.0"]
                 [org.clojure/tools.logging "0.2.6"]
                 [ring.middleware.logger "0.4.0"]
                 [hiccup "1.0.0"]
                 [lobos "1.0.0-beta1"]
                 [korma "0.3.0-RC4"]
                 [mysql/mysql-connector-java "5.1.16"]
		 [clojurewerkz/elastisch "1.4.0"]
		 [clj-http "0.7.8"]
		 [cascalog "2.0.0"]

                 [junit/junit "4.11"]
                 [solrclj/solrclj "0.1.2"]
                 [clojure-opennlp "0.3.2"] ;; uses Opennlp 1.5.3
                 [facts/speech-synthesis "1.0.0"]
                 ;;[overtone "0.9.1"]
		 [google-maps "0.5.0"]
     [com.keminglabs/c2 "0.2.3"]
                 [ring/ring-json "0.1.2"]
                ]
  :sub  ["../nepleaks-engine"]

  :plugins [
            [lein-ring "0.12.5"]
            [lein-sub "0.3.0"]]
  :ring {:handler nepleaks.handler/app
         ;; hot-reload http://stackoverflow.com/a/14472281/432903
         ;;:auto-reload? true
         ;;:auto-refresh? true
         }
  :jvm-opts ["-Xmx512m" "-XX:+UseParallelGC" "-XX:+UseParallelOldGC"]
  :profiles { :dev {:dependencies [[ring-mock "0.1.2"]
                     [org.apache.hadoop/hadoop-core "1.1.2"]
		     [ritz/ritz-swank "0.7.0"]
                     ;;[storm "0.9.0"]
                    ]
		   }
	    }
  )
