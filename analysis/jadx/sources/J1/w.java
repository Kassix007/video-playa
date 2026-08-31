package J1;

import C0.k1;
import E.c0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import h.AbstractActivityC1106h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class w implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final H f2744q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public w(H h4) {
        this.f2744q = h4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q;
        N nF;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        H h4 = this.f2744q;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, h4);
        }
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q2 = null;
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, I1.a.f2330a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = AbstractComponentCallbacksC0185q.class.isAssignableFrom(B.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185qA = resourceId != -1 ? h4.A(resourceId) : null;
                    if (abstractComponentCallbacksC0185qA == null && string != null) {
                        c0 c0Var = h4.f2527c;
                        ArrayList arrayList = (ArrayList) c0Var.f1552q;
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size < 0) {
                                abstractComponentCallbacksC0185q = abstractComponentCallbacksC0185q2;
                                Iterator it = ((HashMap) c0Var.f1553r).values().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        abstractComponentCallbacksC0185qA = abstractComponentCallbacksC0185q;
                                        break;
                                    }
                                    N n7 = (N) it.next();
                                    if (n7 != null) {
                                        abstractComponentCallbacksC0185qA = n7.f2578c;
                                        if (string.equals(abstractComponentCallbacksC0185qA.f2696N)) {
                                            break;
                                        }
                                    }
                                }
                            } else {
                                AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q3 = (AbstractComponentCallbacksC0185q) arrayList.get(size);
                                abstractComponentCallbacksC0185q = abstractComponentCallbacksC0185q2;
                                if (abstractComponentCallbacksC0185q3 != null && string.equals(abstractComponentCallbacksC0185q3.f2696N)) {
                                    abstractComponentCallbacksC0185qA = abstractComponentCallbacksC0185q3;
                                    break;
                                }
                                size--;
                                abstractComponentCallbacksC0185q2 = abstractComponentCallbacksC0185q;
                            }
                        }
                    } else {
                        abstractComponentCallbacksC0185q = null;
                    }
                    if (abstractComponentCallbacksC0185qA == null && id != -1) {
                        abstractComponentCallbacksC0185qA = h4.A(id);
                    }
                    if (abstractComponentCallbacksC0185qA == null) {
                        B bC = h4.C();
                        context.getClassLoader();
                        abstractComponentCallbacksC0185qA = bC.a(attributeValue);
                        abstractComponentCallbacksC0185qA.f2685C = true;
                        abstractComponentCallbacksC0185qA.f2694L = resourceId != 0 ? resourceId : id;
                        abstractComponentCallbacksC0185qA.f2695M = id;
                        abstractComponentCallbacksC0185qA.f2696N = string;
                        abstractComponentCallbacksC0185qA.f2686D = true;
                        abstractComponentCallbacksC0185qA.f2690H = h4;
                        C0188u c0188u = h4.f2541t;
                        abstractComponentCallbacksC0185qA.f2691I = c0188u;
                        AbstractActivityC1106h abstractActivityC1106h = c0188u.f2735u;
                        abstractComponentCallbacksC0185qA.f2701S = true;
                        if ((c0188u == null ? abstractComponentCallbacksC0185q : c0188u.f2734t) != null) {
                            abstractComponentCallbacksC0185qA.f2701S = true;
                        }
                        nF = h4.a(abstractComponentCallbacksC0185qA);
                        if (H.F(2)) {
                            Log.v("FragmentManager", "Fragment " + abstractComponentCallbacksC0185qA + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (abstractComponentCallbacksC0185qA.f2686D) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        abstractComponentCallbacksC0185qA.f2686D = true;
                        abstractComponentCallbacksC0185qA.f2690H = h4;
                        C0188u c0188u2 = h4.f2541t;
                        abstractComponentCallbacksC0185qA.f2691I = c0188u2;
                        AbstractActivityC1106h abstractActivityC1106h2 = c0188u2.f2735u;
                        abstractComponentCallbacksC0185qA.f2701S = true;
                        if ((c0188u2 == null ? abstractComponentCallbacksC0185q : c0188u2.f2734t) != null) {
                            abstractComponentCallbacksC0185qA.f2701S = true;
                        }
                        nF = h4.f(abstractComponentCallbacksC0185qA);
                        if (H.F(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + abstractComponentCallbacksC0185qA + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    K1.c cVar = K1.d.f2857a;
                    K1.d.b(new K1.a(abstractComponentCallbacksC0185qA, "Attempting to use <fragment> tag to add fragment " + abstractComponentCallbacksC0185qA + " to container " + viewGroup));
                    K1.d.a(abstractComponentCallbacksC0185qA).getClass();
                    abstractComponentCallbacksC0185qA.f2702T = viewGroup;
                    nF.k();
                    nF.j();
                    View view2 = abstractComponentCallbacksC0185qA.f2703U;
                    if (view2 == null) {
                        throw new IllegalStateException(C0.S.n("Fragment ", attributeValue, " did not create a view."));
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (abstractComponentCallbacksC0185qA.f2703U.getTag() == null) {
                        abstractComponentCallbacksC0185qA.f2703U.setTag(string);
                    }
                    abstractComponentCallbacksC0185qA.f2703U.addOnAttachStateChangeListener(new k1(this, nF));
                    return abstractComponentCallbacksC0185qA.f2703U;
                }
            }
        }
        return null;
    }
}
