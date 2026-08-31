package P0;

import k1.i;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f5596e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final R0.b f5600d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        new b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b() {
        R0.b bVar = R0.b.f6691s;
        this.f5597a = true;
        this.f5598b = 1;
        this.f5599c = 1;
        this.f5600d = bVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        bVar.getClass();
        return this.f5597a == bVar.f5597a && this.f5598b == bVar.f5598b && this.f5599c == bVar.f5599c && m.a(this.f5600d, bVar.f5600d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f5600d.f6692q.hashCode() + i.c(this.f5599c, i.c(this.f5598b, i.e(i.c(0, Boolean.hashCode(false) * 31, 31), 31, this.f5597a), 31), 961);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("ImeOptions(singleLine=false, capitalization=");
        String str = "None";
        sb.append((Object) "None");
        sb.append(", autoCorrect=");
        sb.append(this.f5597a);
        sb.append(", keyboardType=");
        int i = this.f5598b;
        sb.append((Object) (i == 0 ? "Unspecified" : i == 1 ? "Text" : i == 2 ? "Ascii" : i == 3 ? "Number" : i == 4 ? "Phone" : i == 5 ? "Uri" : i == 6 ? "Email" : i == 7 ? "Password" : i == 8 ? "NumberPassword" : i == 9 ? "Decimal" : "Invalid"));
        sb.append(", imeAction=");
        int i7 = this.f5599c;
        if (i7 == -1) {
            str = "Unspecified";
        } else if (i7 != 0) {
            str = i7 == 1 ? "Default" : i7 == 2 ? "Go" : i7 == 3 ? "Search" : i7 == 4 ? "Send" : i7 == 5 ? "Previous" : i7 == 6 ? "Next" : i7 == 7 ? "Done" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(", platformImeOptions=null, hintLocales=");
        sb.append(this.f5600d);
        sb.append(')');
        return sb.toString();
    }
}
