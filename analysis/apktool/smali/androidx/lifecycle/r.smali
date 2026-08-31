.class public final Landroidx/lifecycle/r;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public synthetic q:Ljava/lang/Object;

.field public final synthetic r:Landroidx/lifecycle/s;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/s;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/lifecycle/r;->r:Landroidx/lifecycle/s;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Ls5/i;-><init>(ILq5/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 2

    .line 1
    new-instance v0, Landroidx/lifecycle/r;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/lifecycle/r;->r:Landroidx/lifecycle/s;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Landroidx/lifecycle/r;-><init>(Landroidx/lifecycle/s;Lq5/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Landroidx/lifecycle/r;->q:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LM5/w;

    .line 2
    .line 3
    check-cast p2, Lq5/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Landroidx/lifecycle/r;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Landroidx/lifecycle/r;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Landroidx/lifecycle/r;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Landroidx/lifecycle/r;->q:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p1, LM5/w;

    .line 7
    .line 8
    iget-object v0, p0, Landroidx/lifecycle/r;->r:Landroidx/lifecycle/s;

    .line 9
    .line 10
    iget-object v1, v0, Landroidx/lifecycle/s;->q:Landroidx/lifecycle/q;

    .line 11
    .line 12
    invoke-virtual {v1}, Landroidx/lifecycle/q;->b()Landroidx/lifecycle/p;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    sget-object v3, Landroidx/lifecycle/p;->r:Landroidx/lifecycle/p;

    .line 17
    .line 18
    invoke-virtual {v2, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-ltz v2, :cond_0

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Landroidx/lifecycle/q;->a(Landroidx/lifecycle/w;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-interface {p1}, LM5/w;->d()Lq5/h;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-static {p1, v0}, LM5/y;->f(Lq5/h;Ljava/util/concurrent/CancellationException;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 37
    .line 38
    return-object p1
.end method
