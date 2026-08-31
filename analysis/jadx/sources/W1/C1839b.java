package w1;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.wnapp.smspariaz.R;
import i1.C1134a;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: w1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1839b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f18186c = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f18187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1838a f18188b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1839b() {
        this(f18186c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f18187a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1134a b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f18187a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C1134a(17, accessibilityNodeProvider);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f18187a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void d(View view, x1.e eVar) {
        this.f18187a.onInitializeAccessibilityNodeInfo(view, eVar.f18345a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f18187a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f18187a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean g(View view, int i, Bundle bundle) {
        boolean zPerformAccessibilityAction;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z5 = false;
        int i7 = 0;
        while (true) {
            if (i7 >= list.size()) {
                break;
            }
            x1.d dVar = (x1.d) list.get(i7);
            if (dVar.a() == i) {
                Class cls = dVar.f18342c;
                x1.o oVar = dVar.f18343d;
                if (oVar != null) {
                    if (cls != null) {
                        try {
                            if (cls.getDeclaredConstructor(null).newInstance(null) == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        } catch (Exception e7) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e7);
                        }
                    }
                    zPerformAccessibilityAction = oVar.a(view);
                }
            } else {
                i7++;
            }
        }
        zPerformAccessibilityAction = false;
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f18187a.performAccessibilityAction(view, i, bundle);
        }
        if (zPerformAccessibilityAction || i != R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i8 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i8)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i9 = 0;
            while (true) {
                if (clickableSpanArr == null || i9 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i9])) {
                    clickableSpan.onClick(view);
                    z5 = true;
                    break;
                }
                i9++;
            }
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void h(View view, int i) {
        this.f18187a.sendAccessibilityEvent(view, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f18187a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C1839b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f18187a = accessibilityDelegate;
        this.f18188b = new C1838a(this);
    }
}
