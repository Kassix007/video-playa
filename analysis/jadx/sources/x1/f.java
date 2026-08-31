package x1;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import i1.C1134a;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f extends AccessibilityNodeProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1134a f18348a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f(C1134a c1134a) {
        this.f18348a = c1134a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        e eVarS = this.f18348a.s(i);
        if (eVarS == null) {
            return null;
        }
        return eVarS.f18345a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.f18348a.getClass();
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        e eVarT = this.f18348a.t(i);
        if (eVarT == null) {
            return null;
        }
        return eVarT.f18345a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i7, Bundle bundle) {
        return this.f18348a.x(i, i7, bundle);
    }
}
