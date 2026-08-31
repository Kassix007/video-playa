package z3;

import S3.e;
import S3.k;
import Z.m;
import com.google.android.gms.internal.measurement.O1;
import i1.C1134a;
import i3.C1136a;
import r6.f;
import u3.d;
import v3.w;
import v3.z;
import x3.C1901m;

/* JADX INFO: renamed from: z3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1966b extends d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final m f18743k = new m("ClientTelemetry.API", new Q3.b(3), new f());

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final k b(C1901m c1901m) {
        C1134a c1134a = new C1134a(11);
        com.google.android.gms.common.d[] dVarArr = {I3.c.f2413a};
        c1134a.f13535r = new C1136a(21, c1901m);
        O1 o12 = new O1(c1134a, dVarArr, false);
        e eVar = new e();
        v3.e eVar2 = this.j;
        I3.e eVar3 = eVar2.f17574m;
        eVar3.sendMessage(eVar3.obtainMessage(4, new w(new z(o12, eVar, this.i), eVar2.i.get(), this)));
        return eVar.f7306a;
    }
}
