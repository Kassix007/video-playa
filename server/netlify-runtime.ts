import type { Context } from "@netlify/functions";

type CouncilRuntimeEnvironment = Readonly<Record<string, string | undefined>>;
type CouncilNetlifyContext = Partial<Pick<Context, "deploy" | "site">>;

export function createCouncilRuntimeEnvironment(
  context: CouncilNetlifyContext = {},
  environment: CouncilRuntimeEnvironment = process.env,
): CouncilRuntimeEnvironment {
  const hasNetlifyContext = Boolean(context.deploy || context.site);

  return {
    ...environment,
    NETLIFY: environment.NETLIFY ?? (hasNetlifyContext ? "true" : undefined),
    CONTEXT: context.deploy?.context ?? environment.CONTEXT,
    DEPLOY_ID: context.deploy?.id ?? environment.DEPLOY_ID,
    URL: context.site?.url ?? environment.URL,
    HORSEE_NETLIFY_SITE_NAME:
      context.site?.name
      ?? environment.HORSEE_NETLIFY_SITE_NAME,
  };
}
