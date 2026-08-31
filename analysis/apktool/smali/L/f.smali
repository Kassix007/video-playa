.class public final LL/f;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:Ly/i;

.field public final synthetic t:LL/a;


# direct methods
.method public constructor <init>(Ly/i;LL/a;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LL/f;->s:Ly/i;

    .line 2
    .line 3
    iput-object p2, p0, LL/f;->t:LL/a;

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
    new-instance v0, LL/f;

    .line 2
    .line 3
    iget-object v1, p0, LL/f;->s:Ly/i;

    .line 4
    .line 5
    iget-object v2, p0, LL/f;->t:LL/a;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, LL/f;-><init>(Ly/i;LL/a;Lq5/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, LL/f;->r:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, LL/f;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LL/f;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LL/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, LL/f;->q:I

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
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1

    .line 22
    :cond_1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, LL/f;->r:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p1, LM5/w;

    .line 28
    .line 29
    iget-object v0, p0, LL/f;->s:Ly/i;

    .line 30
    .line 31
    iget-object v0, v0, Ly/i;->a:LP5/G;

    .line 32
    .line 33
    new-instance v2, LL/e;

    .line 34
    .line 35
    iget-object v3, p0, LL/f;->t:LL/a;

    .line 36
    .line 37
    const/4 v4, 0x0

    .line 38
    invoke-direct {v2, v4, v3, p1}, LL/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iput v1, p0, LL/f;->q:I

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-static {v0, v2, p0}, LP5/G;->h(LP5/G;LP5/i;Lq5/c;)V

    .line 47
    .line 48
    .line 49
    sget-object p1, Lr5/a;->q:Lr5/a;

    .line 50
    .line 51
    return-object p1
.end method
