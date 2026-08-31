package g1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f13006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f13007d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f13030g);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f13006c = typedArrayObtainStyledAttributes.getFloat(index, this.f13006c);
            } else if (index == 0) {
                int i7 = typedArrayObtainStyledAttributes.getInt(index, this.f13004a);
                this.f13004a = i7;
                this.f13004a = n.f13019d[i7];
            } else if (index == 4) {
                this.f13005b = typedArrayObtainStyledAttributes.getInt(index, this.f13005b);
            } else if (index == 3) {
                this.f13007d = typedArrayObtainStyledAttributes.getFloat(index, this.f13007d);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
