package w1;

import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class W extends WindowInsetsAnimation$Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q f18170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f18171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f18172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f18173d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public W(Q q7) {
        super(q7.f18159r);
        this.f18173d = new HashMap();
        this.f18170a = q7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Z a(WindowInsetsAnimation windowInsetsAnimation) {
        Z z5 = (Z) this.f18173d.get(windowInsetsAnimation);
        if (z5 == null) {
            z5 = new Z(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                z5.f18179a = new X(windowInsetsAnimation);
            }
            this.f18173d.put(windowInsetsAnimation, z5);
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f18170a.a(a(windowInsetsAnimation));
        this.f18173d.remove(windowInsetsAnimation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        this.f18170a.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f18172c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f18172c = arrayList2;
            this.f18171b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationF = V.f(list.get(size));
            Z zA = a(windowInsetsAnimationF);
            zA.f18179a.d(windowInsetsAnimationF.getFraction());
            this.f18172c.add(zA);
        }
        return this.f18170a.d(o0.g(null, windowInsets), this.f18171b).f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        a(windowInsetsAnimation);
        v3.l lVarE = this.f18170a.e(new v3.l(bounds));
        lVarE.getClass();
        V.i();
        return V.e(((n1.b) lVarE.f17579r).d(), ((n1.b) lVarE.f17580s).d());
    }
}
