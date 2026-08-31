package U1;

import P.C0371o;
import com.google.android.gms.internal.measurement.K1;
import m5.C1386y;
import t.C1608g;

/* JADX INFO: loaded from: classes.dex */
public final class m implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7558q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f7559r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f7560s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ m(int i, Object obj, Object obj2) {
        this.f7558q = i;
        this.f7559r = obj;
        this.f7560s = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7558q) {
            case 0:
                C0371o c0371o = (C0371o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0371o.x()) {
                    c0371o.N();
                } else {
                    ((q) this.f7559r).f7574w.invoke((T1.d) this.f7560s, c0371o, 0);
                }
                break;
            case 1:
                C0371o c0371o2 = (C0371o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0371o2.x()) {
                    c0371o2.N();
                } else {
                    K1.b((Z.c) this.f7559r, (X.e) this.f7560s, c0371o2, 0);
                }
                break;
            default:
                C0371o c0371o3 = (C0371o) obj;
                int iIntValue = ((Number) obj2).intValue();
                T1.d dVar = (T1.d) this.f7560s;
                if ((iIntValue & 3) == 2 && c0371o3.x()) {
                    c0371o3.N();
                } else {
                    T1.p pVar = dVar.f7354r;
                    kotlin.jvm.internal.m.c(pVar, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                    ((h) pVar).f7549v.invoke((C1608g) this.f7559r, dVar, c0371o3, 0);
                }
                break;
        }
        return C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public m(T1.d dVar, C1608g c1608g) {
        this.f7558q = 2;
        this.f7560s = dVar;
        this.f7559r = c1608g;
    }
}
