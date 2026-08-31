.class public final LP/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP/w0;


# instance fields
.field public final q:LM5/w;


# direct methods
.method public constructor <init>(LM5/w;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LP/x;->q:LM5/w;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b()V
    .locals 0

    .line 1
    return-void
.end method

.method public final c()V
    .locals 3

    .line 1
    iget-object v0, p0, LP/x;->q:LM5/w;

    .line 2
    .line 3
    instance-of v1, v0, LP/y0;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, LP/y0;

    .line 8
    .line 9
    invoke-virtual {v0}, LP/y0;->a()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    new-instance v1, LP/H;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v1, v2}, LP/H;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1}, LM5/y;->e(LM5/w;Ljava/util/concurrent/CancellationException;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final e()V
    .locals 3

    .line 1
    iget-object v0, p0, LP/x;->q:LM5/w;

    .line 2
    .line 3
    instance-of v1, v0, LP/y0;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, LP/y0;

    .line 8
    .line 9
    invoke-virtual {v0}, LP/y0;->a()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    new-instance v1, LP/H;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v1, v2}, LP/H;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1}, LM5/y;->e(LM5/w;Ljava/util/concurrent/CancellationException;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method
