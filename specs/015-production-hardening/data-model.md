# Data Model

No persisted data model changes are required.

The request policy gains one transient request option:

- `authenticate` (optional): defaults to `true` when a client token is configured; public archive-reader methods set it to `false`.
