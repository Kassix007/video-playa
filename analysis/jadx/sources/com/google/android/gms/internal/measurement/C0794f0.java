package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.Objects;
import x3.AbstractC1887A;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0794f0 extends AbstractRunnableC0839o0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f10836u = 4;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f10837v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f10838w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f10839x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0794f0(C0858s0 c0858s0, Activity activity, G g7) {
        super(c0858s0.f11030q, true);
        this.f10838w = activity;
        this.f10839x = g7;
        this.f10837v = c0858s0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0839o0
    public final void a() {
        Boolean boolValueOf;
        Bundle bundle;
        switch (this.f10836u) {
            case 0:
                try {
                    Context context = (Context) this.f10838w;
                    AbstractC1887A.g(context);
                    String strA = O3.K0.a(context);
                    Resources resources = context.getResources();
                    if (TextUtils.isEmpty(strA)) {
                        strA = O3.K0.a(context);
                    }
                    int identifier = resources.getIdentifier("google_analytics_force_disable_updates", "bool", strA);
                    J jAsInterface = null;
                    if (identifier == 0) {
                        boolValueOf = null;
                    } else {
                        try {
                            boolValueOf = Boolean.valueOf(resources.getBoolean(identifier));
                        } catch (Resources.NotFoundException unused) {
                            boolValueOf = null;
                        }
                    }
                    C0863t0 c0863t0 = (C0863t0) this.f10837v;
                    boolean z5 = boolValueOf == null || !boolValueOf.booleanValue();
                    c0863t0.getClass();
                    try {
                        jAsInterface = I.asInterface(E3.f.c(context, z5 ? E3.f.f1701c : E3.f.f1700b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                    } catch (E3.b e7) {
                        c0863t0.d(e7, true, false);
                    }
                    c0863t0.f = jAsInterface;
                    if (c0863t0.f != null) {
                        int iA = E3.f.a(context, ModuleDescriptor.MODULE_ID);
                        V v6 = new V(130000L, Math.max(iA, r6), Boolean.TRUE.equals(boolValueOf) || E3.f.d(context, ModuleDescriptor.MODULE_ID, false) < iA, (Bundle) this.f10839x, O3.K0.a(context));
                        J j = c0863t0.f;
                        AbstractC1887A.g(j);
                        j.initialize(new D3.b(context), v6, this.f10999q);
                    } else {
                        Log.w("FA", "Failed to connect to measurement client.");
                    }
                } catch (Exception e8) {
                    ((C0863t0) this.f10837v).d(e8, true, false);
                    return;
                }
                break;
            case 1:
                J j7 = ((C0863t0) this.f10837v).f;
                AbstractC1887A.g(j7);
                j7.logHealthData(5, (String) this.f10838w, new D3.b(this.f10839x), new D3.b(null), new D3.b(null));
                break;
            case 2:
                J j8 = ((C0863t0) this.f10837v).f;
                AbstractC1887A.g(j8);
                j8.getMaxUserProperties((String) this.f10838w, (G) this.f10839x);
                break;
            case 3:
                Bundle bundle2 = (Bundle) this.f10839x;
                if (bundle2 != null) {
                    bundle = new Bundle();
                    if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = bundle2.get("com.google.app_measurement.screen_service");
                        if (obj instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                        }
                    }
                } else {
                    bundle = null;
                }
                J j9 = ((C0858s0) this.f10837v).f11030q.f;
                AbstractC1887A.g(j9);
                j9.onActivityCreatedByScionActivityInfo(X.W((Activity) this.f10838w), bundle, this.f11000r);
                break;
            default:
                J j10 = ((C0858s0) this.f10837v).f11030q.f;
                AbstractC1887A.g(j10);
                j10.onActivitySaveInstanceStateByScionActivityInfo(X.W((Activity) this.f10838w), (G) this.f10839x, this.f11000r);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0839o0
    public void b() {
        switch (this.f10836u) {
            case 2:
                ((G) this.f10839x).a(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0794f0(C0858s0 c0858s0, Bundle bundle, Activity activity) {
        super(c0858s0.f11030q, true);
        this.f10839x = bundle;
        this.f10838w = activity;
        this.f10837v = c0858s0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0794f0(C0863t0 c0863t0, Context context, Bundle bundle) {
        super(c0863t0, true);
        this.f10838w = context;
        this.f10839x = bundle;
        this.f10837v = c0863t0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0794f0(C0863t0 c0863t0, String str, G g7) {
        super(c0863t0, true);
        this.f10838w = str;
        this.f10839x = g7;
        Objects.requireNonNull(c0863t0);
        this.f10837v = c0863t0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0794f0(C0863t0 c0863t0, String str, Object obj) {
        super(c0863t0, false);
        this.f10838w = str;
        this.f10839x = obj;
        this.f10837v = c0863t0;
    }
}
