package com.google.android.gms.internal.clearcut;

import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.internal.clearcut.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0740c extends AbstractC0738b {
    public final /* synthetic */ int i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0740c(C0746f c0746f, String str, Object obj, int i) {
        super(c0746f, str, obj);
        this.i = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.clearcut.AbstractC0738b
    public final /* synthetic */ Object c(String str) {
        switch (this.i) {
            case 0:
                if (E0.f10408c.matcher(str).matches()) {
                    return Boolean.TRUE;
                }
                if (E0.f10409d.matcher(str).matches()) {
                    return Boolean.FALSE;
                }
                String str2 = this.f10489b;
                StringBuilder sb = new StringBuilder(str.length() + String.valueOf(str2).length() + 28);
                sb.append("Invalid boolean value for ");
                sb.append(str2);
                sb.append(": ");
                sb.append(str);
                Log.e("PhenotypeFlag", sb.toString());
                return null;
            default:
                return str;
        }
    }
}
