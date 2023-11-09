(ns my.app.demo-worker)

(def example
  #js {:fetch
       (fn []
         (js/Response. "Hello from CLJS!"
           (clj->js
             {:headers
              {:content-type "text/plain"}})))})
