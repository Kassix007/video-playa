package g1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import c1.AbstractC0729a;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    public static final SparseIntArray j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f13000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f13001e;
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13002g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f13003h;
    public int i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        j = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (j.get(index)) {
                case 1:
                    this.f13001e = typedArrayObtainStyledAttributes.getFloat(index, this.f13001e);
                    break;
                case 2:
                    this.f12999c = typedArrayObtainStyledAttributes.getInt(index, this.f12999c);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        String str = AbstractC0729a.f10112a[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f12997a = n.f(typedArrayObtainStyledAttributes, index, this.f12997a);
                    break;
                case 6:
                    this.f12998b = typedArrayObtainStyledAttributes.getInteger(index, this.f12998b);
                    break;
                case 7:
                    this.f13000d = typedArrayObtainStyledAttributes.getFloat(index, this.f13000d);
                    break;
                case 8:
                    this.f13002g = typedArrayObtainStyledAttributes.getInteger(index, this.f13002g);
                    break;
                case 9:
                    this.f = typedArrayObtainStyledAttributes.getFloat(index, this.f);
                    break;
                case 10:
                    int i7 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i7 == 1) {
                        this.i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    } else if (i7 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.f13003h = string;
                        if (string.indexOf("/") > 0) {
                            this.i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        }
                    } else {
                        typedArrayObtainStyledAttributes.getInteger(index, this.i);
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
