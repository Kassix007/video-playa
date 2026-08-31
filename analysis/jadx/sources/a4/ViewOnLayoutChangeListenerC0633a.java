package a4;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import b4.C0699a;

/* JADX INFO: renamed from: a4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC0633a implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8933b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ViewOnLayoutChangeListenerC0633a(int i, Object obj) {
        this.f8932a = i;
        this.f8933b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        Y3.a aVar;
        switch (this.f8932a) {
            case 0:
                throw null;
            default:
                C0699a c0699a = (C0699a) this.f8933b;
                ImageView imageView = c0699a.f15212D;
                if (imageView.getVisibility() != 0 || (aVar = c0699a.f15230V) == null) {
                    return;
                }
                Rect rect = new Rect();
                imageView.getDrawingRect(rect);
                aVar.setBounds(rect);
                aVar.h(imageView, null);
                return;
        }
    }
}
