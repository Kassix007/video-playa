import { promises as fs } from "node:fs";
import path from "node:path";
import { fileURLToPath } from "node:url";

const root = path.resolve(path.dirname(fileURLToPath(import.meta.url)), "..", "js");
for (const name of ["mobile.js", "site.js", "jquery.js", "service-worker.js"]) {
  const file = path.join(root, name);
  const source = await fs.readFile(file, "utf8");
  await fs.writeFile(file, source.replace(/\r\n?|\n/g, "\n"), "utf8");
}
