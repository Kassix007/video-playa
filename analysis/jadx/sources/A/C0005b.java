package A;

import P.C0345b;
import P.C0363k;
import P.C0371o;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: A.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0005b implements InterfaceC0010g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84a = 1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final C0004a c(int i, String str) {
        WeakHashMap weakHashMap = Z.f60v;
        return new C0004a(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final V d(int i, String str) {
        WeakHashMap weakHashMap = Z.f60v;
        return new V(new G(0, 0, 0, 0), str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Z e(C0371o c0371o) {
        Z z5;
        View view = (View) c0371o.k(AndroidCompositionLocals_androidKt.f);
        WeakHashMap weakHashMap = Z.f60v;
        synchronized (weakHashMap) {
            try {
                Object z6 = weakHashMap.get(view);
                if (z6 == null) {
                    z6 = new Z(view);
                    weakHashMap.put(view, z6);
                }
                z5 = (Z) z6;
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean zI = c0371o.i(z5) | c0371o.i(view);
        Object objH = c0371o.H();
        if (zI || objH == C0363k.f5418a) {
            objH = new Y(0, z5, view);
            c0371o.d0(objH);
        }
        C0345b.c(z5, (B5.c) objH, c0371o);
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // A.InterfaceC0010g
    public void b(W0.c cVar, int i, int[] iArr, int[] iArr2) {
        switch (this.f84a) {
            case 0:
                AbstractC0012i.c(i, iArr, iArr2, false);
                break;
            default:
                AbstractC0012i.b(iArr, iArr2, false);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f84a) {
            case 0:
                return "Arrangement#Bottom";
            case 1:
                return "Arrangement#Top";
            default:
                return super.toString();
        }
    }
}
