package C0;

import B0.InterfaceC0048m;
import c0.AbstractC0724l;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import java.util.List;

/* JADX INFO: renamed from: C0.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0106v extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1134q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f1135r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0106v(kotlin.jvm.internal.y yVar, int i) {
        super(1);
        this.f1134q = i;
        this.f1135r = yVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        boolean z5;
        switch (this.f1134q) {
            case 0:
                this.f1135r.f14268q = (h0.o) obj;
                return Boolean.TRUE;
            case 1:
                B0.E0 e02 = (B0.E0) obj;
                kotlin.jvm.internal.m.c(e02, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
                E.K k7 = ((E.g0) e02).f1565E;
                kotlin.jvm.internal.y yVar = this.f1135r;
                List listC = (List) yVar.f14268q;
                if (listC != null) {
                    listC.add(k7);
                } else {
                    listC = AbstractC0836n2.C(k7);
                }
                yVar.f14268q = listC;
                return B0.D0.f222r;
            default:
                InterfaceC0048m interfaceC0048m = (B0.E0) obj;
                if (((AbstractC0724l) interfaceC0048m).f10100q.f10099D) {
                    this.f1135r.f14268q = interfaceC0048m;
                    z5 = false;
                } else {
                    z5 = true;
                }
                return Boolean.valueOf(z5);
        }
    }
}
