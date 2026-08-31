package g4;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import com.wnapp.smspariaz.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: g4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1087d extends D1.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Chip f13072q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1087d(Chip chip, Chip chip2) {
        super(chip2);
        this.f13072q = chip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // D1.a
    public final void l(ArrayList arrayList) {
        C1089f c1089f;
        arrayList.add(0);
        Rect rect = Chip.f11445M;
        Chip chip = this.f13072q;
        if (!chip.c() || (c1089f = chip.f11460u) == null || !c1089f.f13107a0 || chip.f11463x == null) {
            return;
        }
        arrayList.add(1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // D1.a
    public final void o(int i, x1.e eVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f18345a;
        if (i != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f11445M);
            return;
        }
        Chip chip = this.f13072q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
        eVar.b(x1.d.f18331e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }
}
