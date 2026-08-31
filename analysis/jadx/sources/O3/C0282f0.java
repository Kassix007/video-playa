package O3;

import android.content.SharedPreferences;
import java.util.Objects;
import x3.AbstractC1887A;

/* JADX INFO: renamed from: O3.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0282f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f4853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0288h0 f4854e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0282f0(C0288h0 c0288h0, String str, long j) {
        Objects.requireNonNull(c0288h0);
        this.f4854e = c0288h0;
        AbstractC1887A.d(str);
        this.f4850a = str;
        this.f4851b = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long a() {
        if (!this.f4852c) {
            this.f4852c = true;
            this.f4853d = this.f4854e.s().getLong(this.f4850a, this.f4851b);
        }
        return this.f4853d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(long j) {
        SharedPreferences.Editor editorEdit = this.f4854e.s().edit();
        editorEdit.putLong(this.f4850a, j);
        editorEdit.apply();
        this.f4853d = j;
    }
}
