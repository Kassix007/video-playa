package E0;

import C0.U;
import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import com.google.android.gms.internal.measurement.P1;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f1613b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c(ContentCaptureSession contentCaptureSession, View view) {
        this.f1612a = contentCaptureSession;
        this.f1613b = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AutofillId a(long j) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession contentCaptureSessionG = A3.a.g(this.f1612a);
        a aVarB = P1.B(this.f1613b);
        Objects.requireNonNull(aVarB);
        return b.b(contentCaptureSessionG, U.h(aVarB.f1611a), j);
    }
}
