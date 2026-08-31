package d2;

import B0.G0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import c2.AbstractC0730a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import w1.AbstractC1835K;

/* JADX INFO: renamed from: d2.G, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0960G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public G0 f11977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f11978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Z.m f11979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Z.m f11980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0994t f11981e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f11982g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f11983h;
    public final boolean i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f11984k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11985l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f11986m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f11987n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11988o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0960G() {
        k3.d dVar = new k3.d(24, this);
        k3.c cVar = new k3.c(this);
        this.f11979c = new Z.m(dVar);
        this.f11980d = new Z.m(cVar);
        this.f = false;
        this.f11982g = false;
        this.f11983h = true;
        this.i = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int A(View view) {
        Rect rect = ((C0961H) view.getLayoutParams()).f11990b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int H(View view) {
        return ((C0961H) view.getLayoutParams()).f11989a.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C0959F I(Context context, AttributeSet attributeSet, int i, int i7) {
        C0959F c0959f = new C0959F();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0730a.f10113a, i, i7);
        c0959f.f11973a = typedArrayObtainStyledAttributes.getInt(0, 1);
        c0959f.f11974b = typedArrayObtainStyledAttributes.getInt(10, 1);
        c0959f.f11975c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        c0959f.f11976d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return c0959f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean M(int i, int i7, int i8) {
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        if (i8 > 0 && i != i8) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void N(View view, int i, int i7, int i8, int i9) {
        C0961H c0961h = (C0961H) view.getLayoutParams();
        Rect rect = c0961h.f11990b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) c0961h).leftMargin, i7 + rect.top + ((ViewGroup.MarginLayoutParams) c0961h).topMargin, (i8 - rect.right) - ((ViewGroup.MarginLayoutParams) c0961h).rightMargin, (i9 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c0961h).bottomMargin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int g(int i, int i7, int i8) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i7, i8) : size : Math.min(size, Math.max(i7, i8));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int w(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            int r5 = r5 - r7
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L1d
            if (r8 < 0) goto L12
        L10:
            r6 = r3
            goto L30
        L12:
            if (r8 != r1) goto L1a
            if (r6 == r2) goto L22
            if (r6 == 0) goto L1a
            if (r6 == r3) goto L22
        L1a:
            r6 = r7
            r8 = r6
            goto L30
        L1d:
            if (r8 < 0) goto L20
            goto L10
        L20:
            if (r8 != r1) goto L24
        L22:
            r8 = r5
            goto L30
        L24:
            if (r8 != r0) goto L1a
            if (r6 == r2) goto L2e
            if (r6 != r3) goto L2b
            goto L2e
        L2b:
            r8 = r5
            r6 = r7
            goto L30
        L2e:
            r8 = r5
            r6 = r2
        L30:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.AbstractC0960G.w(boolean, int, int, int, int):int");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int z(View view) {
        Rect rect = ((C0961H) view.getLayoutParams()).f11990b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int B() {
        RecyclerView recyclerView = this.f11978b;
        AbstractC1000z adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int C() {
        RecyclerView recyclerView = this.f11978b;
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        return recyclerView.getLayoutDirection();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int D() {
        RecyclerView recyclerView = this.f11978b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int E() {
        RecyclerView recyclerView = this.f11978b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int F() {
        RecyclerView recyclerView = this.f11978b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int G() {
        RecyclerView recyclerView = this.f11978b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int J(C0966M c0966m, C0971S c0971s) {
        RecyclerView recyclerView = this.f11978b;
        if (recyclerView == null || recyclerView.f9602A == null || !e()) {
            return 1;
        }
        return this.f11978b.f9602A.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void K(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((C0961H) view.getLayoutParams()).f11990b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f11978b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f11978b.f9666z;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean L();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void O(int i) {
        RecyclerView recyclerView = this.f11978b;
        if (recyclerView != null) {
            int iV = recyclerView.f9656u.v();
            for (int i7 = 0; i7 < iV; i7++) {
                recyclerView.f9656u.u(i7).offsetLeftAndRight(i);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void P(int i) {
        RecyclerView recyclerView = this.f11978b;
        if (recyclerView != null) {
            int iV = recyclerView.f9656u.v();
            for (int i7 = 0; i7 < iV; i7++) {
                recyclerView.f9656u.u(i7).offsetTopAndBottom(i);
            }
        }
    }

    public abstract void R(RecyclerView recyclerView);

    public abstract View S(View view, int i, C0966M c0966m, C0971S c0971s);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void T(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f11978b;
        C0966M c0966m = recyclerView.f9650r;
        C0971S c0971s = recyclerView.f9653s0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z5 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f11978b.canScrollVertically(-1) && !this.f11978b.canScrollHorizontally(-1) && !this.f11978b.canScrollHorizontally(1)) {
            z5 = false;
        }
        accessibilityEvent.setScrollable(z5);
        AbstractC1000z abstractC1000z = this.f11978b.f9602A;
        if (abstractC1000z != null) {
            accessibilityEvent.setItemCount(abstractC1000z.a());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void U(View view, x1.e eVar) {
        AbstractC0974V abstractC0974VI = RecyclerView.I(view);
        if (abstractC0974VI == null || abstractC0974VI.h()) {
            return;
        }
        G0 g02 = this.f11977a;
        if (((ArrayList) g02.f236t).contains(abstractC0974VI.f12032a)) {
            return;
        }
        RecyclerView recyclerView = this.f11978b;
        V(recyclerView.f9650r, recyclerView.f9653s0, view, eVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void V(C0966M c0966m, C0971S c0971s, View view, x1.e eVar) {
        eVar.k(E0.a.a(false, e() ? H(view) : 0, 1, d() ? H(view) : 0, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(View view, int i, boolean z5) {
        AbstractC0974V abstractC0974VI = RecyclerView.I(view);
        if (z5 || abstractC0974VI.h()) {
            r.Q q7 = (r.Q) this.f11978b.f9658v.f8312r;
            g0 g0VarA = (g0) q7.get(abstractC0974VI);
            if (g0VarA == null) {
                g0VarA = g0.a();
                q7.put(abstractC0974VI, g0VarA);
            }
            g0VarA.f12117a |= 1;
        } else {
            this.f11978b.f9658v.D(abstractC0974VI);
        }
        C0961H c0961h = (C0961H) view.getLayoutParams();
        if (abstractC0974VI.p() || abstractC0974VI.i()) {
            if (abstractC0974VI.i()) {
                abstractC0974VI.f12042n.j(abstractC0974VI);
            } else {
                abstractC0974VI.j &= -33;
            }
            this.f11977a.m(view, i, view.getLayoutParams(), false);
        } else {
            if (view.getParent() == this.f11978b) {
                G0 g02 = this.f11977a;
                O3.T t6 = (O3.T) g02.f235s;
                int iIndexOfChild = ((C0999y) g02.f234r).f12221a.indexOfChild(view);
                int iC = (iIndexOfChild == -1 || t6.e(iIndexOfChild)) ? -1 : iIndexOfChild - t6.c(iIndexOfChild);
                if (i == -1) {
                    i = this.f11977a.v();
                }
                if (iC == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f11978b.indexOfChild(view) + this.f11978b.y());
                }
                if (iC != i) {
                    AbstractC0960G abstractC0960G = this.f11978b.f9604B;
                    View viewU = abstractC0960G.u(iC);
                    if (viewU == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iC + abstractC0960G.f11978b.toString());
                    }
                    abstractC0960G.u(iC);
                    abstractC0960G.f11977a.q(iC);
                    C0961H c0961h2 = (C0961H) viewU.getLayoutParams();
                    AbstractC0974V abstractC0974VI2 = RecyclerView.I(viewU);
                    if (abstractC0974VI2.h()) {
                        r.Q q8 = (r.Q) abstractC0960G.f11978b.f9658v.f8312r;
                        g0 g0VarA2 = (g0) q8.get(abstractC0974VI2);
                        if (g0VarA2 == null) {
                            g0VarA2 = g0.a();
                            q8.put(abstractC0974VI2, g0VarA2);
                        }
                        g0VarA2.f12117a = 1 | g0VarA2.f12117a;
                    } else {
                        abstractC0960G.f11978b.f9658v.D(abstractC0974VI2);
                    }
                    abstractC0960G.f11977a.m(viewU, i, c0961h2, abstractC0974VI2.h());
                }
            } else {
                this.f11977a.l(view, i, false);
                c0961h.f11991c = true;
                C0994t c0994t = this.f11981e;
                if (c0994t != null && c0994t.f12205e) {
                    c0994t.f12202b.getClass();
                    AbstractC0974V abstractC0974VI3 = RecyclerView.I(view);
                    if ((abstractC0974VI3 != null ? abstractC0974VI3.b() : -1) == c0994t.f12201a) {
                        c0994t.f = view;
                    }
                }
            }
        }
        if (c0961h.f11992d) {
            abstractC0974VI.f12032a.invalidate();
            c0961h.f11992d = false;
        }
    }

    public abstract void b0(C0966M c0966m, C0971S c0971s);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void c(String str) {
        RecyclerView recyclerView = this.f11978b;
        if (recyclerView != null) {
            recyclerView.i(str);
        }
    }

    public abstract void c0(C0971S c0971s);

    public abstract boolean d();

    public abstract boolean e();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Parcelable e0() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean f(C0961H c0961h) {
        return c0961h != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g0(C0966M c0966m) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            if (!RecyclerView.I(u(iV)).o()) {
                View viewU = u(iV);
                j0(iV);
                c0966m.f(viewU);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h0(C0966M c0966m) {
        ArrayList arrayList = c0966m.f11999a;
        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((AbstractC0974V) arrayList.get(i)).f12032a;
            AbstractC0974V abstractC0974VI = RecyclerView.I(view);
            if (!abstractC0974VI.o()) {
                abstractC0974VI.n(false);
                if (abstractC0974VI.j()) {
                    this.f11978b.removeDetachedView(view, false);
                }
                AbstractC0957D abstractC0957D = this.f11978b.f9632a0;
                if (abstractC0957D != null) {
                    abstractC0957D.d(abstractC0974VI);
                }
                abstractC0974VI.n(true);
                AbstractC0974V abstractC0974VI2 = RecyclerView.I(view);
                abstractC0974VI2.f12042n = null;
                abstractC0974VI2.f12043o = false;
                abstractC0974VI2.j &= -33;
                c0966m.g(abstractC0974VI2);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = c0966m.f12000b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f11978b.invalidate();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i0(View view, C0966M c0966m) {
        G0 g02 = this.f11977a;
        C0999y c0999y = (C0999y) g02.f234r;
        int iIndexOfChild = c0999y.f12221a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            if (((O3.T) g02.f235s).i(iIndexOfChild)) {
                g02.Z(view);
            }
            c0999y.a(iIndexOfChild);
        }
        c0966m.f(view);
    }

    public abstract int j(C0971S c0971s);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j0(int i) {
        if (u(i) != null) {
            G0 g02 = this.f11977a;
            int iC = g02.C(i);
            C0999y c0999y = (C0999y) g02.f234r;
            View childAt = c0999y.f12221a.getChildAt(iC);
            if (childAt == null) {
                return;
            }
            if (((O3.T) g02.f235s).i(iC)) {
                g02.Z(childAt);
            }
            c0999y.a(iC);
        }
    }

    public abstract int k(C0971S c0971s);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean k0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.E()
            int r1 = r8.G()
            int r2 = r8.f11987n
            int r3 = r8.F()
            int r2 = r2 - r3
            int r3 = r8.f11988o
            int r4 = r8.D()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            int r3 = r8.C()
            r7 = 1
            if (r3 != r7) goto L5c
            if (r2 == 0) goto L57
            goto L64
        L57:
            int r2 = java.lang.Math.max(r6, r10)
            goto L64
        L5c:
            if (r6 == 0) goto L5f
            goto L63
        L5f:
            int r6 = java.lang.Math.min(r4, r2)
        L63:
            r2 = r6
        L64:
            if (r1 == 0) goto L67
            goto L6b
        L67:
            int r1 = java.lang.Math.min(r5, r11)
        L6b:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto Lae
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L7c
            goto Lb3
        L7c:
            int r1 = r8.E()
            int r2 = r8.G()
            int r3 = r8.f11987n
            int r4 = r8.F()
            int r3 = r3 - r4
            int r4 = r8.f11988o
            int r5 = r8.D()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.f11978b
            android.graphics.Rect r5 = r5.f9662x
            r8.y(r13, r5)
            int r13 = r5.left
            int r13 = r13 - r11
            if (r13 >= r3) goto Lb3
            int r13 = r5.right
            int r13 = r13 - r11
            if (r13 <= r1) goto Lb3
            int r13 = r5.top
            int r13 = r13 - r10
            if (r13 >= r4) goto Lb3
            int r13 = r5.bottom
            int r13 = r13 - r10
            if (r13 > r2) goto Lae
            goto Lb3
        Lae:
            if (r11 != 0) goto Lb4
            if (r10 == 0) goto Lb3
            goto Lb4
        Lb3:
            return r0
        Lb4:
            if (r12 == 0) goto Lba
            r9.scrollBy(r11, r10)
            return r7
        Lba:
            r9.Z(r11, r10, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.AbstractC0960G.k0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public abstract int l(C0971S c0971s);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l0() {
        RecyclerView recyclerView = this.f11978b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int m(C0971S c0971s);

    public abstract int m0(int i, C0966M c0966m, C0971S c0971s);

    public abstract int n(C0971S c0971s);

    public abstract void n0(int i);

    public abstract int o(C0971S c0971s);

    public abstract int o0(int i, C0966M c0966m, C0971S c0971s);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void p(C0966M c0966m) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            AbstractC0974V abstractC0974VI = RecyclerView.I(viewU);
            if (!abstractC0974VI.o()) {
                if (!abstractC0974VI.f() || abstractC0974VI.h() || this.f11978b.f9602A.f12223b) {
                    u(iV);
                    this.f11977a.q(iV);
                    c0966m.h(viewU);
                    this.f11978b.f9658v.D(abstractC0974VI);
                } else {
                    j0(iV);
                    c0966m.g(abstractC0974VI);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void p0(RecyclerView recyclerView) {
        q0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public View q(int i) {
        int iV = v();
        for (int i7 = 0; i7 < iV; i7++) {
            View viewU = u(i7);
            AbstractC0974V abstractC0974VI = RecyclerView.I(viewU);
            if (abstractC0974VI != null && abstractC0974VI.b() == i && !abstractC0974VI.o() && (this.f11978b.f9653s0.f12018g || !abstractC0974VI.h())) {
                return viewU;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void q0(int i, int i7) {
        this.f11987n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.f11985l = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.f9599I0;
        }
        this.f11988o = View.MeasureSpec.getSize(i7);
        int mode2 = View.MeasureSpec.getMode(i7);
        this.f11986m = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.f9599I0;
        }
    }

    public abstract C0961H r();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void r0(Rect rect, int i, int i7) {
        int iF = F() + E() + rect.width();
        int iD = D() + G() + rect.height();
        RecyclerView recyclerView = this.f11978b;
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        this.f11978b.setMeasuredDimension(g(i, iF, recyclerView.getMinimumWidth()), g(i7, iD, this.f11978b.getMinimumHeight()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0961H s(Context context, AttributeSet attributeSet) {
        return new C0961H(context, attributeSet);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void s0(int i, int i7) {
        int iV = v();
        if (iV == 0) {
            this.f11978b.n(i, i7);
            return;
        }
        int i8 = Integer.MIN_VALUE;
        int i9 = Integer.MAX_VALUE;
        int i10 = Integer.MIN_VALUE;
        int i11 = Integer.MAX_VALUE;
        for (int i12 = 0; i12 < iV; i12++) {
            View viewU = u(i12);
            Rect rect = this.f11978b.f9662x;
            y(viewU, rect);
            int i13 = rect.left;
            if (i13 < i11) {
                i11 = i13;
            }
            int i14 = rect.right;
            if (i14 > i8) {
                i8 = i14;
            }
            int i15 = rect.top;
            if (i15 < i9) {
                i9 = i15;
            }
            int i16 = rect.bottom;
            if (i16 > i10) {
                i10 = i16;
            }
        }
        this.f11978b.f9662x.set(i11, i9, i8, i10);
        r0(this.f11978b.f9662x, i, i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0961H t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0961H ? new C0961H((C0961H) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0961H((ViewGroup.MarginLayoutParams) layoutParams) : new C0961H(layoutParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void t0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f11978b = null;
            this.f11977a = null;
            this.f11987n = 0;
            this.f11988o = 0;
        } else {
            this.f11978b = recyclerView;
            this.f11977a = recyclerView.f9656u;
            this.f11987n = recyclerView.getWidth();
            this.f11988o = recyclerView.getHeight();
        }
        this.f11985l = 1073741824;
        this.f11986m = 1073741824;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final View u(int i) {
        G0 g02 = this.f11977a;
        if (g02 != null) {
            return g02.u(i);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean u0(View view, int i, int i7, C0961H c0961h) {
        return (!view.isLayoutRequested() && this.f11983h && M(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) c0961h).width) && M(view.getHeight(), i7, ((ViewGroup.MarginLayoutParams) c0961h).height)) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int v() {
        G0 g02 = this.f11977a;
        if (g02 != null) {
            return g02.v();
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean v0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean w0(View view, int i, int i7, C0961H c0961h) {
        return (this.f11983h && M(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) c0961h).width) && M(view.getMeasuredHeight(), i7, ((ViewGroup.MarginLayoutParams) c0961h).height)) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int x(C0966M c0966m, C0971S c0971s) {
        RecyclerView recyclerView = this.f11978b;
        if (recyclerView == null || recyclerView.f9602A == null || !d()) {
            return 1;
        }
        return this.f11978b.f9602A.a();
    }

    public abstract void x0(RecyclerView recyclerView, int i);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void y(View view, Rect rect) {
        int[] iArr = RecyclerView.f9599I0;
        C0961H c0961h = (C0961H) view.getLayoutParams();
        Rect rect2 = c0961h.f11990b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c0961h).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c0961h).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c0961h).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0961h).bottomMargin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void y0(C0994t c0994t) {
        C0994t c0994t2 = this.f11981e;
        if (c0994t2 != null && c0994t != c0994t2 && c0994t2.f12205e) {
            c0994t2.i();
        }
        this.f11981e = c0994t;
        RecyclerView recyclerView = this.f11978b;
        RunnableC0973U runnableC0973U = recyclerView.f9647p0;
        runnableC0973U.f12030w.removeCallbacks(runnableC0973U);
        runnableC0973U.f12026s.abortAnimation();
        if (c0994t.f12207h) {
            Log.w("RecyclerView", "An instance of " + c0994t.getClass().getSimpleName() + " was started more than once. Each instance of" + c0994t.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        c0994t.f12202b = recyclerView;
        c0994t.f12203c = this;
        int i = c0994t.f12201a;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f9653s0.f12013a = i;
        c0994t.f12205e = true;
        c0994t.f12204d = true;
        c0994t.f = recyclerView.f9604B.q(i);
        c0994t.f12202b.f9647p0.a();
        c0994t.f12207h = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean z0() {
        return false;
    }

    public void X() {
    }

    public void Q(RecyclerView recyclerView) {
    }

    public void d0(Parcelable parcelable) {
    }

    public void f0(int i) {
    }

    public void W(int i, int i7) {
    }

    public void Y(int i, int i7) {
    }

    public void Z(int i, int i7) {
    }

    public void a0(int i, int i7) {
    }

    public void i(int i, Q.J j) {
    }

    public void h(int i, int i7, C0971S c0971s, Q.J j) {
    }
}
