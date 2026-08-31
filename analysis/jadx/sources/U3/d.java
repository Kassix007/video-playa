package u3;

import Z.m;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import java.util.Collections;
import java.util.Set;
import r.C1555f;
import v3.C1763a;
import v3.r;
import x3.AbstractC1887A;
import x3.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f17198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1696a f17199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1763a f17200e;
    public final Looper f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f17201g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r f17202h;
    public final r6.f i;
    public final v3.e j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d(Context context, m mVar, n nVar, c cVar) {
        AbstractC1887A.h(context, "Null context is not permitted.");
        AbstractC1887A.h(mVar, "Api must not be null.");
        AbstractC1887A.h(cVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        AbstractC1887A.h(applicationContext, "The provided context did not have an application context.");
        this.f17196a = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.f17197b = attributionTag;
        this.f17198c = mVar;
        this.f17199d = nVar;
        this.f = cVar.f17195b;
        this.f17200e = new C1763a(mVar, nVar, attributionTag);
        this.f17202h = new r(this);
        v3.e eVarE = v3.e.e(applicationContext);
        this.j = eVarE;
        this.f17201g = eVarE.f17571h.getAndIncrement();
        this.i = cVar.f17194a;
        I3.e eVar = eVarE.f17574m;
        eVar.sendMessage(eVar.obtainMessage(7, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final t2.e a() {
        t2.e eVar = new t2.e();
        Set set = Collections.EMPTY_SET;
        if (((C1555f) eVar.f16684q) == null) {
            eVar.f16684q = new C1555f(0);
        }
        ((C1555f) eVar.f16684q).addAll(set);
        Context context = this.f17196a;
        eVar.f16686s = context.getClass().getName();
        eVar.f16685r = context.getPackageName();
        return eVar;
    }
}
