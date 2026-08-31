package O3;

import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkRequest;
import androidx.work.impl.Scheduler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import x3.C1899k;

/* JADX INFO: loaded from: classes.dex */
public abstract class F {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final E f4362A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public static final E f4363A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final E f4364B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public static final E f4365B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final E f4366C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public static final E f4367C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final E f4368D;
    public static final E D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final E f4369E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public static final E f4370E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final E f4371F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public static final E f4372F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final E f4373G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public static final E f4374G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final E f4375H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public static final E f4376H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final E f4377I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public static final E f4378I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final E f4379J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public static final E f4380J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final E f4381K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public static final E f4382K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final E f4383L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public static final E f4384L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final E f4385M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public static final E f4386M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final E f4387N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public static final E f4388N0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final E f4389O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public static final E f4390O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final E f4391P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public static final E f4392P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final E f4393Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public static final E f4394Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final E f4395R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public static final E f4396R0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final E f4397S;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public static final E f4398S0;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final E f4399T;
    public static final E T0;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final E f4400U;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public static final E f4401U0;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final E f4402V;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public static final E f4403V0;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final E f4404W;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public static final E f4405W0;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final E f4406X;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public static final E f4407X0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final E f4408Y;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public static final E f4409Y0;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final E f4410Z;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public static final E f4411Z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f4412a = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final E f4413a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final E f4414a1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final E f4415b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final E f4416b0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final E f4417b1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final E f4418c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final E f4419c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final E f4420c1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final E f4421d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final E f4422d0;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final E f4423d1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final E f4424e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final E f4425e0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final E f4426e1;
    public static final E f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final E f4427f0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final E f4428f1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final E f4429g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final E f4430g0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final E f4431g1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final E f4432h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final E f4433h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final E f4434h1;
    public static final E i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final E f4435i0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final E f4436i1;
    public static final E j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final E f4437j0;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final E f4438j1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final E f4439k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final E f4440k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final E f4441l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final E f4442l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final E f4443m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final E f4444m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final E f4445n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final E f4446n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final E f4447o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final E f4448o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final E f4449p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final E f4450p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final E f4451q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final E f4452q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final E f4453r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final E f4454r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final E f4455s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final E f4456s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final E f4457t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final E f4458t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final E f4459u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final E f4460u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final E f4461v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final E f4462v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final E f4463w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final E f4464w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final E f4465x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final E f4466x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final E f4467y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final E f4468y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final E f4469z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final E f4470z0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Collections.synchronizedSet(new HashSet());
        Long lValueOf = Long.valueOf(WorkRequest.MIN_BACKOFF_MILLIS);
        f4415b = a("measurement.ad_id_cache_time", lValueOf, D.f4343z, false);
        f4418c = a("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L, C1899k.f18487v, false);
        f4421d = a("measurement.monitoring.sample_period_millis", 86400000L, s4.e.f16463D, false);
        f4424e = a("measurement.config.cache_time", 86400000L, C1899k.f18482J, false);
        f = a("measurement.config.url_scheme", "https", C0337y.f5151w, false);
        f4429g = a("measurement.config.url_authority", "app-measurement.com", C0340z.f5169B, false);
        f4432h = a("measurement.upload.max_bundles", 100, C0337y.f5132H, false);
        i = a("measurement.upload.max_batch_size", 65536, C0340z.f5180M, false);
        j = a("measurement.upload.max_bundle_size", 65536, C0337y.f5143S, false);
        f4439k = a("measurement.upload.max_events_per_bundle", 1000, D.f4337t, false);
        f4441l = a("measurement.upload.max_events_per_day", 100000, B.f4320z, false);
        f4443m = a("measurement.upload.max_error_events_per_day", 1000, s4.e.f16476y, false);
        f4445n = a("measurement.upload.max_public_events_per_day", 50000, C1899k.f18491z, false);
        f4447o = a("measurement.upload.max_conversions_per_day", 10000, s4.e.f16477z, false);
        f4449p = a("measurement.upload.max_realtime_events_per_day", 10, C1899k.f18473A, false);
        f4451q = a("measurement.store.max_stored_events_per_app", 100000, s4.e.f16460A, false);
        f4453r = a("measurement.upload.url", "https://app-measurement.com/a", C1899k.f18474B, false);
        f4455s = a("measurement.sgtm.google_signal.url", "https://app-measurement.com/s/d", s4.e.f16461B, false);
        f4457t = a("measurement.sgtm.service_upload_apps_list", "", C1899k.f18475C, false);
        f4459u = a("measurement.sgtm.upload.backoff_http_codes", "404,429,503,504", s4.e.f16462C, false);
        f4461v = a("measurement.sgtm.upload.retry_interval", 600000L, C1899k.f18476D, false);
        f4463w = a("measurement.sgtm.upload.retry_max_wait", 21600000L, C1899k.f18477E, false);
        f4465x = a("measurement.sgtm.batch.retry_interval", 1800000L, s4.e.f16464E, false);
        f4467y = a("measurement.sgtm.batch.retry_max_wait", 21600000L, C1899k.f18478F, false);
        f4469z = a("measurement.sgtm.batch.retry_max_count", 10, s4.e.f16465F, false);
        f4362A = a("measurement.sgtm.upload.max_queued_batches", 5000, C1899k.f18479G, false);
        f4364B = a("measurement.sgtm.upload.batches_retrieval_limit", 5, s4.e.f16466G, false);
        f4366C = a("measurement.sgtm.upload.min_delay_after_startup", 5000L, C1899k.f18480H, false);
        f4368D = a("measurement.sgtm.upload.min_delay_after_broadcast", 1000L, s4.e.f16467H, false);
        f4369E = a("measurement.sgtm.upload.min_delay_after_background", 600000L, C1899k.f18481I, false);
        f4371F = a("measurement.sgtm.batch.long_queuing_threshold", 14400000L, s4.e.f16468I, false);
        f4373G = a("measurement.upload.backoff_period", 43200000L, C0337y.f5146r, false);
        a("measurement.upload.window_interval", 3600000L, C0340z.f5189r, false);
        f4375H = a("measurement.upload.interval", 3600000L, C0337y.f5147s, false);
        f4377I = a("measurement.upload.realtime_upload_interval", lValueOf, C0340z.f5190s, false);
        f4379J = a("measurement.upload.debug_upload_interval", 1000L, C0337y.f5148t, false);
        f4381K = a("measurement.upload.minimum_delay", 500L, C0340z.f5191t, false);
        f4383L = a("measurement.alarm_manager.minimum_interval", 60000L, C0337y.f5149u, false);
        f4385M = a("measurement.upload.stale_data_deletion_interval", 86400000L, C0340z.f5192u, false);
        f4387N = a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, C0337y.f5150v, false);
        f4389O = a("measurement.upload.initial_upload_delay_time", 15000L, C0340z.f5193v, false);
        f4391P = a("measurement.upload.retry_time", 1800000L, C0340z.f5194w, false);
        f4393Q = a("measurement.upload.retry_count", 6, C0337y.f5152x, false);
        f4395R = a("measurement.upload.max_queue_time", 518400000L, C0340z.f5195x, false);
        f4397S = a("measurement.upload.google_signal_max_queue_time", Long.valueOf(PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS), C0337y.f5153y, false);
        f4399T = a("measurement.lifetimevalue.max_currency_tracked", 4, C0340z.f5196y, false);
        f4400U = a("measurement.audience.filter_result_max_count", Integer.valueOf(Scheduler.MAX_GREEDY_SCHEDULER_LIMIT), C0337y.f5154z, false);
        f4402V = a("measurement.upload.max_public_user_properties", 100, null, false);
        f4404W = a("measurement.upload.max_event_name_cardinality", 2000, null, false);
        f4406X = a("measurement.upload.max_public_event_params", 100, null, false);
        f4408Y = a("measurement.service_client.idle_disconnect_millis", 5000L, C0340z.f5197z, false);
        f4410Z = a("measurement.service_client.reconnect_millis", 1000L, C0337y.f5125A, false);
        Boolean bool = Boolean.FALSE;
        f4413a0 = a("measurement.test.boolean_flag", bool, C0340z.f5168A, false);
        f4416b0 = a("measurement.test.string_flag", "---", C0337y.f5126B, false);
        f4419c0 = a("measurement.test.long_flag", -1L, C0337y.f5127C, false);
        a("measurement.test.cached_long_flag", -1L, C0340z.f5170C, true);
        f4422d0 = a("measurement.test.int_flag", -2, C0337y.f5128D, false);
        f4425e0 = a("measurement.test.double_flag", Double.valueOf(-3.0d), C0340z.f5171D, false);
        f4427f0 = a("measurement.experiment.max_ids", 50, C0337y.f5129E, false);
        f4430g0 = a("measurement.upload.max_item_scoped_custom_parameters", 27, C0340z.f5172E, false);
        f4433h0 = a("measurement.upload.max_event_parameter_value_length", 500, C0337y.f5130F, true);
        f4435i0 = a("measurement.max_bundles_per_iteration", 100, C0340z.f5173F, false);
        f4437j0 = a("measurement.sdk.attribution.cache.ttl", 604800000L, C0337y.f5131G, false);
        f4440k0 = a("measurement.redaction.app_instance_id.ttl", 7200000L, C0340z.f5174G, false);
        f4442l0 = a("measurement.rb.attribution.client.min_ad_services_version", 7, C0340z.f5175H, false);
        f4444m0 = a("measurement.dma_consent.max_daily_dcu_realtime_events", 1, C0337y.f5133I, false);
        f4446n0 = a("measurement.rb.attribution.uri_scheme", "https", C0340z.f5176I, false);
        f4448o0 = a("measurement.rb.attribution.uri_authority", "google-analytics.com", C0337y.f5134J, false);
        f4450p0 = a("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion", C0340z.f5177J, false);
        f4452q0 = a("measurement.session.engagement_interval", 3600000L, C0337y.f5135K, false);
        f4454r0 = a("measurement.rb.attribution.app_allowlist", "com.labpixies.flood", C0340z.f5178K, false);
        f4456s0 = a("measurement.rb.attribution.user_properties", "_npa,npa|_fot,fot", C0337y.f5136L, false);
        f4458t0 = a("measurement.rb.attribution.event_params", "value|currency", C0340z.f5179L, false);
        f4460u0 = a("measurement.rb.attribution.query_parameters_to_remove", "", C0337y.f5137M, false);
        f4462v0 = a("measurement.rb.attribution.max_queue_time", 864000000L, C0337y.f5138N, false);
        f4464w0 = a("measurement.rb.attribution.max_retry_delay_seconds", 16, C0340z.f5181N, false);
        f4466x0 = a("measurement.rb.attribution.client.min_time_after_boot_seconds", 90, C0337y.f5139O, false);
        a("measurement.rb.attribution.max_trigger_uris_queried_at_once", 0, C0340z.f5182O, false);
        f4468y0 = a("measurement.rb.max_trigger_registrations_per_day", 1000, C0337y.f5140P, false);
        Boolean bool2 = Boolean.TRUE;
        f4470z0 = a("measurement.config.bundle_for_all_apps_on_backgrounded", bool2, C0340z.f5183P, false);
        f4363A0 = a("measurement.config.notify_trigger_uris_on_backgrounded", bool2, C0337y.f5141Q, false);
        f4365B0 = a("measurement.rb.attribution.notify_app_delay_millis", 3000, C0340z.f5184Q, false);
        f4367C0 = a("measurement.quality.checksum", bool, null, false);
        D0 = a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, C0337y.f5142R, false);
        f4370E0 = a("measurement.audience.refresh_event_count_filters_timestamp", bool, C0340z.f5185R, false);
        f4372F0 = a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, C0340z.f5186S, true);
        f4374G0 = a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, C0337y.f5144T, false);
        f4376H0 = a("measurement.integration.disable_firebase_instance_id", bool, C0340z.f5187T, false);
        f4378I0 = a("measurement.collection.service.update_with_analytics_fix", bool, C0337y.f5145U, false);
        f4380J0 = a("measurement.service.storage_consent_support_version", 203600, C0340z.f5188U, false);
        f4382K0 = a("measurement.service.store_null_safelist", bool2, B.f4312r, false);
        f4384L0 = a("measurement.service.store_safelist", bool2, D.f4335r, false);
        f4386M0 = a("measurement.session_stitching_token_enabled", bool, B.f4313s, false);
        f4388N0 = a("measurement.sgtm.client.upload_on_backgrounded.dev", bool, D.f4336s, true);
        f4390O0 = a("measurement.gmscore_client_telemetry", bool, D.f4334A, false);
        f4392P0 = a("measurement.rb.attribution.service", bool2, B.f4314t, true);
        f4394Q0 = a("measurement.rb.attribution.client2", bool2, B.f4315u, true);
        f4396R0 = a("measurement.rb.attribution.uuid_generation", bool2, D.f4338u, false);
        f4398S0 = a("measurement.rb.attribution.enable_trigger_redaction", bool2, B.f4316v, false);
        a("measurement.rb.attribution.followup1.service", bool, D.f4339v, false);
        T0 = a("measurement.rb.attribution.retry_disposition", bool, B.f4317w, false);
        f4401U0 = a("measurement.client.sessions.enable_fix_background_engagement", bool, B.f4311B, false);
        f4403V0 = a("measurement.set_default_event_parameters_propagate_clear.service.dev", bool2, D.f4340w, false);
        f4405W0 = a("measurement.set_default_event_parameters_propagate_clear.client.dev", bool2, B.f4318x, false);
        f4407X0 = a("measurement.service.ad_impression.convert_value_to_double", bool2, D.f4341x, false);
        a("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", bool2, B.f4319y, false);
        a("measurement.remove_conflicting_first_party_apis.dev", bool, D.f4342y, false);
        f4409Y0 = a("measurement.rb.attribution.service.trigger_uris_high_priority", bool2, s4.e.f16473v, false);
        f4411Z0 = a("measurement.tcf.consent_fix", bool, C1899k.f18488w, false);
        f4414a1 = a("measurement.tcf.empty_pref_fix", bool2, s4.e.f16474w, false);
        f4417b1 = a("measurement.experiment.enable_phenotype_experiment_reporting", bool2, C1899k.f18489x, false);
        f4420c1 = a("measurement.set_default_event_parameters.fix_service_request_ordering", bool, C1899k.f18485t, false);
        f4423d1 = a("measurement.set_default_event_parameters.fix_app_update_logging", bool2, s4.e.f16470s, false);
        f4426e1 = a("measurement.service.fix_stop_bundling_bug", bool2, s4.e.f16472u, false);
        f4428f1 = a("measurement.fix_params_logcat_spam", bool2, C1899k.f18486u, false);
        f4431g1 = a("measurement.gbraid_campaign.stop_lgclid", bool, B.f4310A, false);
        f4434h1 = a("measurement.gbraid_compaign.compaign_params_triggering_info_update", "gclid,gbraid,gad_campaignid", s4.e.f16475x, false);
        f4436i1 = a("measurement.edpb.service", bool, s4.e.f16471t, false);
        f4438j1 = a("measurement.edpb.events_cached_in_no_data_mode", "_f,_v,_cmp", C1899k.f18490y, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static E a(String str, Object obj, InterfaceC0331w interfaceC0331w, boolean z5) {
        E e7 = new E(str, obj, interfaceC0331w);
        if (z5) {
            f4412a.add(e7);
        }
        return e7;
    }
}
