package p3;

import android.graphics.Matrix;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: p3.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1478y extends X implements InterfaceC1444A, U {
    public HashSet i = null;
    public String j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public HashSet f15868k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public HashSet f15869l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public HashSet f15870m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Matrix f15871n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p3.U
    public final Set a() {
        return this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p3.U
    public final void b(HashSet hashSet) {
        this.f15870m = hashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p3.U
    public final void c(String str) {
        this.j = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p3.U
    public final void d(HashSet hashSet) {
        this.f15869l = hashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p3.U
    public final void e(HashSet hashSet) {
        this.f15868k = hashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p3.InterfaceC1444A
    public final void g(Matrix matrix) {
        this.f15871n = matrix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p3.U
    public final Set h() {
        return this.f15868k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p3.U
    public final String i() {
        return this.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p3.U
    public final void l(HashSet hashSet) {
        this.i = hashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p3.U
    public final Set m() {
        return this.f15869l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p3.U
    public final Set n() {
        return this.f15870m;
    }
}
