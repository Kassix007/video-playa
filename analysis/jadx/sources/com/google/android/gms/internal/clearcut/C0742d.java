package com.google.android.gms.internal.clearcut;

import android.util.Base64;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.gms.internal.clearcut.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0742d extends AbstractC0738b {
    public final Object i;
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public t0 f10498k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0742d(C0746f c0746f, String str, t0 t0Var) {
        super(c0746f, str, t0Var);
        this.i = new Object();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.clearcut.AbstractC0738b
    public final Object c(String str) {
        t0 t0Var;
        try {
            synchronized (this.i) {
                try {
                    if (!str.equals(this.j)) {
                        t0 t0VarG = t0.g(Base64.decode(str, 3));
                        this.j = str;
                        this.f10498k = t0VarG;
                    }
                    t0Var = this.f10498k;
                } finally {
                }
            }
            return t0Var;
        } catch (IOException | IllegalArgumentException unused) {
            String str2 = this.f10489b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + String.valueOf(str2).length() + 27);
            sb.append("Invalid byte[] value for ");
            sb.append(str2);
            sb.append(": ");
            sb.append(str);
            Log.e("PhenotypeFlag", sb.toString());
            return null;
        }
    }
}
