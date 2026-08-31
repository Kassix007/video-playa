.class public final Lv3/z;
.super Lv3/u;
.source "SourceFile"


# instance fields
.field public final b:Lcom/google/android/gms/internal/measurement/O1;

.field public final c:LS3/e;

.field public final d:Lv3/i;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/O1;LS3/e;Lr6/f;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, v0}, Lv3/B;-><init>(I)V

    .line 3
    .line 4
    .line 5
    iput-object p2, p0, Lv3/z;->c:LS3/e;

    .line 6
    .line 7
    iput-object p1, p0, Lv3/z;->b:Lcom/google/android/gms/internal/measurement/O1;

    .line 8
    .line 9
    iput-object p3, p0, Lv3/z;->d:Lv3/i;

    .line 10
    .line 11
    iget-boolean p1, p1, Lcom/google/android/gms/internal/measurement/O1;->a:Z

    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    const-string p2, "Best-effort write calls cannot pass methods that should auto-resolve missing features."

    .line 19
    .line 20
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lv3/z;->c:LS3/e;

    .line 2
    .line 3
    iget-object v1, p0, Lv3/z;->d:Lv3/i;

    .line 4
    .line 5
    invoke-interface {v1, p1}, Lv3/i;->getException(Lcom/google/android/gms/common/api/Status;)Ljava/lang/Exception;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {v0, p1}, LS3/e;->a(Ljava/lang/Exception;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final b(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lv3/z;->c:LS3/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LS3/e;->a(Ljava/lang/Exception;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final c(Lv3/o;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lv3/z;->c:LS3/e;

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Lv3/z;->b:Lcom/google/android/gms/internal/measurement/O1;

    .line 4
    .line 5
    iget-object p1, p1, Lv3/o;->d:Lu3/b;

    .line 6
    .line 7
    invoke-virtual {v1, p1, v0}, Lcom/google/android/gms/internal/measurement/O1;->c(Lu3/b;LS3/e;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :catch_0
    move-exception p1

    .line 12
    goto :goto_0

    .line 13
    :catch_1
    move-exception p1

    .line 14
    goto :goto_1

    .line 15
    :catch_2
    move-exception p1

    .line 16
    goto :goto_2

    .line 17
    :goto_0
    invoke-virtual {v0, p1}, LS3/e;->a(Ljava/lang/Exception;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :goto_1
    invoke-static {p1}, Lv3/B;->e(Landroid/os/RemoteException;)Lcom/google/android/gms/common/api/Status;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p0, p1}, Lv3/z;->a(Lcom/google/android/gms/common/api/Status;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :goto_2
    throw p1
.end method

.method public final d(Lv3/l;Z)V
    .locals 4

    .line 1
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget-object v0, p1, Lv3/l;->s:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/util/Map;

    .line 8
    .line 9
    iget-object v1, p0, Lv3/z;->c:LS3/e;

    .line 10
    .line 11
    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    iget-object p2, v1, LS3/e;->a:LS3/k;

    .line 15
    .line 16
    new-instance v0, LZ/m;

    .line 17
    .line 18
    const/16 v2, 0x1d

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-direct {v0, v2, p1, v1, v3}, LZ/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2, v0}, LS3/k;->e(LS3/a;)LS3/k;

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final f(Lv3/o;)Z
    .locals 0

    .line 1
    iget-object p1, p0, Lv3/z;->b:Lcom/google/android/gms/internal/measurement/O1;

    .line 2
    .line 3
    iget-boolean p1, p1, Lcom/google/android/gms/internal/measurement/O1;->a:Z

    .line 4
    .line 5
    return p1
.end method

.method public final g(Lv3/o;)[Lcom/google/android/gms/common/d;
    .locals 0

    .line 1
    iget-object p1, p0, Lv3/z;->b:Lcom/google/android/gms/internal/measurement/O1;

    .line 2
    .line 3
    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/O1;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, [Lcom/google/android/gms/common/d;

    .line 6
    .line 7
    return-object p1
.end method
