# Public Archive Read Contract

Public Council history and history-date reads may access public yearly archive data without user authentication.

- These reads must not include the configured GitHub archive token.
- Missing, malformed, or unavailable public archive data must retain the existing graceful fallback behavior.
- Archive writes, write conflict reads, and verification keep their existing authenticated behavior.
