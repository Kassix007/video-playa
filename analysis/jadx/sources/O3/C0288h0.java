package O3;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import x3.AbstractC1887A;

/* JADX INFO: renamed from: O3.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0288h0 extends E0 {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final Pair f4876Q = new Pair("", 0L);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f4877A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C0282f0 f4878B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final C0279e0 f4879C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final K2.a f4880D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final E.c0 f4881E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final C0279e0 f4882F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final C0282f0 f4883G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final C0282f0 f4884H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f4885I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final C0279e0 f4886J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final C0279e0 f4887K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final C0282f0 f4888L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final K2.a f4889M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final K2.a f4890N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final C0282f0 f4891O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final E.c0 f4892P;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public SharedPreferences f4893t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public SharedPreferences f4894u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C0285g0 f4895v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0282f0 f4896w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final K2.a f4897x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f4898y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f4899z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0288h0(C0323t0 c0323t0) {
        super(c0323t0);
        this.f4878B = new C0282f0(this, "session_timeout", 1800000L);
        this.f4879C = new C0279e0(this, "start_new_session", true);
        this.f4883G = new C0282f0(this, "last_pause_time", 0L);
        this.f4884H = new C0282f0(this, "session_id", 0L);
        this.f4880D = new K2.a(this, "non_personalized_ads");
        this.f4881E = new E.c0(this, "last_received_uri_timestamps_by_source");
        this.f4882F = new C0279e0(this, "allow_remote_dynamite", false);
        this.f4896w = new C0282f0(this, "first_open_time", 0L);
        AbstractC1887A.d("app_install_time");
        this.f4897x = new K2.a(this, "app_instance_id");
        this.f4886J = new C0279e0(this, "app_backgrounded", false);
        this.f4887K = new C0279e0(this, "deep_link_retrieval_complete", false);
        this.f4888L = new C0282f0(this, "deep_link_retrieval_attempts", 0L);
        this.f4889M = new K2.a(this, "firebase_feature_rollouts");
        this.f4890N = new K2.a(this, "deferred_attribution_cache");
        this.f4891O = new C0282f0(this, "deferred_attribution_cache_timestamp", 0L);
        this.f4892P = new E.c0(this, "default_event_parameters");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.E0
    public final boolean p() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final SharedPreferences s() {
        o();
        q();
        AbstractC1887A.g(this.f4893t);
        return this.f4893t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final SharedPreferences t() {
        o();
        q();
        if (this.f4894u == null) {
            C0323t0 c0323t0 = (C0323t0) this.f4346r;
            String strValueOf = String.valueOf(c0323t0.f5072q.getPackageName());
            X x6 = c0323t0.f5077v;
            C0323t0.l(x6);
            V v6 = x6.f4666E;
            String strConcat = strValueOf.concat("_preferences");
            v6.c(strConcat, "Default prefs file");
            this.f4894u = c0323t0.f5072q.getSharedPreferences(strConcat, 0);
        }
        return this.f4894u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final SparseArray u() {
        Bundle bundleB = this.f4881E.B();
        int[] intArray = bundleB.getIntArray("uriSources");
        long[] longArray = bundleB.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            X x6 = ((C0323t0) this.f4346r).f5077v;
            C0323t0.l(x6);
            x6.f4670w.b("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < intArray.length; i++) {
            sparseArray.put(intArray[i], Long.valueOf(longArray[i]));
        }
        return sparseArray;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final J0 v() {
        o();
        return J0.c(s().getInt("consent_source", 100), s().getString("consent_settings", "G1"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean w(F1 f12) {
        o();
        String string = s().getString("stored_tcf_param", "");
        String strA = f12.a();
        if (strA.equals(string)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = s().edit();
        editorEdit.putString("stored_tcf_param", strA);
        editorEdit.apply();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void x(boolean z5) {
        o();
        X x6 = ((C0323t0) this.f4346r).f5077v;
        C0323t0.l(x6);
        x6.f4666E.c(Boolean.valueOf(z5), "App measurement setting deferred collection");
        SharedPreferences.Editor editorEdit = s().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z5);
        editorEdit.apply();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean y(long j) {
        return j - this.f4878B.a() > this.f4883G.a();
    }
}
