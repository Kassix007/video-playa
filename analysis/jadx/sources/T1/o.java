package T1;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class o implements Comparable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p f7397q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Bundle f7398r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f7399s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f7400t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f7401u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public o(p pVar, Bundle bundle, boolean z5, int i, boolean z6) {
        this.f7397q = pVar;
        this.f7398r = bundle;
        this.f7399s = z5;
        this.f7400t = i;
        this.f7401u = z6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(o other) {
        kotlin.jvm.internal.m.e(other, "other");
        boolean z5 = other.f7401u;
        boolean z6 = other.f7399s;
        Bundle bundle = other.f7398r;
        boolean z7 = this.f7399s;
        if (z7 && !z6) {
            return 1;
        }
        if (!z7 && z6) {
            return -1;
        }
        int i = this.f7400t - other.f7400t;
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        Bundle bundle2 = this.f7398r;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            int size = bundle2.size();
            kotlin.jvm.internal.m.b(bundle);
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z8 = this.f7401u;
        if (!z8 || z5) {
            return (z8 || !z5) ? 0 : -1;
        }
        return 1;
    }
}
