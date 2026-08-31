.class public final LW4/c;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:LR4/k1;

.field public final synthetic r:LP/c0;

.field public final synthetic s:LP/W;

.field public final synthetic t:LP/W;


# direct methods
.method public constructor <init>(LR4/k1;LP/c0;LP/W;LP/W;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LW4/c;->q:LR4/k1;

    .line 2
    .line 3
    iput-object p2, p0, LW4/c;->r:LP/c0;

    .line 4
    .line 5
    iput-object p3, p0, LW4/c;->s:LP/W;

    .line 6
    .line 7
    iput-object p4, p0, LW4/c;->t:LP/W;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Ls5/i;-><init>(ILq5/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 6

    .line 1
    new-instance v0, LW4/c;

    .line 2
    .line 3
    iget-object v3, p0, LW4/c;->s:LP/W;

    .line 4
    .line 5
    iget-object v4, p0, LW4/c;->t:LP/W;

    .line 6
    .line 7
    iget-object v1, p0, LW4/c;->q:LR4/k1;

    .line 8
    .line 9
    iget-object v2, p0, LW4/c;->r:LP/c0;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, LW4/c;-><init>(LR4/k1;LP/c0;LP/W;LP/W;Lq5/c;)V

    .line 13
    .line 14
    .line 15
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
    invoke-virtual {p0, p1, p2}, LW4/c;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LW4/c;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LW4/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object v1, p0, LW4/c;->q:LR4/k1;

    .line 5
    .line 6
    iget-object p1, v1, LR4/k1;->d:LR4/i;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object v0, p1, LR4/i;->e:LR4/J2;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    :goto_0
    if-eqz v0, :cond_2

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    iget-object p1, p1, LR4/i;->e:LR4/J2;

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    iget-object p1, p1, LR4/J2;->a:Ljava/lang/Boolean;

    .line 23
    .line 24
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 25
    .line 26
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    const/4 p1, 0x0

    .line 32
    :goto_1
    if-eqz p1, :cond_2

    .line 33
    .line 34
    iget-object p1, v1, LR4/k1;->l:Lk5/b;

    .line 35
    .line 36
    if-eqz p1, :cond_2

    .line 37
    .line 38
    iget-object p1, p1, Lk5/b;->c:Landroidx/lifecycle/J;

    .line 39
    .line 40
    if-eqz p1, :cond_2

    .line 41
    .line 42
    iget-object v6, v1, LR4/k1;->b:Lcom/web2native/MainActivity;

    .line 43
    .line 44
    new-instance v0, LW1/e;

    .line 45
    .line 46
    const/4 v5, 0x1

    .line 47
    iget-object v2, p0, LW4/c;->r:LP/c0;

    .line 48
    .line 49
    iget-object v3, p0, LW4/c;->s:LP/W;

    .line 50
    .line 51
    iget-object v4, p0, LW4/c;->t:LP/W;

    .line 52
    .line 53
    invoke-direct/range {v0 .. v5}, LW1/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 54
    .line 55
    .line 56
    new-instance v1, LR4/N;

    .line 57
    .line 58
    const/4 v2, 0x6

    .line 59
    invoke-direct {v1, v0, v2}, LR4/N;-><init>(LB5/c;I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v6, v1}, Landroidx/lifecycle/G;->e(Landroidx/lifecycle/x;Landroidx/lifecycle/K;)V

    .line 63
    .line 64
    .line 65
    :cond_2
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 66
    .line 67
    return-object p1
.end method
