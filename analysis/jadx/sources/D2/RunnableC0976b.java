package d2;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* JADX INFO: renamed from: d2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0976b implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f12063q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ArrayList f12064r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0982h f12065s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0976b(C0982h c0982h, ArrayList arrayList, int i) {
        this.f12063q = i;
        this.f12065s = c0982h;
        this.f12064r = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12063q) {
            case 0:
                ArrayList arrayList = this.f12064r;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    C0982h c0982h = this.f12065s;
                    if (i >= size) {
                        arrayList.clear();
                        c0982h.f12125m.remove(arrayList);
                    } else {
                        Object obj = arrayList.get(i);
                        i++;
                        C0981g c0981g = (C0981g) obj;
                        AbstractC0974V abstractC0974V = c0981g.f12111a;
                        int i7 = c0981g.f12112b;
                        int i8 = c0981g.f12113c;
                        int i9 = c0981g.f12114d;
                        int i10 = c0981g.f12115e;
                        c0982h.getClass();
                        View view = abstractC0974V.f12032a;
                        int i11 = i9 - i7;
                        int i12 = i10 - i8;
                        if (i11 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i12 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        c0982h.f12128p.add(abstractC0974V);
                        viewPropertyAnimatorAnimate.setDuration(c0982h.f11972e).setListener(new C0978d(c0982h, abstractC0974V, i11, view, i12, viewPropertyAnimatorAnimate)).start();
                    }
                    break;
                }
                break;
            case 1:
                ArrayList arrayList2 = this.f12064r;
                int size2 = arrayList2.size();
                int i13 = 0;
                while (true) {
                    C0982h c0982h2 = this.f12065s;
                    if (i13 >= size2) {
                        arrayList2.clear();
                        c0982h2.f12126n.remove(arrayList2);
                        break;
                    } else {
                        Object obj2 = arrayList2.get(i13);
                        i13++;
                        C0980f c0980f = (C0980f) obj2;
                        ArrayList arrayList3 = c0982h2.f12130r;
                        long j = c0982h2.f;
                        AbstractC0974V abstractC0974V2 = c0980f.f12106a;
                        View view2 = abstractC0974V2 == null ? null : abstractC0974V2.f12032a;
                        AbstractC0974V abstractC0974V3 = c0980f.f12107b;
                        View view3 = abstractC0974V3 != null ? abstractC0974V3.f12032a : null;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j);
                            arrayList3.add(c0980f.f12106a);
                            duration.translationX(c0980f.f12110e - c0980f.f12108c);
                            duration.translationY(c0980f.f - c0980f.f12109d);
                            duration.alpha(0.0f).setListener(new C0979e(c0982h2, c0980f, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                            arrayList3.add(c0980f.f12107b);
                            viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new C0979e(c0982h2, c0980f, viewPropertyAnimatorAnimate2, view3, 1)).start();
                        }
                    }
                }
                break;
            default:
                ArrayList arrayList4 = this.f12064r;
                int size3 = arrayList4.size();
                int i14 = 0;
                while (true) {
                    C0982h c0982h3 = this.f12065s;
                    if (i14 >= size3) {
                        arrayList4.clear();
                        c0982h3.f12124l.remove(arrayList4);
                    } else {
                        Object obj3 = arrayList4.get(i14);
                        i14++;
                        AbstractC0974V abstractC0974V4 = (AbstractC0974V) obj3;
                        c0982h3.getClass();
                        View view4 = abstractC0974V4.f12032a;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                        c0982h3.f12127o.add(abstractC0974V4);
                        viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(c0982h3.f11970c).setListener(new C0977c(c0982h3, abstractC0974V4, view4, viewPropertyAnimatorAnimate3)).start();
                    }
                    break;
                }
                break;
        }
    }
}
