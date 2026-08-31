package q2;

import android.view.ViewGroup;
import com.wnapp.smspariaz.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import r.C1554e;

/* JADX INFO: renamed from: q2.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1513r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1496a f15996a = new C1496a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f15997b = new ThreadLocal();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayList f15998c = new ArrayList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(ViewGroup viewGroup, AbstractC1509n abstractC1509n) {
        ArrayList arrayList = f15998c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (abstractC1509n == null) {
            abstractC1509n = f15996a;
        }
        AbstractC1509n abstractC1509nClone = abstractC1509n.clone();
        ArrayList arrayList2 = (ArrayList) b().get(viewGroup);
        if (arrayList2 != null && arrayList2.size() > 0) {
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                ((AbstractC1509n) obj).w(viewGroup);
            }
        }
        abstractC1509nClone.h(viewGroup, true);
        if (viewGroup.getTag(R.id.transition_current_scene) != null) {
            throw new ClassCastException();
        }
        viewGroup.setTag(R.id.transition_current_scene, null);
        ViewTreeObserverOnPreDrawListenerC1512q viewTreeObserverOnPreDrawListenerC1512q = new ViewTreeObserverOnPreDrawListenerC1512q();
        viewTreeObserverOnPreDrawListenerC1512q.f15994q = abstractC1509nClone;
        viewTreeObserverOnPreDrawListenerC1512q.f15995r = viewGroup;
        viewGroup.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC1512q);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1512q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C1554e b() {
        C1554e c1554e;
        ThreadLocal threadLocal = f15997b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (c1554e = (C1554e) weakReference.get()) != null) {
            return c1554e;
        }
        C1554e c1554e2 = new C1554e(0);
        threadLocal.set(new WeakReference(c1554e2));
        return c1554e2;
    }
}
