# cljs cloudflare worker

Example for using CLJS to create a Cloudflare worker.

The `cljs-worker` dir was created via `npx wrangler generate my-project worker` and the `wranger.toml` updated to use the `out/main.js` file instead of `index.js`. `out/main.js` is the file created by `shadow-cljs` as per the `shadow-cljs.edn` `:worker` build config.


## Development

```sh
npx shadow-cljs watch worker
npx wranger -c cljs-worker/wranger.toml dev
```

The runtime doesn't seem to allow IO outside of request handlers, thus a websocket connection for the REPL is not supported. If you still want a REPL while development you can run `npx shadow-cljs node-repl` to get one. It won't be in the wrangler runtime though. I have never used this in anger, so I'm not sure how useful a REPL into the process would be. It seems to be reset for every request anyway.

## Deploy
```sh
rm -rf cljs-worker/out
npx shadow-cljs release worker
npx wranger ...
```

I did not test the deploy part, since I do not have a cloudflare account. I'm confident it'll just work though.
