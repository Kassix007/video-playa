.class public final LQ5/n;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:LQ5/o;

.field public final synthetic t:LP5/i;


# direct methods
.method public constructor <init>(LQ5/o;LP5/i;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LQ5/n;->s:LQ5/o;

    .line 2
    .line 3
    iput-object p2, p0, LQ5/n;->t:LP5/i;

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
    new-instance v0, LQ5/n;

    .line 2
    .line 3
    iget-object v1, p0, LQ5/n;->s:LQ5/o;

    .line 4
    .line 5
    iget-object v2, p0, LQ5/n;->t:LP5/i;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, LQ5/n;-><init>(LQ5/o;LP5/i;Lq5/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, LQ5/n;->r:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, LQ5/n;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LQ5/n;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LQ5/n;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v0, p0, LQ5/n;->q:I

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
    iget-object p1, p0, LQ5/n;->r:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v4, p1

    .line 26
    check-cast v4, LM5/w;

    .line 27
    .line 28
    new-instance v3, Lkotlin/jvm/internal/y;

    .line 29
    .line 30
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    iget-object v5, p0, LQ5/n;->s:LQ5/o;

    .line 34
    .line 35
    iget-object p1, v5, LQ5/i;->t:LP5/h;

    .line 36
    .line 37
    new-instance v2, LQ5/m;

    .line 38
    .line 39
    iget-object v6, p0, LQ5/n;->t:LP5/i;

    .line 40
    .line 41
    const/4 v7, 0x0

    .line 42
    invoke-direct/range {v2 .. v7}, LQ5/m;-><init>(Ljava/io/Serializable;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 43
    .line 44
    .line 45
    iput v1, p0, LQ5/n;->q:I

    .line 46
    .line 47
    invoke-interface {p1, v2, p0}, LP5/h;->collect(LP5/i;Lq5/c;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 52
    .line 53
    if-ne p1, v0, :cond_2

    .line 54
    .line 55
    return-object v0

    .line 56
    :cond_2
    :goto_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 57
    .line 58
    return-object p1
.end method
