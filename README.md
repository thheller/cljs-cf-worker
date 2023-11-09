# cljs cloudflare worker

Example for using CLJS to create a Cloudflare worker.

The `cljs-worker` dir was created via `npx wrangler generate my-project worker` and the `wranger.toml` updated to use the `out/main.js` file instead of `index.js`. `out/main.js` is the file created by `shadow-cljs` as per the `shadow-cljs.edn` `:worker` build config.


## Development

```sh
npx shadow-cljs watch worker
npx wranger -c cljs-worker/wranger.toml dev
```

## Deploy
```sh
rm -rf cljs-worker/out
npx shadow-cljs release worker
npx wranger ...
```

I did not test the deploy part, since I do not have a cloudflare account. I'm confident it'll just work though.
