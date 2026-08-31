package p3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class V extends X implements W, U {
    public List i = new ArrayList();
    public HashSet j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f15738k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public HashSet f15739l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public HashSet f15740m = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p3.U
    public final Set a() {
        return this.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p3.U
    public final void b(HashSet hashSet) {
        this.f15740m = hashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p3.U
    public final void c(String str) {
        this.f15738k = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p3.U
    public final void d(HashSet hashSet) {
        this.f15739l = hashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p3.W
    public final List f() {
        return this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p3.U
    public final Set h() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p3.U
    public final String i() {
        return this.f15738k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p3.W
    public void j(AbstractC1446a0 abstractC1446a0) {
        this.i.add(abstractC1446a0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p3.U
    public final void l(HashSet hashSet) {
        this.j = hashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p3.U
    public final Set m() {
        return this.f15739l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p3.U
    public final Set n() {
        return this.f15740m;
    }

    @Override // p3.U
    public final void e(HashSet hashSet) {
    }
}
