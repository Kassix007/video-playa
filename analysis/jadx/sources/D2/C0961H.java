package d2;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: renamed from: d2.H, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0961H extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractC0974V f11989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f11990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11992d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0961H(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11990b = new Rect();
        this.f11991c = true;
        this.f11992d = false;
    }

    public C0961H(int i, int i7) {
        super(i, i7);
        this.f11990b = new Rect();
        this.f11991c = true;
        this.f11992d = false;
    }

    public C0961H(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f11990b = new Rect();
        this.f11991c = true;
        this.f11992d = false;
    }

    public C0961H(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f11990b = new Rect();
        this.f11991c = true;
        this.f11992d = false;
    }

    public C0961H(C0961H c0961h) {
        super((ViewGroup.LayoutParams) c0961h);
        this.f11990b = new Rect();
        this.f11991c = true;
        this.f11992d = false;
    }
}
