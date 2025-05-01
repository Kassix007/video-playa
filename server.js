const express = require("express");
const request = require("request");
const cors = require("cors");

const app = express();
app.use(cors());
app.use(express.static("public"));

app.get("/proxy", (req, res) => {
  const url = req.query.url;
  if (!url) return res.status(400).send("Missing ?url param");

  request({
    url,
    headers: {
      "Referer": "https://ovostreamz.com",
      "User-Agent": "Mozilla/5.0"
    }
  }).on("error", (err) => res.status(500).send(err.message))
    .pipe(res);
});

const PORT = process.env.PORT || 3000;
app.listen(PORT, () => console.log(`Proxy running on port ${PORT}`));
