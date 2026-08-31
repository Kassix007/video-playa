package r2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class m extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f16329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ColorStateList f16330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f16331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16332e;
    public Bitmap f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f16333g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f16334h;
    public int i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f16335k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Paint f16336l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f16328a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new o(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new o(this);
    }
}
