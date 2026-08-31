.class public final Lx3/G;
.super Lx3/u;
.source "SourceFile"


# instance fields
.field public final synthetic g:Lx3/e;


# direct methods
.method public constructor <init>(Lx3/e;ILandroid/os/Bundle;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lx3/G;->g:Lx3/e;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2, p3}, Lx3/u;-><init>(Lx3/e;ILandroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lx3/G;->g:Lx3/e;

    .line 2
    .line 3
    iget-object v0, v0, Lx3/e;->z:Lx3/d;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lx3/d;->c(Lcom/google/android/gms/common/b;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final b()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lx3/G;->g:Lx3/e;

    .line 2
    .line 3
    iget-object v0, v0, Lx3/e;->z:Lx3/d;

    .line 4
    .line 5
    sget-object v1, Lcom/google/android/gms/common/b;->u:Lcom/google/android/gms/common/b;

    .line 6
    .line 7
    invoke-interface {v0, v1}, Lx3/d;->c(Lcom/google/android/gms/common/b;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    return v0
.end method
