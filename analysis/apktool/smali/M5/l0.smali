.class public final LM5/l0;
.super Lq5/a;
.source "SourceFile"

# interfaces
.implements LM5/b0;


# static fields
.field public static final q:LM5/l0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LM5/l0;

    .line 2
    .line 3
    sget-object v1, LM5/t;->r:LM5/t;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lq5/a;-><init>(Lq5/g;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, LM5/l0;->q:LM5/l0;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final G(LB5/c;)LM5/J;
    .locals 0

    .line 1
    sget-object p1, LM5/m0;->q:LM5/m0;

    .line 2
    .line 3
    return-object p1
.end method

.method public final M(LM5/i0;)LM5/k;
    .locals 0

    .line 1
    sget-object p1, LM5/m0;->q:LM5/m0;

    .line 2
    .line 3
    return-object p1
.end method

.method public final a(Ljava/util/concurrent/CancellationException;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final b()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final c(ZZLC0/s;)LM5/J;
    .locals 0

    .line 1
    sget-object p1, LM5/m0;->q:LM5/m0;

    .line 2
    .line 3
    return-object p1
.end method

.method public final f(Ls5/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "This job is always active"

    .line 4
    .line 5
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public final isCancelled()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final start()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "NonCancellable"

    .line 2
    .line 3
    return-object v0
.end method

.method public final v()Ljava/util/concurrent/CancellationException;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v1, "This job is always active"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method
