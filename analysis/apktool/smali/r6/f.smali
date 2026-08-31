.class public final Lr6/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv3/i;
.implements Lw1/q;


# direct methods
.method public static final a(Lq6/x;)Z
    .locals 2

    .line 1
    sget-object v0, Lr6/g;->v:Lq6/x;

    .line 2
    .line 3
    invoke-virtual {p0}, Lq6/x;->b()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string v0, ".class"

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-static {p0, v0, v1}, LJ5/t;->A0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    xor-int/2addr p0, v1

    .line 15
    return p0
.end method


# virtual methods
.method public getException(Lcom/google/android/gms/common/api/Status;)Ljava/lang/Exception;
    .locals 1

    .line 1
    iget-object v0, p1, Lcom/google/android/gms/common/api/Status;->s:Landroid/app/PendingIntent;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, LA4/a;

    .line 6
    .line 7
    invoke-direct {v0, p1}, Lcom/google/android/gms/common/g;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 8
    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    new-instance v0, Lcom/google/android/gms/common/g;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Lcom/google/android/gms/common/g;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public onScrollLimit(IIIZ)V
    .locals 0

    .line 1
    return-void
.end method

.method public onScrollProgress(IIII)V
    .locals 0

    .line 1
    return-void
.end method
