.class public final Lw/n;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public final synthetic r:Lp3/z0;

.field public final synthetic s:Lv/W;

.field public final synthetic t:LB5/e;


# direct methods
.method public constructor <init>(Lp3/z0;Lv/W;LB5/e;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw/n;->r:Lp3/z0;

    .line 2
    .line 3
    iput-object p2, p0, Lw/n;->s:Lv/W;

    .line 4
    .line 5
    iput-object p3, p0, Lw/n;->t:LB5/e;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Ls5/i;-><init>(ILq5/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 3

    .line 1
    new-instance p1, Lw/n;

    .line 2
    .line 3
    iget-object v0, p0, Lw/n;->s:Lv/W;

    .line 4
    .line 5
    iget-object v1, p0, Lw/n;->t:LB5/e;

    .line 6
    .line 7
    iget-object v2, p0, Lw/n;->r:Lp3/z0;

    .line 8
    .line 9
    invoke-direct {p1, v2, v0, v1, p2}, Lw/n;-><init>(Lp3/z0;Lv/W;LB5/e;Lq5/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
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
    invoke-virtual {p0, p1, p2}, Lw/n;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lw/n;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lw/n;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lw/n;->q:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 15
    .line 16
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p1

    .line 20
    :cond_1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lw/n;->r:Lp3/z0;

    .line 24
    .line 25
    iget-object v0, p1, Lp3/z0;->c:Ljava/lang/Object;

    .line 26
    .line 27
    move-object v4, v0

    .line 28
    check-cast v4, Lv/a0;

    .line 29
    .line 30
    iget-object v0, p1, Lp3/z0;->b:Ljava/lang/Object;

    .line 31
    .line 32
    move-object v6, v0

    .line 33
    check-cast v6, LF/E;

    .line 34
    .line 35
    new-instance v5, Lw/m;

    .line 36
    .line 37
    iget-object v0, p0, Lw/n;->t:LB5/e;

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    invoke-direct {v5, p1, v0, v2}, Lw/m;-><init>(Lp3/z0;LB5/e;Lq5/c;)V

    .line 41
    .line 42
    .line 43
    iput v1, p0, Lw/n;->q:I

    .line 44
    .line 45
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    new-instance v2, Lv/Z;

    .line 49
    .line 50
    const/4 v7, 0x0

    .line 51
    iget-object v3, p0, Lw/n;->s:Lv/W;

    .line 52
    .line 53
    invoke-direct/range {v2 .. v7}, Lv/Z;-><init>(Lv/W;Lv/a0;Lw/m;LF/E;Lq5/c;)V

    .line 54
    .line 55
    .line 56
    invoke-static {v2, p0}, LM5/y;->g(LB5/e;Lq5/c;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 61
    .line 62
    if-ne p1, v0, :cond_2

    .line 63
    .line 64
    return-object v0

    .line 65
    :cond_2
    :goto_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 66
    .line 67
    return-object p1
.end method
