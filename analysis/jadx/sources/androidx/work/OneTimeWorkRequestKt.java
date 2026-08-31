package androidx.work;

import androidx.work.OneTimeWorkRequest;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class OneTimeWorkRequestKt {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final <W extends ListenableWorker> OneTimeWorkRequest.Builder OneTimeWorkRequestBuilder() {
        m.j();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final OneTimeWorkRequest.Builder setInputMerger(OneTimeWorkRequest.Builder builder, H5.c inputMerger) {
        m.e(builder, "<this>");
        m.e(inputMerger, "inputMerger");
        return builder.setInputMerger(AbstractC0836n2.s(inputMerger));
    }
}
