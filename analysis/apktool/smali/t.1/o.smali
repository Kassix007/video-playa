.class public final Lt/o;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:Lu/v0;

.field public final synthetic t:LP/W;


# direct methods
.method public constructor <init>(Lu/v0;LP/W;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lt/o;->s:Lu/v0;

    .line 2
    .line 3
    iput-object p2, p0, Lt/o;->t:LP/W;

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
    new-instance v0, Lt/o;

    .line 2
    .line 3
    iget-object v1, p0, Lt/o;->s:Lu/v0;

    .line 4
    .line 5
    iget-object v2, p0, Lt/o;->t:LP/W;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Lt/o;-><init>(Lu/v0;LP/W;Lq5/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lt/o;->r:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LP/k0;

    .line 2
    .line 3
    check-cast p2, Lq5/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lt/o;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lt/o;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lt/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lt/o;->q:I

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
    iget-object p1, p0, Lt/o;->r:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p1, LP/k0;

    .line 26
    .line 27
    new-instance v0, Lt/n;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    iget-object v3, p0, Lt/o;->s:Lu/v0;

    .line 31
    .line 32
    invoke-direct {v0, v3, v2}, Lt/n;-><init>(Lu/v0;I)V

    .line 33
    .line 34
    .line 35
    new-instance v2, LP/Q0;

    .line 36
    .line 37
    const/4 v4, 0x0

    .line 38
    invoke-direct {v2, v0, v4}, LP/Q0;-><init>(LB5/a;Lq5/c;)V

    .line 39
    .line 40
    .line 41
    new-instance v0, Lu2/m;

    .line 42
    .line 43
    invoke-direct {v0, v2}, Lu2/m;-><init>(LB5/e;)V

    .line 44
    .line 45
    .line 46
    new-instance v2, LN/f;

    .line 47
    .line 48
    iget-object v4, p0, Lt/o;->t:LP/W;

    .line 49
    .line 50
    const/4 v5, 0x4

    .line 51
    invoke-direct {v2, p1, v3, v4, v5}, LN/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 52
    .line 53
    .line 54
    iput v1, p0, Lt/o;->q:I

    .line 55
    .line 56
    invoke-virtual {v0, v2, p0}, Lu2/m;->collect(LP5/i;Lq5/c;)Ljava/lang/Object;

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
