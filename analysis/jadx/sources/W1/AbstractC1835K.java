package w1;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import com.wnapp.smspariaz.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.C1332t;

/* JADX INFO: renamed from: w1.K, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1835K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static WeakHashMap f18149a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Field f18150b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f18151c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f18152d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1859w f18153e = new C1859w();
    public static final ViewTreeObserverOnGlobalLayoutListenerC1861y f = new ViewTreeObserverOnGlobalLayoutListenerC1861y();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static O a(View view) {
        if (f18149a == null) {
            f18149a = new WeakHashMap();
        }
        O o6 = (O) f18149a.get(view);
        if (o6 != null) {
            return o6;
        }
        O o7 = new O(view);
        f18149a.put(view, o7);
        return o7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(View view, o0 o0Var) {
        int i = Build.VERSION.SDK_INT;
        WindowInsets windowInsetsF = o0Var.f();
        if (windowInsetsF != null) {
            WindowInsets windowInsetsA = i >= 30 ? AbstractC1832H.a(view, windowInsetsF) : AbstractC1862z.a(view, windowInsetsF);
            if (windowInsetsA.equals(windowInsetsF)) {
                return;
            }
            o0.g(view, windowInsetsA);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = C1834J.f18145d;
        C1834J c1834j = (C1834J) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (c1834j == null) {
            c1834j = new C1834J();
            c1834j.f18146a = null;
            c1834j.f18147b = null;
            c1834j.f18148c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, c1834j);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = c1834j.f18146a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = C1834J.f18145d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (c1834j.f18146a == null) {
                            c1834j.f18146a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = C1834J.f18145d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                c1834j.f18146a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    c1834j.f18146a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View viewA = c1834j.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                if (c1834j.f18147b == null) {
                    c1834j.f18147b = new SparseArray();
                }
                c1834j.f18147b.put(keyCode, new WeakReference(viewA));
            }
        }
        return viewA != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC1831G.a(view);
        }
        if (f18151c) {
            return null;
        }
        if (f18150b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f18150b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f18151c = true;
                return null;
            }
        }
        try {
            Object obj = f18150b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f18151c = true;
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static CharSequence e(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = AbstractC1830F.a(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ArrayList f(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String[] g(C1332t c1332t) {
        return Build.VERSION.SDK_INT >= 31 ? AbstractC1833I.a(c1332t) : (String[]) c1332t.getTag(R.id.tag_on_receive_content_mime_types);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void h(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z5 = e(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z5) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z5 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z5) {
                    accessibilityEventObtain.getText().add(e(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e7) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e7);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(e(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    public static C1843f i(View view, C1843f c1843f) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c1843f + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC1833I.b(view, c1843f);
        }
        A1.n nVar = (A1.n) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC1851n interfaceC1851n = f18153e;
        if (nVar == null) {
            if (view instanceof InterfaceC1851n) {
                interfaceC1851n = (InterfaceC1851n) view;
            }
            return interfaceC1851n.a(c1843f);
        }
        C1843f c1843fA = A1.n.a(view, c1843f);
        if (c1843fA == null) {
            return null;
        }
        if (view instanceof InterfaceC1851n) {
            interfaceC1851n = (InterfaceC1851n) view;
        }
        return interfaceC1851n.a(c1843fA);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void j(View view, int i) {
        ArrayList arrayListF = f(view);
        for (int i7 = 0; i7 < arrayListF.size(); i7++) {
            if (((x1.d) arrayListF.get(i7)).a() == i) {
                arrayListF.remove(i7);
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void k(View view, x1.d dVar, x1.o oVar) {
        x1.d dVar2 = new x1.d(null, dVar.f18341b, null, oVar, dVar.f18342c);
        View.AccessibilityDelegate accessibilityDelegateD = d(view);
        C1839b c1839b = accessibilityDelegateD == null ? null : accessibilityDelegateD instanceof C1838a ? ((C1838a) accessibilityDelegateD).f18180a : new C1839b(accessibilityDelegateD);
        if (c1839b == null) {
            c1839b = new C1839b();
        }
        m(view, c1839b);
        j(view, dVar2.a());
        f(view).add(dVar2);
        h(view, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void l(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC1831G.b(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void m(View view, C1839b c1839b) {
        if (c1839b == null && (d(view) instanceof C1838a)) {
            c1839b = new C1839b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c1839b == null ? null : c1839b.f18188b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void n(View view, CharSequence charSequence) {
        new C1860x(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).f(view, charSequence);
        ViewTreeObserverOnGlobalLayoutListenerC1861y viewTreeObserverOnGlobalLayoutListenerC1861y = f;
        if (charSequence == null) {
            viewTreeObserverOnGlobalLayoutListenerC1861y.f18249q.remove(view);
            view.removeOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC1861y);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1861y);
        } else {
            viewTreeObserverOnGlobalLayoutListenerC1861y.f18249q.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC1861y);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1861y);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void o(View view, Q q7) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(q7 != null ? new W(q7) : null);
            return;
        }
        PathInterpolator pathInterpolator = U.f18167e;
        View.OnApplyWindowInsetsListener t6 = q7 != null ? new T(view, q7) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, t6);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(t6);
        }
    }
}
