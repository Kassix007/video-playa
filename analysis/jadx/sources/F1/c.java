package F1;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;
import o5.C1423e;
import s4.e;
import w1.AbstractC1835K;
import w1.C1838a;
import w1.C1839b;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1941q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1942r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1943s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f1944t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c() {
        if (e.f16469r == null) {
            e.f16469r = new e(7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int a(int i) {
        if (i < this.f1943s) {
            return ((ByteBuffer) this.f1944t).getShort(this.f1942r + i);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b() {
        if (((C1423e) this.f1944t).f15460x != this.f1943s) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void e() {
        while (true) {
            int i = this.f1941q;
            C1423e c1423e = (C1423e) this.f1944t;
            if (i >= c1423e.f15458v || c1423e.f15455s[i] >= 0) {
                return;
            } else {
                this.f1941q = i + 1;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void f(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f1942r) {
            d(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f1942r) {
            tag = c(view);
        } else {
            tag = view.getTag(this.f1941q);
            if (!((Class) this.f1944t).isInstance(tag)) {
                tag = null;
            }
        }
        if (g(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateD = AbstractC1835K.d(view);
            C1839b c1839b = accessibilityDelegateD == null ? null : accessibilityDelegateD instanceof C1838a ? ((C1838a) accessibilityDelegateD).f18180a : new C1839b(accessibilityDelegateD);
            if (c1839b == null) {
                c1839b = new C1839b();
            }
            AbstractC1835K.m(view, c1839b);
            view.setTag(this.f1941q, obj);
            AbstractC1835K.h(view, this.f1943s);
        }
    }

    public abstract boolean g(Object obj, Object obj2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean hasNext() {
        return this.f1941q < ((C1423e) this.f1944t).f15458v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void remove() {
        C1423e c1423e = (C1423e) this.f1944t;
        b();
        if (this.f1942r == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        c1423e.c();
        c1423e.l(this.f1942r);
        this.f1942r = -1;
        this.f1943s = c1423e.f15460x;
    }
}
