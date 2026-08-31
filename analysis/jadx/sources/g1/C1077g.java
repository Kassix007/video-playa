package g1;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: g1.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1077g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f12913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f12914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f12915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f12916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12917e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1077g(Context context, XmlResourceParser xmlResourceParser) {
        this.f12913a = Float.NaN;
        this.f12914b = Float.NaN;
        this.f12915c = Float.NaN;
        this.f12916d = Float.NaN;
        this.f12917e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.j);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f12917e);
                this.f12917e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new n().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f12916d = typedArrayObtainStyledAttributes.getDimension(index, this.f12916d);
            } else if (index == 2) {
                this.f12914b = typedArrayObtainStyledAttributes.getDimension(index, this.f12914b);
            } else if (index == 3) {
                this.f12915c = typedArrayObtainStyledAttributes.getDimension(index, this.f12915c);
            } else if (index == 4) {
                this.f12913a = typedArrayObtainStyledAttributes.getDimension(index, this.f12913a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
