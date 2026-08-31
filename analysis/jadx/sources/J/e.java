package J;

import C0.S;
import k1.i;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f2476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2477c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f2478d = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e(String str, String str2) {
        this.f2475a = str;
        this.f2476b = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return m.a(this.f2475a, eVar.f2475a) && m.a(this.f2476b, eVar.f2476b) && this.f2477c == eVar.f2477c && m.a(this.f2478d, eVar.f2478d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iE = i.e(S.h(this.f2476b, this.f2475a.hashCode() * 31, 31), 31, this.f2477c);
        d dVar = this.f2478d;
        return iE + (dVar == null ? 0 : dVar.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.f2478d + ", isShowingSubstitution=" + this.f2477c + ')';
    }
}
