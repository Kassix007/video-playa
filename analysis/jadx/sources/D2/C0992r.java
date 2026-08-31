package d2;

import android.view.View;
import java.util.List;

/* JADX INFO: renamed from: d2.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0992r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f12189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12193e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12194g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12195h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f12196k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f12197l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(View view) {
        int iB;
        int size = this.f12196k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < size; i7++) {
            View view3 = ((AbstractC0974V) this.f12196k.get(i7)).f12032a;
            C0961H c0961h = (C0961H) view3.getLayoutParams();
            if (view3 != view && !c0961h.f11989a.h() && (iB = (c0961h.f11989a.b() - this.f12192d) * this.f12193e) >= 0 && iB < i) {
                view2 = view3;
                if (iB == 0) {
                    break;
                } else {
                    i = iB;
                }
            }
        }
        if (view2 == null) {
            this.f12192d = -1;
        } else {
            this.f12192d = ((C0961H) view2.getLayoutParams()).f11989a.b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final View b(C0966M c0966m) {
        List list = this.f12196k;
        if (list == null) {
            View view = c0966m.i(this.f12192d, Long.MAX_VALUE).f12032a;
            this.f12192d += this.f12193e;
            return view;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view2 = ((AbstractC0974V) this.f12196k.get(i)).f12032a;
            C0961H c0961h = (C0961H) view2.getLayoutParams();
            if (!c0961h.f11989a.h() && this.f12192d == c0961h.f11989a.b()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
