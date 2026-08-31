package d0;

import C0.A;
import C0.S;
import C0.U;
import I0.n;
import android.graphics.Rect;
import android.view.autofill.AutofillId;
import com.google.android.gms.internal.measurement.P1;
import r.w;

/* JADX INFO: loaded from: classes.dex */
public final class b extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k3.d f11785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f11786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A f11787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J0.a f11788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f11789e;
    public final AutofillId f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w f11790g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f11791h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b(k3.d dVar, n nVar, A a7, J0.a aVar, String str) {
        this.f11785a = dVar;
        this.f11786b = nVar;
        this.f11787c = a7;
        this.f11788d = aVar;
        this.f11789e = str;
        new Rect();
        a7.setImportantForAutofill(1);
        E0.a aVarB = P1.B(a7);
        AutofillId autofillIdH = aVarB != null ? U.h(aVarB.f1611a) : null;
        if (autofillIdH == null) {
            throw S.i("Required value was null.");
        }
        this.f = autofillIdH;
        this.f11790g = new w();
    }
}
