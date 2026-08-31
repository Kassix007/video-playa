package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import g.AbstractC1066a;

/* JADX INFO: loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f9054q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f9055r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1066a.f12802t);
        this.f9055r = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f9054q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
