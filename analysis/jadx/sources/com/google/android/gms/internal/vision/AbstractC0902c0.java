package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.clearcut.C0751j;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0902c0 implements Cloneable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AbstractC0906e0 f11262q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public AbstractC0906e0 f11263r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f11264s = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0902c0(AbstractC0906e0 abstractC0906e0) {
        this.f11262q = abstractC0906e0;
        this.f11263r = (AbstractC0906e0) abstractC0906e0.e(4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(AbstractC0906e0 abstractC0906e0, AbstractC0906e0 abstractC0906e02) {
        I0 i02 = I0.f11178c;
        i02.getClass();
        i02.a(abstractC0906e0.getClass()).d(abstractC0906e0, abstractC0906e02);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(AbstractC0906e0 abstractC0906e0) {
        if (this.f11264s) {
            d();
            this.f11264s = false;
        }
        b(this.f11263r, abstractC0906e0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(byte[] bArr, int i, U u6) throws C0922m0 {
        if (this.f11264s) {
            d();
            this.f11264s = false;
        }
        try {
            I0 i02 = I0.f11178c;
            AbstractC0906e0 abstractC0906e0 = this.f11263r;
            i02.getClass();
            L0 l0A = i02.a(abstractC0906e0.getClass());
            AbstractC0906e0 abstractC0906e02 = this.f11263r;
            C0751j c0751j = new C0751j();
            u6.getClass();
            l0A.e(abstractC0906e02, bArr, 0, i, c0751j);
        } catch (C0922m0 e7) {
            throw e7;
        } catch (IOException e8) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e8);
        } catch (IndexOutOfBoundsException unused) {
            throw C0922m0.a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ Object clone() {
        AbstractC0902c0 abstractC0902c0 = (AbstractC0902c0) this.f11262q.e(5);
        abstractC0902c0.a(e());
        return abstractC0902c0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        AbstractC0906e0 abstractC0906e0 = (AbstractC0906e0) this.f11263r.e(4);
        b(abstractC0906e0, this.f11263r);
        this.f11263r = abstractC0906e0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AbstractC0906e0 e() {
        if (this.f11264s) {
            return this.f11263r;
        }
        AbstractC0906e0 abstractC0906e0 = this.f11263r;
        I0 i02 = I0.f11178c;
        i02.getClass();
        i02.a(abstractC0906e0.getClass()).a(abstractC0906e0);
        this.f11264s = true;
        return this.f11263r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AbstractC0906e0 f() {
        AbstractC0906e0 abstractC0906e0E = e();
        boolean zC = true;
        byte bByteValue = ((Byte) abstractC0906e0E.e(1)).byteValue();
        if (bByteValue != 1) {
            if (bByteValue == 0) {
                zC = false;
            } else {
                I0 i02 = I0.f11178c;
                i02.getClass();
                zC = i02.a(abstractC0906e0E.getClass()).c(abstractC0906e0E);
                abstractC0906e0E.e(2);
            }
        }
        if (zC) {
            return abstractC0906e0E;
        }
        throw new C2.e("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}
