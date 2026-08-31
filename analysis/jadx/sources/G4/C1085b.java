package g4;

import android.graphics.Typeface;
import com.google.android.gms.internal.measurement.K1;
import com.google.android.material.chip.Chip;
import l4.C1240j;
import l4.InterfaceC1239i;

/* JADX INFO: renamed from: g4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1085b extends K1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13070d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1085b(int i, Object obj) {
        this.f13069c = i;
        this.f13070d = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.K1
    public final void A(int i) {
        switch (this.f13069c) {
            case 0:
                break;
            default:
                C1240j c1240j = (C1240j) this.f13070d;
                c1240j.f14575e = true;
                InterfaceC1239i interfaceC1239i = (InterfaceC1239i) c1240j.f.get();
                if (interfaceC1239i != null) {
                    interfaceC1239i.a();
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.K1
    public final void B(Typeface typeface, boolean z5) {
        switch (this.f13069c) {
            case 0:
                Chip chip = (Chip) this.f13070d;
                C1089f c1089f = chip.f11460u;
                chip.setText(c1089f.f13098S0 ? c1089f.f13100U : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z5) {
                    C1240j c1240j = (C1240j) this.f13070d;
                    c1240j.f14575e = true;
                    InterfaceC1239i interfaceC1239i = (InterfaceC1239i) c1240j.f.get();
                    if (interfaceC1239i != null) {
                        interfaceC1239i.a();
                    }
                    break;
                }
                break;
        }
    }

    private final void Q(int i) {
    }
}
