package P1;

import androidx.lifecycle.f0;
import androidx.lifecycle.h0;
import java.util.Arrays;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;

/* JADX INFO: loaded from: classes.dex */
public final class d implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f[] f5611a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d(f... initializers) {
        m.e(initializers, "initializers");
        this.f5611a = initializers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.h0
    public final f0 c(Class cls, e eVar) {
        f0 f0Var;
        f fVar;
        B5.c cVar;
        kotlin.jvm.internal.f fVarA = z.a(cls);
        f[] fVarArr = this.f5611a;
        f[] initializers = (f[]) Arrays.copyOf(fVarArr, fVarArr.length);
        m.e(initializers, "initializers");
        int length = initializers.length;
        int i = 0;
        while (true) {
            f0Var = null;
            if (i >= length) {
                fVar = null;
                break;
            }
            fVar = initializers[i];
            if (fVar.f5612a.equals(fVarA)) {
                break;
            }
            i++;
        }
        if (fVar != null && (cVar = fVar.f5613b) != null) {
            f0Var = (f0) cVar.invoke(eVar);
        }
        if (f0Var != null) {
            return f0Var;
        }
        throw new IllegalArgumentException(("No initializer set for given class " + fVarA.b()).toString());
    }
}
