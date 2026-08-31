package R4;

import P.C0345b;
import P.C0371o;
import U4.AbstractC0534a;
import Z4.C0567i;
import j5.C1165b;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import m5.C1386y;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Z implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f6903q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f6904r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f6905s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ Z(int i, int i7, Object obj, Object obj2) {
        this.f6903q = i7;
        this.f6904r = obj;
        this.f6905s = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, java.util.List] */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) throws XmlPullParserException, IOException {
        switch (this.f6903q) {
            case 0:
                ((Integer) obj2).getClass();
                ((V) this.f6904r).a((String) this.f6905s, (C0371o) obj, C0345b.w(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((V) this.f6904r).e((B5.c) this.f6905s, (C0371o) obj, C0345b.w(7));
                break;
            case 2:
                ((Integer) obj2).getClass();
                com.google.android.gms.internal.measurement.I1.F((List) this.f6904r, (Collection) this.f6905s, (C0371o) obj, C0345b.w(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                com.google.android.gms.internal.measurement.K1.b((Z.c) this.f6904r, (X.e) this.f6905s, (C0371o) obj, C0345b.w(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                AbstractC0534a.i((C0468k1) this.f6904r, (C1165b) this.f6905s, (C0371o) obj, C0345b.w(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                int iW = C0345b.w(1);
                AbstractC0534a.o(this.f6904r, (Integer) this.f6905s, (C0371o) obj, iW);
                break;
            case 6:
                ((Integer) obj2).getClass();
                Z4.L.b((Z4.o) this.f6904r, (B5.a) this.f6905s, (C0371o) obj, C0345b.w(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                Z4.L.a((C0567i) this.f6904r, (B5.a) this.f6905s, (C0371o) obj, C0345b.w(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                Q2.g.g((C0468k1) this.f6904r, (String) this.f6905s, (C0371o) obj, C0345b.w(1));
                break;
            default:
                ((Integer) obj2).getClass();
                E3.h.a((List) this.f6904r, (B5.c) this.f6905s, (C0371o) obj, C0345b.w(1));
                break;
        }
        return C1386y.f15098a;
    }
}
