package E;

import A.C0028z;
import B0.AbstractC0041g;
import B0.InterfaceC0060z;
import c0.AbstractC0724l;
import com.google.android.gms.internal.measurement.I1;
import w.EnumC1778d0;
import z0.AbstractC1933J;
import z0.AbstractC1946f;
import z0.InterfaceC1925B;
import z0.InterfaceC1927D;

/* JADX INFO: renamed from: E.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0131n extends AbstractC0724l implements A0.f, InterfaceC0060z {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final C0129l f1576H = new C0129l();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public InterfaceC0132o f1577E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public C0128k f1578F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public EnumC1778d0 f1579G;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0060z
    public final InterfaceC1927D c(B0.T t6, InterfaceC1925B interfaceC1925B, long j) {
        AbstractC1933J abstractC1933JA = interfaceC1925B.a(j);
        return t6.f(abstractC1933JA.f18664q, abstractC1933JA.f18665r, n5.t.f15300q, new C0028z(abstractC1933JA, 2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // A0.f
    public final I1 h() {
        A0.i iVar = new A0.i(AbstractC1946f.f18691a);
        iVar.f172d.setValue(this);
        return iVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean x0(C0127j c0127j, int i) {
        if (i == 5 || i == 6) {
            if (this.f1579G == EnumC1778d0.f17946r) {
                return false;
            }
        } else if (i == 3 || i == 4) {
            if (this.f1579G == EnumC1778d0.f17945q) {
                return false;
            }
        } else if (i != 1 && i != 2) {
            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        if (y0(i)) {
            if (c0127j.f1571b >= this.f1577E.a() - 1) {
                return false;
            }
        } else if (c0127j.f1570a <= 0) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean y0(int i) {
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 5) {
            return false;
        }
        if (i == 6) {
            return true;
        }
        if (i == 3) {
            int iOrdinal = AbstractC0041g.u(this).f262O.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal == 1) {
                return true;
            }
            throw new C2.e();
        }
        if (i != 4) {
            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        int iOrdinal2 = AbstractC0041g.u(this).f262O.ordinal();
        if (iOrdinal2 == 0) {
            return true;
        }
        if (iOrdinal2 == 1) {
            return false;
        }
        throw new C2.e();
    }
}
