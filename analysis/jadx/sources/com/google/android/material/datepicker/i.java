package com.google.android.material.datepicker;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import com.wnapp.smspariaz.R;
import w1.C1839b;

/* JADX INFO: loaded from: classes.dex */
public final class i extends C1839b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f11490e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ i(int i, Object obj) {
        this.f11489d = i;
        this.f11490e = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.C1839b
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f11489d) {
            case 2:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f11490e).f11559t);
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.C1839b
    public final void d(View view, x1.e eVar) {
        int i = this.f11489d;
        Object obj = this.f11490e;
        View.AccessibilityDelegate accessibilityDelegate = this.f18187a;
        switch (i) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, eVar.f18345a);
                l lVar = (l) obj;
                eVar.l(lVar.f11506v0.getVisibility() == 0 ? lVar.C().getResources().getString(R.string.mtrl_picker_toggle_to_year_selection) : lVar.C().getResources().getString(R.string.mtrl_picker_toggle_to_day_selection));
                break;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, eVar.f18345a);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i7 = MaterialButtonToggleGroup.f11431A;
                int i8 = -1;
                if (view instanceof MaterialButton) {
                    int i9 = 0;
                    int i10 = 0;
                    while (true) {
                        if (i9 < materialButtonToggleGroup.getChildCount()) {
                            if (materialButtonToggleGroup.getChildAt(i9) == view) {
                                i8 = i10;
                            } else {
                                if ((materialButtonToggleGroup.getChildAt(i9) instanceof MaterialButton) && materialButtonToggleGroup.c(i9)) {
                                    i10++;
                                }
                                i9++;
                            }
                        }
                    }
                }
                eVar.k(E0.a.a(((MaterialButton) view).f11421E, 0, 1, i8, 1));
                break;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo = eVar.f18345a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f11560u);
                accessibilityNodeInfo.setChecked(checkableImageButton.f11559t);
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo2 = eVar.f18345a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCheckable(((NavigationMenuItemView) obj).f11565N);
                break;
        }
    }
}
