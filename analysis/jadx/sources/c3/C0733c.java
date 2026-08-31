package c3;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: renamed from: c3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0733c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f10129a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0733c(int i) {
        switch (i) {
            case 1:
                this.f10129a = new ArrayList(20);
                break;
            default:
                this.f10129a = new ArrayList();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a(String name, String value) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(value, "value");
        ArrayList arrayList = this.f10129a;
        arrayList.add(name);
        arrayList.add(J5.m.n1(value).toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b(String name, String value) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(value, "value");
        if (name.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = name.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = name.charAt(i);
            if ('!' > cCharAt || cCharAt >= 127) {
                throw new IllegalArgumentException(e6.b.f("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), name).toString());
            }
        }
        a(name, value);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void c(Path path) {
        ArrayList arrayList = this.f10129a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            u uVar = (u) arrayList.get(size);
            Matrix matrix = n3.i.f15199a;
            if (uVar != null && !uVar.f10232a) {
                n3.i.a(path, uVar.f10235d.l() / 100.0f, uVar.f10236e.l() / 100.0f, uVar.f.l() / 360.0f);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d6.l d() {
        return new d6.l((String[]) this.f10129a.toArray(new String[0]));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void e(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f10129a;
            if (i >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }
}
