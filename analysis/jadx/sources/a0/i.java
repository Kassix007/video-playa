package A0;

import P.C0345b;
import P.C0354f0;
import com.google.android.gms.internal.measurement.I1;
import y0.AbstractC1904a;

/* JADX INFO: loaded from: classes.dex */
public final class i extends I1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0354f0 f172d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public i(h hVar) {
        super(1);
        this.f171c = hVar;
        this.f172d = C0345b.q(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.I1
    public final boolean O(h hVar) {
        return hVar == this.f171c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.I1
    public final Object X(h hVar) {
        if (hVar != this.f171c) {
            AbstractC1904a.b("Check failed.");
        }
        Object value = this.f172d.getValue();
        if (value == null) {
            return null;
        }
        return value;
    }
}
