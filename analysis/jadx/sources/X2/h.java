package x2;

import O3.D;
import android.webkit.MimeTypeMap;
import java.io.File;
import q5.InterfaceC1524c;
import q6.x;
import v2.EnumC1757e;

/* JADX INFO: loaded from: classes.dex */
public final class h implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f18359a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h(File file) {
        this.f18359a = file;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // x2.g
    public final Object a(InterfaceC1524c interfaceC1524c) {
        String str = x.f16093r;
        File file = this.f18359a;
        v2.k kVar = new v2.k(D.s(file), q6.l.f16071q, null, null);
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String name = file.getName();
        kotlin.jvm.internal.m.d(name, "getName(...)");
        return new m(kVar, singleton.getMimeTypeFromExtension(J5.m.i1('.', name, "")), EnumC1757e.f17526s);
    }
}
