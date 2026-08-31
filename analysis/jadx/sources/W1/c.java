package W1;

import R4.C0433b2;
import T1.p;
import android.os.Bundle;
import androidx.lifecycle.C0662z;
import androidx.lifecycle.EnumC0653p;
import androidx.lifecycle.X;
import androidx.lifecycle.a0;
import com.google.android.gms.internal.measurement.P1;
import i2.C1135a;
import java.util.Arrays;
import kotlin.jvm.internal.z;
import m5.AbstractC1362a;
import m5.C1371j;
import m5.C1376o;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T1.d f8033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f8034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f8035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EnumC0653p f8036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final T1.i f8037e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f8038g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Z.m f8039h;
    public boolean i;
    public final C0662z j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public EnumC0653p f8040k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a0 f8041l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C1376o f8042m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c(T1.d dVar) {
        this.f8033a = dVar;
        this.f8034b = dVar.f7354r;
        this.f8035c = dVar.f7355s;
        this.f8036d = dVar.f7356t;
        this.f8037e = dVar.f7357u;
        this.f = dVar.f7358v;
        this.f8038g = dVar.f7359w;
        this.f8039h = new Z.m(new C1135a(dVar, new I2.d(16, dVar)), 13);
        C1376o c1376oD = AbstractC1362a.d(new C0433b2(12));
        this.j = new C0662z(dVar);
        this.f8040k = EnumC0653p.f9557r;
        this.f8041l = (a0) c1376oD.getValue();
        this.f8042m = AbstractC1362a.d(new C0433b2(13));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Bundle a() {
        Bundle bundle = this.f8035c;
        if (bundle == null) {
            return null;
        }
        Bundle bundleG = P1.g((C1371j[]) Arrays.copyOf(new C1371j[0], 0));
        bundleG.putAll(bundle);
        return bundleG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        if (!this.i) {
            Z.m mVar = this.f8039h;
            ((C1135a) mVar.f8312r).a();
            this.i = true;
            if (this.f8037e != null) {
                X.c(this.f8033a);
            }
            mVar.z(this.f8038g);
        }
        int iOrdinal = this.f8036d.ordinal();
        int iOrdinal2 = this.f8040k.ordinal();
        C0662z c0662z = this.j;
        if (iOrdinal < iOrdinal2) {
            c0662z.h(this.f8036d);
        } else {
            c0662z.h(this.f8040k);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(z.a(T1.d.class).c());
        sb.append("(" + this.f + ')');
        sb.append(" destination=");
        sb.append(this.f8034b);
        String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }
}
