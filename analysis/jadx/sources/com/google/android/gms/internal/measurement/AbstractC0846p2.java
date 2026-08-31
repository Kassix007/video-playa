package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.p2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0846p2 implements Cloneable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AbstractC0851q2 f11011q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public AbstractC0851q2 f11012r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0846p2(AbstractC0851q2 abstractC0851q2) {
        this.f11011q = abstractC0851q2;
        if (abstractC0851q2.e()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f11012r = (AbstractC0851q2) abstractC0851q2.o(4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(int i, List list) {
        int size = list.size() - i;
        StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 26);
        sb.append("Element at index ");
        sb.append(size);
        sb.append(" is null.");
        String string = sb.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i) {
                throw new NullPointerException(string);
            }
            list.remove(size2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        if (this.f11012r.e()) {
            return;
        }
        AbstractC0851q2 abstractC0851q2 = (AbstractC0851q2) this.f11011q.o(4);
        P2.f10684c.a(abstractC0851q2.getClass()).c(abstractC0851q2, this.f11012r);
        this.f11012r = abstractC0851q2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final AbstractC0846p2 clone() {
        AbstractC0846p2 abstractC0846p2 = (AbstractC0846p2) this.f11011q.o(5);
        abstractC0846p2.f11012r = d();
        return abstractC0846p2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AbstractC0851q2 d() {
        if (!this.f11012r.e()) {
            return this.f11012r;
        }
        this.f11012r.g();
        return this.f11012r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AbstractC0851q2 e() {
        AbstractC0851q2 abstractC0851q2D = d();
        abstractC0851q2D.getClass();
        boolean zH = true;
        byte bByteValue = ((Byte) abstractC0851q2D.o(1)).byteValue();
        if (bByteValue != 1) {
            if (bByteValue == 0) {
                zH = false;
            } else {
                zH = P2.f10684c.a(abstractC0851q2D.getClass()).h(abstractC0851q2D);
                abstractC0851q2D.o(2);
            }
        }
        if (zH) {
            return abstractC0851q2D;
        }
        throw new C2.e("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(AbstractC0851q2 abstractC0851q2) {
        AbstractC0851q2 abstractC0851q22 = this.f11011q;
        if (abstractC0851q22.equals(abstractC0851q2)) {
            return;
        }
        if (!this.f11012r.e()) {
            AbstractC0851q2 abstractC0851q23 = (AbstractC0851q2) abstractC0851q22.o(4);
            P2.f10684c.a(abstractC0851q23.getClass()).c(abstractC0851q23, this.f11012r);
            this.f11012r = abstractC0851q23;
        }
        AbstractC0851q2 abstractC0851q24 = this.f11012r;
        P2.f10684c.a(abstractC0851q24.getClass()).c(abstractC0851q24, abstractC0851q2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(byte[] bArr, int i, C0811i2 c0811i2) throws C0895z2 {
        if (!this.f11012r.e()) {
            AbstractC0851q2 abstractC0851q2 = (AbstractC0851q2) this.f11011q.o(4);
            P2.f10684c.a(abstractC0851q2.getClass()).c(abstractC0851q2, this.f11012r);
            this.f11012r = abstractC0851q2;
        }
        try {
            S2 s2A = P2.f10684c.a(this.f11012r.getClass());
            AbstractC0851q2 abstractC0851q22 = this.f11012r;
            C0776b2 c0776b2 = new C0776b2();
            c0811i2.getClass();
            s2A.d(abstractC0851q22, bArr, 0, i, c0776b2);
        } catch (C0895z2 e7) {
            throw e7;
        } catch (IOException e8) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e8);
        } catch (IndexOutOfBoundsException unused) {
            throw new C0895z2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
