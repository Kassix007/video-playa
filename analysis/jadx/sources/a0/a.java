package A0;

import A.F;
import A.W;
import A.c0;
import com.google.android.gms.internal.measurement.I1;
import y0.AbstractC1904a;

/* JADX INFO: loaded from: classes.dex */
public final class a extends I1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public F f161c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.I1
    public final boolean O(h hVar) {
        this.f161c.getClass();
        return hVar == c0.f89a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.I1
    public final Object X(h hVar) {
        this.f161c.getClass();
        if (hVar != c0.f89a) {
            AbstractC1904a.b("Check failed.");
        }
        return (W) this.f161c.f13s.getValue();
    }
}
