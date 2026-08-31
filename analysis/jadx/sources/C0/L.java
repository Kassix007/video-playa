package C0;

import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class L implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f888b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ L(int i, Object obj) {
        this.f887a = i;
        this.f888b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f887a) {
            case 0:
                int iCompare = ((Comparator) this.f888b).compare(obj, obj2);
                if (iCompare != 0) {
                    return iCompare;
                }
                return B0.L.f247h0.compare(((I0.m) obj).f2267c, ((I0.m) obj2).f2267c);
            case 1:
                int iCompare2 = ((L) this.f888b).compare(obj, obj2);
                return iCompare2 != 0 ? iCompare2 : AbstractC0836n2.h(Integer.valueOf(((I0.m) obj).f2270g), Integer.valueOf(((I0.m) obj2).f2270g));
            default:
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.f888b;
                int iCompareTo = Boolean.valueOf(materialButton.f11421E).compareTo(Boolean.valueOf(materialButton2.f11421E));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                return iCompareTo2 != 0 ? iCompareTo2 : Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton2)));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public L(Comparator comparator) {
        this.f887a = 0;
        this.f888b = comparator;
    }
}
