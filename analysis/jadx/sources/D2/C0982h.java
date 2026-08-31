package d2;

import M.C0231t;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: d2.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0982h extends AbstractC0957D {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f12120s;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f12121g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f12122h;
    public ArrayList i;
    public ArrayList j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f12123k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f12124l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f12125m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f12126n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f12127o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f12128p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f12129q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList f12130r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((AbstractC0974V) arrayList.get(size)).f12032a.animate().cancel();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0957D
    public final boolean a(AbstractC0974V abstractC0974V, AbstractC0974V abstractC0974V2, C0231t c0231t, C0231t c0231t2) {
        int i;
        int i7;
        int i8 = c0231t.f3616a;
        int i9 = c0231t.f3617b;
        if (abstractC0974V2.o()) {
            int i10 = c0231t.f3616a;
            i7 = c0231t.f3617b;
            i = i10;
        } else {
            i = c0231t2.f3616a;
            i7 = c0231t2.f3617b;
        }
        if (abstractC0974V == abstractC0974V2) {
            return g(abstractC0974V, i8, i9, i, i7);
        }
        View view = abstractC0974V.f12032a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(abstractC0974V);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = abstractC0974V2.f12032a;
        l(abstractC0974V2);
        view2.setTranslationX(-((int) ((i - i8) - translationX)));
        view2.setTranslationY(-((int) ((i7 - i9) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.f12123k;
        C0980f c0980f = new C0980f();
        c0980f.f12106a = abstractC0974V;
        c0980f.f12107b = abstractC0974V2;
        c0980f.f12108c = i8;
        c0980f.f12109d = i9;
        c0980f.f12110e = i;
        c0980f.f = i7;
        arrayList.add(c0980f);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0017 */
    @Override // d2.AbstractC0957D
    public final void d(AbstractC0974V abstractC0974V) {
        ArrayList arrayList = this.f12124l;
        ArrayList arrayList2 = this.f12125m;
        ArrayList arrayList3 = this.f12126n;
        View view = abstractC0974V.f12032a;
        view.animate().cancel();
        ArrayList arrayList4 = this.j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C0981g) arrayList4.get(size)).f12111a == abstractC0974V) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(abstractC0974V);
                arrayList4.remove(size);
            }
        }
        j(this.f12123k, abstractC0974V);
        if (this.f12122h.remove(abstractC0974V)) {
            view.setAlpha(1.0f);
            c(abstractC0974V);
        }
        if (this.i.remove(abstractC0974V)) {
            view.setAlpha(1.0f);
            c(abstractC0974V);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            j(arrayList5, abstractC0974V);
            if (arrayList5.isEmpty()) {
                arrayList3.remove(size2);
            }
        }
        for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList6 = (ArrayList) arrayList2.get(size3);
            int size4 = arrayList6.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((C0981g) arrayList6.get(size4)).f12111a == abstractC0974V) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(abstractC0974V);
                    arrayList6.remove(size4);
                    if (arrayList6.isEmpty()) {
                        arrayList2.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList.get(size5);
            if (arrayList7.remove(abstractC0974V)) {
                view.setAlpha(1.0f);
                c(abstractC0974V);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.f12129q.remove(abstractC0974V);
        this.f12127o.remove(abstractC0974V);
        this.f12130r.remove(abstractC0974V);
        this.f12128p.remove(abstractC0974V);
        i();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:10:0x004f */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0014 */
    @Override // d2.AbstractC0957D
    public final void e() {
        ArrayList arrayList = this.f12126n;
        ArrayList arrayList2 = this.f12124l;
        ArrayList arrayList3 = this.f12125m;
        ArrayList arrayList4 = this.f12123k;
        ArrayList arrayList5 = this.i;
        ArrayList arrayList6 = this.f12122h;
        ArrayList arrayList7 = this.j;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0981g c0981g = (C0981g) arrayList7.get(size);
            View view = c0981g.f12111a.f12032a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(c0981g.f12111a);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            c((AbstractC0974V) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            AbstractC0974V abstractC0974V = (AbstractC0974V) arrayList5.get(size3);
            abstractC0974V.f12032a.setAlpha(1.0f);
            c(abstractC0974V);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C0980f c0980f = (C0980f) arrayList4.get(size4);
            AbstractC0974V abstractC0974V2 = c0980f.f12106a;
            if (abstractC0974V2 != null) {
                k(c0980f, abstractC0974V2);
            }
            AbstractC0974V abstractC0974V3 = c0980f.f12107b;
            if (abstractC0974V3 != null) {
                k(c0980f, abstractC0974V3);
            }
        }
        arrayList4.clear();
        if (f()) {
            for (int size5 = arrayList3.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList3.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    C0981g c0981g2 = (C0981g) arrayList8.get(size6);
                    View view2 = c0981g2.f12111a.f12032a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(c0981g2.f12111a);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList3.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList2.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList2.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    AbstractC0974V abstractC0974V4 = (AbstractC0974V) arrayList9.get(size8);
                    abstractC0974V4.f12032a.setAlpha(1.0f);
                    c(abstractC0974V4);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList2.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C0980f c0980f2 = (C0980f) arrayList10.get(size10);
                    AbstractC0974V abstractC0974V5 = c0980f2.f12106a;
                    if (abstractC0974V5 != null) {
                        k(c0980f2, abstractC0974V5);
                    }
                    AbstractC0974V abstractC0974V6 = c0980f2.f12107b;
                    if (abstractC0974V6 != null) {
                        k(c0980f2, abstractC0974V6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList.remove(arrayList10);
                    }
                }
            }
            h(this.f12129q);
            h(this.f12128p);
            h(this.f12127o);
            h(this.f12130r);
            ArrayList arrayList11 = this.f11969b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0957D
    public final boolean f() {
        return (this.i.isEmpty() && this.f12123k.isEmpty() && this.j.isEmpty() && this.f12122h.isEmpty() && this.f12128p.isEmpty() && this.f12129q.isEmpty() && this.f12127o.isEmpty() && this.f12130r.isEmpty() && this.f12125m.isEmpty() && this.f12124l.isEmpty() && this.f12126n.isEmpty()) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean g(AbstractC0974V abstractC0974V, int i, int i7, int i8, int i9) {
        View view = abstractC0974V.f12032a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i7 + ((int) abstractC0974V.f12032a.getTranslationY());
        l(abstractC0974V);
        int i10 = i8 - translationX;
        int i11 = i9 - translationY;
        if (i10 == 0 && i11 == 0) {
            c(abstractC0974V);
            return false;
        }
        if (i10 != 0) {
            view.setTranslationX(-i10);
        }
        if (i11 != 0) {
            view.setTranslationY(-i11);
        }
        ArrayList arrayList = this.j;
        C0981g c0981g = new C0981g();
        c0981g.f12111a = abstractC0974V;
        c0981g.f12112b = translationX;
        c0981g.f12113c = translationY;
        c0981g.f12114d = i8;
        c0981g.f12115e = i9;
        arrayList.add(c0981g);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.f11969b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(ArrayList arrayList, AbstractC0974V abstractC0974V) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0980f c0980f = (C0980f) arrayList.get(size);
            if (k(c0980f, abstractC0974V) && c0980f.f12106a == null && c0980f.f12107b == null) {
                arrayList.remove(c0980f);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean k(C0980f c0980f, AbstractC0974V abstractC0974V) {
        if (c0980f.f12107b == abstractC0974V) {
            c0980f.f12107b = null;
        } else {
            if (c0980f.f12106a != abstractC0974V) {
                return false;
            }
            c0980f.f12106a = null;
        }
        View view = abstractC0974V.f12032a;
        View view2 = abstractC0974V.f12032a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        c(abstractC0974V);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l(AbstractC0974V abstractC0974V) {
        if (f12120s == null) {
            f12120s = new ValueAnimator().getInterpolator();
        }
        abstractC0974V.f12032a.animate().setInterpolator(f12120s);
        d(abstractC0974V);
    }
}
