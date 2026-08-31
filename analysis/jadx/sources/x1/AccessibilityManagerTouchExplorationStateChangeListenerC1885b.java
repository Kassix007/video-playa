package x1;

import R4.L0;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import com.google.android.gms.internal.measurement.I1;
import com.google.android.material.internal.CheckableImageButton;
import java.util.WeakHashMap;
import w1.AbstractC1835K;

/* JADX INFO: renamed from: x1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class AccessibilityManagerTouchExplorationStateChangeListenerC1885b implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L0 f18330a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AccessibilityManagerTouchExplorationStateChangeListenerC1885b(L0 l02) {
        this.f18330a = l02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AccessibilityManagerTouchExplorationStateChangeListenerC1885b) {
            return this.f18330a.equals(((AccessibilityManagerTouchExplorationStateChangeListenerC1885b) obj).f18330a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f18330a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z5) {
        v4.j jVar = (v4.j) this.f18330a.f6790r;
        AutoCompleteTextView autoCompleteTextView = jVar.f17631h;
        if (autoCompleteTextView == null || I1.q0(autoCompleteTextView)) {
            return;
        }
        CheckableImageButton checkableImageButton = jVar.f17667d;
        int i = z5 ? 2 : 1;
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        checkableImageButton.setImportantForAccessibility(i);
    }
}
