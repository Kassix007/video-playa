.class public final LU1/y;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public final synthetic r:Lu/d0;

.field public final synthetic s:LP/W;

.field public final synthetic t:LP/b0;


# direct methods
.method public constructor <init>(Lu/d0;LP/W;LP/b0;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU1/y;->r:Lu/d0;

    .line 2
    .line 3
    iput-object p2, p0, LU1/y;->s:LP/W;

    .line 4
    .line 5
    iput-object p3, p0, LU1/y;->t:LP/b0;

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
    new-instance p1, LU1/y;

    .line 2
    .line 3
    iget-object v0, p0, LU1/y;->s:LP/W;

    .line 4
    .line 5
    iget-object v1, p0, LU1/y;->t:LP/b0;

    .line 6
    .line 7
    iget-object v2, p0, LU1/y;->r:Lu/d0;

    .line 8
    .line 9
    invoke-direct {p1, v2, v0, v1, p2}, LU1/y;-><init>(Lu/d0;LP/W;LP/b0;Lq5/c;)V

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
    invoke-virtual {p0, p1, p2}, LU1/y;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LU1/y;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LU1/y;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, LU1/y;->q:I

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
    iget-object p1, p0, LU1/y;->s:LP/W;

    .line 24
    .line 25
    invoke-interface {p1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {p1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Ljava/util/List;

    .line 36
    .line 37
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    add-int/lit8 p1, p1, -0x2

    .line 42
    .line 43
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, LT1/d;

    .line 48
    .line 49
    iget-object v0, p0, LU1/y;->t:LP/b0;

    .line 50
    .line 51
    invoke-virtual {v0}, LP/b0;->e()F

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    iput v1, p0, LU1/y;->q:I

    .line 56
    .line 57
    iget-object v1, p0, LU1/y;->r:Lu/d0;

    .line 58
    .line 59
    invoke-virtual {v1, v0, p1, p0}, Lu/d0;->w(FLjava/lang/Object;Ls5/i;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 64
    .line 65
    if-ne p1, v0, :cond_2

    .line 66
    .line 67
    return-object v0

    .line 68
    :cond_2
    :goto_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 69
    .line 70
    return-object p1
.end method
