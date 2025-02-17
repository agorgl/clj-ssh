(def agentproxy-version "0.0.9")

(defproject clj-commons/clj-ssh "0.5.16-SNAPSHOT"
  :description "Library for using SSH from clojure."
  :url "https://github.com/clj-commons/clj-ssh"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/tools.logging "1.2.4"
                  :exclusions [org.clojure/clojure]]
                 [com.jcraft/jsch.agentproxy.usocket-jna ~agentproxy-version]
                 [com.jcraft/jsch.agentproxy.usocket-nc ~agentproxy-version]
                 [com.jcraft/jsch.agentproxy.sshagent ~agentproxy-version]
                 [com.jcraft/jsch.agentproxy.pageant ~agentproxy-version]
                 [com.jcraft/jsch.agentproxy.core ~agentproxy-version]
                 [com.jcraft/jsch.agentproxy.jsch ~agentproxy-version]
                 [com.jcraft/jsch "0.1.55"]]
  :jvm-opts ["-Djava.awt.headless=true"]
  :profiles {:provided {:dependencies [[org.clojure/clojure "1.10.1"]]}})
