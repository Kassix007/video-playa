package C0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class U0 implements B0.u0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f930q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f931r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Float f932s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Float f933t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public I0.g f934u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public I0.g f935v = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public U0(int i, ArrayList arrayList) {
        this.f930q = i;
        this.f931r = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.u0
    public final boolean x() {
        return this.f931r.contains(this);
    }
}
