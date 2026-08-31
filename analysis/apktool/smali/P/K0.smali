.class public final LP/K0;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:LB5/e;

.field public final synthetic t:LP/W;


# direct methods
.method public constructor <init>(LB5/e;LP/W;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LP/K0;->s:LB5/e;

    .line 2
    .line 3
    iput-object p2, p0, LP/K0;->t:LP/W;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Ls5/i;-><init>(ILq5/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 3

    .line 1
    new-instance v0, LP/K0;

    .line 2
    .line 3
    iget-object v1, p0, LP/K0;->s:LB5/e;

    .line 4
    .line 5
    iget-object v2, p0, LP/K0;->t:LP/W;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, LP/K0;-><init>(LB5/e;LP/W;Lq5/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, LP/K0;->r:Ljava/lang/Object;

    .line 11
    .line 12
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
    invoke-virtual {p0, p1, p2}, LP/K0;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LP/K0;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LP/K0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, LP/K0;->q:I

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
    iget-object p1, p0, LP/K0;->r:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p1, LM5/w;

    .line 26
    .line 27
    new-instance v0, LP/k0;

    .line 28
    .line 29
    iget-object v2, p0, LP/K0;->t:LP/W;

    .line 30
    .line 31
    invoke-interface {p1}, LM5/w;->d()Lq5/h;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-direct {v0, v2, p1}, LP/k0;-><init>(LP/W;Lq5/h;)V

    .line 36
    .line 37
    .line 38
    iput v1, p0, LP/K0;->q:I

    .line 39
    .line 40
    iget-object p1, p0, LP/K0;->s:LB5/e;

    .line 41
    .line 42
    invoke-interface {p1, v0, p0}, LB5/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 47
    .line 48
    if-ne p1, v0, :cond_2

    .line 49
    .line 50
    return-object v0

    .line 51
    :cond_2
    :goto_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 52
    .line 53
    return-object p1
.end method
