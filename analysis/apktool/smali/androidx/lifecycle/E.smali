.class public final Landroidx/lifecycle/E;
.super Landroidx/lifecycle/F;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/v;


# instance fields
.field public final u:Landroidx/lifecycle/x;

.field public final synthetic v:Landroidx/lifecycle/G;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/G;Landroidx/lifecycle/x;Landroidx/lifecycle/K;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/lifecycle/E;->v:Landroidx/lifecycle/G;

    .line 2
    .line 3
    invoke-direct {p0, p1, p3}, Landroidx/lifecycle/F;-><init>(Landroidx/lifecycle/G;Landroidx/lifecycle/K;)V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Landroidx/lifecycle/E;->u:Landroidx/lifecycle/x;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final e(Landroidx/lifecycle/x;Landroidx/lifecycle/o;)V
    .locals 2

    .line 1
    iget-object p1, p0, Landroidx/lifecycle/E;->u:Landroidx/lifecycle/x;

    .line 2
    .line 3
    invoke-interface {p1}, Landroidx/lifecycle/x;->getLifecycle()Landroidx/lifecycle/q;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {p2}, Landroidx/lifecycle/q;->b()Landroidx/lifecycle/p;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    sget-object v0, Landroidx/lifecycle/p;->q:Landroidx/lifecycle/p;

    .line 12
    .line 13
    if-ne p2, v0, :cond_0

    .line 14
    .line 15
    iget-object p1, p0, Landroidx/lifecycle/E;->v:Landroidx/lifecycle/G;

    .line 16
    .line 17
    iget-object p2, p0, Landroidx/lifecycle/F;->q:Landroidx/lifecycle/K;

    .line 18
    .line 19
    invoke-virtual {p1, p2}, Landroidx/lifecycle/G;->j(Landroidx/lifecycle/K;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    :goto_0
    if-eq v0, p2, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0}, Landroidx/lifecycle/E;->i()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-virtual {p0, v0}, Landroidx/lifecycle/F;->d(Z)V

    .line 31
    .line 32
    .line 33
    invoke-interface {p1}, Landroidx/lifecycle/x;->getLifecycle()Landroidx/lifecycle/q;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Landroidx/lifecycle/q;->b()Landroidx/lifecycle/p;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    move-object v1, v0

    .line 42
    move-object v0, p2

    .line 43
    move-object p2, v1

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    return-void
.end method

.method public final g()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/E;->u:Landroidx/lifecycle/x;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/lifecycle/x;->getLifecycle()Landroidx/lifecycle/q;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p0}, Landroidx/lifecycle/q;->c(Landroidx/lifecycle/w;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final h(Landroidx/lifecycle/x;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/E;->u:Landroidx/lifecycle/x;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    return p1

    .line 7
    :cond_0
    const/4 p1, 0x0

    .line 8
    return p1
.end method

.method public final i()Z
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/E;->u:Landroidx/lifecycle/x;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/lifecycle/x;->getLifecycle()Landroidx/lifecycle/q;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroidx/lifecycle/q;->b()Landroidx/lifecycle/p;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, Landroidx/lifecycle/p;->t:Landroidx/lifecycle/p;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-ltz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    return v0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    return v0
.end method
