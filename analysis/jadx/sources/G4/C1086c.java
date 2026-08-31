package g4;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* JADX INFO: renamed from: g4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1086c extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Chip f13071a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1086c(Chip chip) {
        this.f13071a = chip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        C1089f c1089f = this.f13071a.f11460u;
        if (c1089f != null) {
            c1089f.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
