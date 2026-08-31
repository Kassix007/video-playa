package O3;

import android.content.Context;
import android.os.Bundle;
import x3.AbstractC1887A;

/* JADX INFO: loaded from: classes.dex */
public final class N0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f4535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.V f4537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f4538e;
    public final Long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f4539g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public N0(Context context, com.google.android.gms.internal.measurement.V v6, Long l7) {
        this.f4538e = true;
        AbstractC1887A.g(context);
        Context applicationContext = context.getApplicationContext();
        AbstractC1887A.g(applicationContext);
        this.f4534a = applicationContext;
        this.f = l7;
        if (v6 != null) {
            this.f4537d = v6;
            this.f4538e = v6.f10723s;
            this.f4536c = v6.f10722r;
            this.f4539g = v6.f10725u;
            Bundle bundle = v6.f10724t;
            if (bundle != null) {
                this.f4535b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
