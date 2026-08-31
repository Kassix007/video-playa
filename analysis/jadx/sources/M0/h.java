package M0;

import android.text.Layout;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Layout.Alignment f3705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Layout.Alignment f3706b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Layout.Alignment[] alignmentArrValues = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : alignmentArrValues) {
            if (m.a(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (m.a(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f3705a = alignment;
        f3706b = alignment2;
    }
}
