package v4;

import com.google.android.gms.internal.measurement.K1;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: loaded from: classes.dex */
public final class e extends n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f17623e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(m mVar, int i) {
        super(mVar);
        this.f17623e = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v4.n
    public void r() {
        switch (this.f17623e) {
            case 0:
                m mVar = this.f17665b;
                mVar.f17646E = null;
                CheckableImageButton checkableImageButton = mVar.f17660w;
                checkableImageButton.setOnLongClickListener(null);
                K1.L(checkableImageButton, null);
                break;
        }
    }
}
