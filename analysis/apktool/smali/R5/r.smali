.class public LR5/r;
.super LM5/a;
.source "SourceFile"

# interfaces
.implements Ls5/d;


# instance fields
.field public final t:Lq5/c;


# direct methods
.method public constructor <init>(Lq5/c;Lq5/h;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p2, v0}, LM5/a;-><init>(Lq5/h;Z)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, LR5/r;->t:Lq5/c;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final L()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public e0()V
    .locals 0

    .line 1
    return-void
.end method

.method public final getCallerFrame()Ls5/d;
    .locals 2

    .line 1
    iget-object v0, p0, LR5/r;->t:Lq5/c;

    .line 2
    .line 3
    instance-of v1, v0, Ls5/d;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ls5/d;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public m(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, LR5/r;->t:Lq5/c;

    .line 2
    .line 3
    invoke-static {v0}, Ln5/A;->v(Lq5/c;)Lq5/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p1}, LM5/y;->v(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1, v0}, LR5/b;->h(Ljava/lang/Object;Lq5/c;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public p(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, LR5/r;->t:Lq5/c;

    .line 2
    .line 3
    invoke-static {p1}, LM5/y;->v(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Lq5/c;->resumeWith(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
