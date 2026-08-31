package w1;

import O3.B0;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;
import q2.C1505j;

/* JADX INFO: loaded from: classes.dex */
public final class T implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q f18165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o0 f18166b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public T(View view, Q q7) {
        o0 o0VarB;
        this.f18165a = q7;
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        o0 o0VarA = AbstractC1827C.a(view);
        if (o0VarA != null) {
            int i = Build.VERSION.SDK_INT;
            o0VarB = (i >= 34 ? new d0(o0VarA) : i >= 30 ? new c0(o0VarA) : i >= 29 ? new b0(o0VarA) : new a0(o0VarA)).b();
        } else {
            o0VarB = null;
        }
        this.f18166b = o0VarB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z5;
        if (!view.isLaidOut()) {
            this.f18166b = o0.g(view, windowInsets);
            return U.i(view, windowInsets);
        }
        o0 o0VarG = o0.g(view, windowInsets);
        l0 l0Var = o0VarG.f18232a;
        if (this.f18166b == null) {
            WeakHashMap weakHashMap = AbstractC1835K.f18149a;
            this.f18166b = AbstractC1827C.a(view);
        }
        if (this.f18166b == null) {
            this.f18166b = o0VarG;
            return U.i(view, windowInsets);
        }
        Q qJ = U.j(view);
        if (qJ != null && Objects.equals(qJ.f18158q, o0VarG)) {
            return U.i(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        o0 o0Var = this.f18166b;
        int i = 1;
        while (i <= 512) {
            n1.b bVarG = l0Var.g(i);
            n1.b bVarG2 = o0Var.f18232a.g(i);
            int i7 = bVarG.f15125a;
            int i8 = bVarG.f15128d;
            int i9 = bVarG.f15127c;
            int i10 = bVarG.f15126b;
            int i11 = bVarG2.f15125a;
            int i12 = bVarG2.f15128d;
            int i13 = bVarG2.f15127c;
            int i14 = bVarG2.f15126b;
            if (i7 > i11 || i10 > i14 || i9 > i13 || i8 > i12) {
                iArr = iArr2;
                z5 = true;
            } else {
                iArr = iArr2;
                z5 = false;
            }
            if (z5 != (i7 < i11 || i10 < i14 || i9 < i13 || i8 < i12)) {
                if (z5) {
                    iArr[0] = iArr[0] | i;
                } else {
                    iArr3[0] = iArr3[0] | i;
                }
            }
            i <<= 1;
            iArr2 = iArr;
        }
        int i15 = iArr2[0];
        int i16 = iArr3[0];
        int i17 = i15 | i16;
        if (i17 == 0) {
            this.f18166b = o0VarG;
            return U.i(view, windowInsets);
        }
        o0 o0Var2 = this.f18166b;
        Z z6 = new Z(i17, (i15 & 8) != 0 ? U.f18167e : (i16 & 8) != 0 ? U.f : (i15 & 519) != 0 ? U.f18168g : (i16 & 519) != 0 ? U.f18169h : null, (i17 & 8) != 0 ? 160L : 250L);
        z6.f18179a.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(z6.f18179a.a());
        n1.b bVarG3 = l0Var.g(i17);
        n1.b bVarG4 = o0Var2.f18232a.g(i17);
        int iMin = Math.min(bVarG3.f15125a, bVarG4.f15125a);
        int i18 = bVarG3.f15126b;
        int i19 = bVarG4.f15126b;
        int iMin2 = Math.min(i18, i19);
        int i20 = bVarG3.f15127c;
        int i21 = bVarG4.f15127c;
        int iMin3 = Math.min(i20, i21);
        int i22 = bVarG3.f15128d;
        int i23 = bVarG4.f15128d;
        v3.l lVar = new v3.l(2, n1.b.b(iMin, iMin2, iMin3, Math.min(i22, i23)), n1.b.b(Math.max(bVarG3.f15125a, bVarG4.f15125a), Math.max(i18, i19), Math.max(i20, i21), Math.max(i22, i23)));
        U.f(view, z6, o0VarG, false);
        duration.addUpdateListener(new S(z6, o0VarG, o0Var2, i17, view));
        duration.addListener(new C1505j(view, z6));
        ViewTreeObserverOnPreDrawListenerC1852o.a(view, new B0(view, z6, lVar, duration, 10));
        this.f18166b = o0VarG;
        return U.i(view, windowInsets);
    }
}
