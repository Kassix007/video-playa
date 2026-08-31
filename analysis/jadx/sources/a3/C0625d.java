package a3;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import j2.C1156b;
import j2.InterfaceC1157c;
import j2.InterfaceC1158d;

/* JADX INFO: renamed from: a3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0625d implements InterfaceC1157c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Context f8812q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [androidx.work.impl.WorkDatabase.Companion.create(android.content.Context, java.util.concurrent.Executor, androidx.work.Clock, boolean):androidx.work.impl.WorkDatabase] */
    public /* synthetic */ C0625d(Context context) {
        this.f8812q = context;
    }

    /* JADX DEBUG: Class process forced to load method for inline: androidx.work.impl.WorkDatabase.Companion.a(android.content.Context, j2.b):j2.d */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j2.InterfaceC1157c
    public InterfaceC1158d b(C1156b c1156b) {
        return WorkDatabase.Companion.create$lambda$0(this.f8812q, c1156b);
    }
}
