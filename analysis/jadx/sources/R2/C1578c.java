package r2;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import r.C1554e;

/* JADX INFO: renamed from: r2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1578c extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f16285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AnimatorSet f16286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f16287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1554e f16288d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
