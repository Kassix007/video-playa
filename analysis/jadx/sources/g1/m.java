package g1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f13008n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f13009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f13010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f13011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f13012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f13013e;
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f13014g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13015h;
    public float i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f13016k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f13017l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f13018m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f13008n = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.i);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (f13008n.get(index)) {
                case 1:
                    this.f13009a = typedArrayObtainStyledAttributes.getFloat(index, this.f13009a);
                    break;
                case 2:
                    this.f13010b = typedArrayObtainStyledAttributes.getFloat(index, this.f13010b);
                    break;
                case 3:
                    this.f13011c = typedArrayObtainStyledAttributes.getFloat(index, this.f13011c);
                    break;
                case 4:
                    this.f13012d = typedArrayObtainStyledAttributes.getFloat(index, this.f13012d);
                    break;
                case 5:
                    this.f13013e = typedArrayObtainStyledAttributes.getFloat(index, this.f13013e);
                    break;
                case 6:
                    this.f = typedArrayObtainStyledAttributes.getDimension(index, this.f);
                    break;
                case 7:
                    this.f13014g = typedArrayObtainStyledAttributes.getDimension(index, this.f13014g);
                    break;
                case 8:
                    this.i = typedArrayObtainStyledAttributes.getDimension(index, this.i);
                    break;
                case 9:
                    this.j = typedArrayObtainStyledAttributes.getDimension(index, this.j);
                    break;
                case 10:
                    this.f13016k = typedArrayObtainStyledAttributes.getDimension(index, this.f13016k);
                    break;
                case 11:
                    this.f13017l = true;
                    this.f13018m = typedArrayObtainStyledAttributes.getDimension(index, this.f13018m);
                    break;
                case 12:
                    this.f13015h = n.f(typedArrayObtainStyledAttributes, index, this.f13015h);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
