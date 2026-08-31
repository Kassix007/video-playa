package w1;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class l0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o0 f18226b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f18227a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = Build.VERSION.SDK_INT;
        f18226b = (i >= 34 ? new d0() : i >= 30 ? new c0() : i >= 29 ? new b0() : new a0()).b().f18232a.a().f18232a.b().f18232a.c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public l0(o0 o0Var) {
        this.f18227a = o0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public o0 a() {
        return this.f18227a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public o0 b() {
        return this.f18227a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public o0 c() {
        return this.f18227a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return p() == l0Var.p() && o() == l0Var.o() && Objects.equals(l(), l0Var.l()) && Objects.equals(j(), l0Var.j()) && Objects.equals(f(), l0Var.f());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1845h f() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public n1.b g(int i) {
        return n1.b.f15124e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public n1.b h(int i) {
        if ((i & 8) == 0) {
            return n1.b.f15124e;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return Objects.hash(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public n1.b i() {
        return l();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public n1.b j() {
        return n1.b.f15124e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public n1.b k() {
        return l();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public n1.b l() {
        return n1.b.f15124e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public n1.b m() {
        return l();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public o0 n(int i, int i7, int i8, int i9) {
        return f18226b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean o() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean p() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean q(int i) {
        return true;
    }

    public void d(View view) {
    }

    public void e(o0 o0Var) {
    }

    public void r(n1.b[] bVarArr) {
    }

    public void s(n1.b bVar) {
    }

    public void t(o0 o0Var) {
    }

    public void u(n1.b bVar) {
    }

    public void v(int i) {
    }
}
