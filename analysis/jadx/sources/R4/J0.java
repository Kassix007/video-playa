package R4;

import U4.C0539f;
import U4.C0548o;
import java.io.UnsupportedEncodingException;
import m5.InterfaceC1366e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class J0 implements androidx.lifecycle.K, kotlin.jvm.internal.h {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f6777q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ B5.c f6778r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ J0(B5.c cVar, int i) {
        this.f6777q = i;
        this.f6778r = cVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // kotlin.jvm.internal.h
    public final InterfaceC1366e a() {
        switch (this.f6777q) {
            case 0:
                return (N5.d) this.f6778r;
            case 1:
                return (C0539f) this.f6778r;
            case 2:
                return (C0548o) this.f6778r;
            case 3:
                return (C0548o) this.f6778r;
            case 4:
                return (C0548o) this.f6778r;
            case 5:
                return (Z4.G) this.f6778r;
            default:
                return (C0539f) this.f6778r;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        switch (this.f6777q) {
            case 0:
                if ((obj instanceof androidx.lifecycle.K) && (obj instanceof kotlin.jvm.internal.h)) {
                    return ((N5.d) this.f6778r).equals(((kotlin.jvm.internal.h) obj).a());
                }
                return false;
            case 1:
                if ((obj instanceof androidx.lifecycle.K) && (obj instanceof kotlin.jvm.internal.h)) {
                    return ((C0539f) this.f6778r).equals(((kotlin.jvm.internal.h) obj).a());
                }
                return false;
            case 2:
                if ((obj instanceof androidx.lifecycle.K) && (obj instanceof kotlin.jvm.internal.h)) {
                    return ((C0548o) this.f6778r).equals(((kotlin.jvm.internal.h) obj).a());
                }
                return false;
            case 3:
                if ((obj instanceof androidx.lifecycle.K) && (obj instanceof kotlin.jvm.internal.h)) {
                    return ((C0548o) this.f6778r).equals(((kotlin.jvm.internal.h) obj).a());
                }
                return false;
            case 4:
                if ((obj instanceof androidx.lifecycle.K) && (obj instanceof kotlin.jvm.internal.h)) {
                    return ((C0548o) this.f6778r).equals(((kotlin.jvm.internal.h) obj).a());
                }
                return false;
            case 5:
                if ((obj instanceof androidx.lifecycle.K) && (obj instanceof kotlin.jvm.internal.h)) {
                    return ((Z4.G) this.f6778r).equals(((kotlin.jvm.internal.h) obj).a());
                }
                return false;
            default:
                if ((obj instanceof androidx.lifecycle.K) && (obj instanceof kotlin.jvm.internal.h)) {
                    return ((C0539f) this.f6778r).equals(((kotlin.jvm.internal.h) obj).a());
                }
                return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        switch (this.f6777q) {
            case 0:
                return ((N5.d) this.f6778r).hashCode();
            case 1:
                return ((C0539f) this.f6778r).hashCode();
            case 2:
                return ((C0548o) this.f6778r).hashCode();
            case 3:
                return ((C0548o) this.f6778r).hashCode();
            case 4:
                return ((C0548o) this.f6778r).hashCode();
            case 5:
                return ((Z4.G) this.f6778r).hashCode();
            default:
                return ((C0539f) this.f6778r).hashCode();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.K
    public final void onChanged(Object obj) throws UnsupportedEncodingException {
        switch (this.f6777q) {
            case 0:
                ((N5.d) this.f6778r).invoke(obj);
                break;
            case 1:
                ((C0539f) this.f6778r).invoke(obj);
                break;
            case 2:
                ((C0548o) this.f6778r).invoke(obj);
                break;
            case 3:
                ((C0548o) this.f6778r).invoke(obj);
                break;
            case 4:
                ((C0548o) this.f6778r).invoke(obj);
                break;
            case 5:
                break;
            default:
                ((C0539f) this.f6778r).invoke(obj);
                break;
        }
    }
}
