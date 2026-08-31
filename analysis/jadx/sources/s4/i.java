package s4;

import java.util.ArrayList;
import o3.C1416b;
import y4.AbstractC1918b;

/* JADX INFO: loaded from: classes.dex */
public final class i extends AbstractC1918b {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // y4.AbstractC1918b
    public final void r(C1416b c1416b, float f, float f7) {
        c1416b.d(f7 * f, 180.0f, 90.0f);
        float f8 = f7 * 2.0f * f;
        q qVar = new q(0.0f, 0.0f, f8, f8);
        qVar.f = 180.0f;
        qVar.f16555g = 90.0f;
        ((ArrayList) c1416b.f).add(qVar);
        o oVar = new o(qVar);
        c1416b.a(180.0f);
        ((ArrayList) c1416b.f15430g).add(oVar);
        c1416b.f15428d = 270.0f;
        float f9 = (0.0f + f8) * 0.5f;
        float f10 = (f8 - 0.0f) / 2.0f;
        double d5 = 270.0f;
        c1416b.f15426b = (((float) Math.cos(Math.toRadians(d5))) * f10) + f9;
        c1416b.f15427c = (f10 * ((float) Math.sin(Math.toRadians(d5)))) + f9;
    }
}
