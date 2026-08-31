# Verification Quickstart

1. Run the focused archive-client and archive-service tests.
2. Run `npm run test:mcp`.
3. Run configured static analysis for production source.
4. Run `npm run build`.
5. Confirm a public archive read uses no `Authorization` header while archive operations retain their default authenticated behavior.
