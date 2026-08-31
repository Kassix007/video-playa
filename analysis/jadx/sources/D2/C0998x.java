package d2;

import M.C0231t;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: renamed from: d2.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0998x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f12220a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [androidx.recyclerview.widget.RecyclerView.<init>(android.content.Context, android.util.AttributeSet, int):void] */
    public /* synthetic */ C0998x(RecyclerView recyclerView) {
        this.f12220a = recyclerView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a(C0975a c0975a) {
        int i = c0975a.f12059a;
        RecyclerView recyclerView = this.f12220a;
        if (i == 1) {
            recyclerView.f9604B.W(c0975a.f12060b, c0975a.f12061c);
            return;
        }
        if (i == 2) {
            recyclerView.f9604B.Z(c0975a.f12060b, c0975a.f12061c);
        } else if (i == 4) {
            recyclerView.f9604B.a0(c0975a.f12060b, c0975a.f12061c);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.f9604B.Y(c0975a.f12060b, c0975a.f12061c);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0974V b(int i) {
        RecyclerView recyclerView = this.f12220a;
        int iG = recyclerView.f9656u.G();
        int i7 = 0;
        AbstractC0974V abstractC0974V = null;
        while (true) {
            if (i7 >= iG) {
                break;
            }
            AbstractC0974V abstractC0974VI = RecyclerView.I(recyclerView.f9656u.F(i7));
            if (abstractC0974VI != null && !abstractC0974VI.h() && abstractC0974VI.f12034c == i) {
                if (!((ArrayList) recyclerView.f9656u.f236t).contains(abstractC0974VI.f12032a)) {
                    abstractC0974V = abstractC0974VI;
                    break;
                }
                abstractC0974V = abstractC0974VI;
            }
            i7++;
        }
        if (abstractC0974V != null) {
            if (!((ArrayList) recyclerView.f9656u.f236t).contains(abstractC0974V.f12032a)) {
                return abstractC0974V;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void c(int i, int i7) {
        int i8;
        int i9;
        RecyclerView recyclerView = this.f12220a;
        int iG = recyclerView.f9656u.G();
        int i10 = i7 + i;
        for (int i11 = 0; i11 < iG; i11++) {
            View viewF = recyclerView.f9656u.F(i11);
            AbstractC0974V abstractC0974VI = RecyclerView.I(viewF);
            if (abstractC0974VI != null && !abstractC0974VI.o() && (i9 = abstractC0974VI.f12034c) >= i && i9 < i10) {
                abstractC0974VI.a(2);
                abstractC0974VI.a(1024);
                ((C0961H) viewF.getLayoutParams()).f11991c = true;
            }
        }
        C0966M c0966m = recyclerView.f9650r;
        ArrayList arrayList = c0966m.f12001c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC0974V abstractC0974V = (AbstractC0974V) arrayList.get(size);
            if (abstractC0974V != null && (i8 = abstractC0974V.f12034c) >= i && i8 < i10) {
                abstractC0974V.a(2);
                c0966m.e(size);
            }
        }
        recyclerView.f9661w0 = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void d(int i, int i7) {
        RecyclerView recyclerView = this.f12220a;
        int iG = recyclerView.f9656u.G();
        for (int i8 = 0; i8 < iG; i8++) {
            AbstractC0974V abstractC0974VI = RecyclerView.I(recyclerView.f9656u.F(i8));
            if (abstractC0974VI != null && !abstractC0974VI.o() && abstractC0974VI.f12034c >= i) {
                abstractC0974VI.l(i7, false);
                recyclerView.f9653s0.f = true;
            }
        }
        ArrayList arrayList = recyclerView.f9650r.f12001c;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            AbstractC0974V abstractC0974V = (AbstractC0974V) arrayList.get(i9);
            if (abstractC0974V != null && abstractC0974V.f12034c >= i) {
                abstractC0974V.l(i7, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f9659v0 = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void e(int i, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        RecyclerView recyclerView = this.f12220a;
        int iG = recyclerView.f9656u.G();
        int i15 = -1;
        if (i < i7) {
            i9 = i;
            i8 = i7;
            i10 = -1;
        } else {
            i8 = i;
            i9 = i7;
            i10 = 1;
        }
        for (int i16 = 0; i16 < iG; i16++) {
            AbstractC0974V abstractC0974VI = RecyclerView.I(recyclerView.f9656u.F(i16));
            if (abstractC0974VI != null && (i14 = abstractC0974VI.f12034c) >= i9 && i14 <= i8) {
                if (i14 == i) {
                    abstractC0974VI.l(i7 - i, false);
                } else {
                    abstractC0974VI.l(i10, false);
                }
                recyclerView.f9653s0.f = true;
            }
        }
        ArrayList arrayList = recyclerView.f9650r.f12001c;
        if (i < i7) {
            i12 = i;
            i11 = i7;
        } else {
            i11 = i;
            i12 = i7;
            i15 = 1;
        }
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            AbstractC0974V abstractC0974V = (AbstractC0974V) arrayList.get(i17);
            if (abstractC0974V != null && (i13 = abstractC0974V.f12034c) >= i12 && i13 <= i11) {
                if (i13 == i) {
                    abstractC0974V.l(i7 - i, false);
                } else {
                    abstractC0974V.l(i15, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f9659v0 = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(d2.AbstractC0974V r9, M.C0231t r10, M.C0231t r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r8.f12220a
            r0.getClass()
            r1 = 0
            r9.n(r1)
            d2.D r1 = r0.f9632a0
            r2 = r1
            d2.h r2 = (d2.C0982h) r2
            if (r10 == 0) goto L20
            r2.getClass()
            int r4 = r10.f3616a
            int r6 = r11.f3616a
            if (r4 != r6) goto L22
            int r1 = r10.f3617b
            int r3 = r11.f3617b
            if (r1 == r3) goto L20
            goto L22
        L20:
            r3 = r9
            goto L2c
        L22:
            int r5 = r10.f3617b
            int r7 = r11.f3617b
            r3 = r9
            boolean r9 = r2.g(r3, r4, r5, r6, r7)
            goto L3b
        L2c:
            r2.l(r3)
            android.view.View r9 = r3.f12032a
            r10 = 0
            r9.setAlpha(r10)
            java.util.ArrayList r9 = r2.i
            r9.add(r3)
            r9 = 1
        L3b:
            if (r9 == 0) goto L40
            r0.S()
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.C0998x.f(d2.V, M.t, M.t):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void g(AbstractC0974V abstractC0974V, C0231t c0231t, C0231t c0231t2) {
        boolean zG;
        RecyclerView recyclerView = this.f12220a;
        recyclerView.f9650r.j(abstractC0974V);
        recyclerView.f(abstractC0974V);
        abstractC0974V.n(false);
        C0982h c0982h = (C0982h) recyclerView.f9632a0;
        c0982h.getClass();
        int i = c0231t.f3616a;
        int i7 = c0231t.f3617b;
        View view = abstractC0974V.f12032a;
        int left = c0231t2 == null ? view.getLeft() : c0231t2.f3616a;
        int top = c0231t2 == null ? view.getTop() : c0231t2.f3617b;
        if (abstractC0974V.h() || (i == left && i7 == top)) {
            c0982h.l(abstractC0974V);
            c0982h.f12122h.add(abstractC0974V);
            zG = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zG = c0982h.g(abstractC0974V, i, i7, left, top);
        }
        if (zG) {
            recyclerView.S();
        }
    }
}
