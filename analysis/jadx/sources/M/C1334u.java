package m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import g.AbstractC1066a;

/* JADX INFO: renamed from: m.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1334u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f14882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k3.c f14883b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1334u(TextView textView) {
        this.f14882a = textView;
        k3.c cVar = new k3.c();
        cVar.f14120q = new G1.g(textView);
        this.f14883b = cVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f14882a.getContext().obtainStyledAttributes(attributeSet, AbstractC1066a.i, i, 0);
        try {
            boolean z5 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            c(z5);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(boolean z5) {
        ((l6.d) this.f14883b.f14120q).C(z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(boolean z5) {
        ((l6.d) this.f14883b.f14120q).D(z5);
    }
}
