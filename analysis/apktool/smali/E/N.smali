.class public final LE/N;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public final synthetic r:Lk3/c;


# direct methods
.method public constructor <init>(Lk3/c;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LE/N;->r:Lk3/c;

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
    .locals 1

    .line 1
    new-instance p1, LE/N;

    .line 2
    .line 3
    iget-object v0, p0, LE/N;->r:Lk3/c;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, LE/N;-><init>(Lk3/c;Lq5/c;)V

    .line 6
    .line 7
    .line 8
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
    invoke-virtual {p0, p1, p2}, LE/N;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LE/N;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LE/N;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, LE/N;->q:I

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
    iget-object p1, p0, LE/N;->r:Lk3/c;

    .line 24
    .line 25
    iget-object p1, p1, Lk3/c;->q:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p1, Lu/l;

    .line 28
    .line 29
    new-instance v0, Ljava/lang/Float;

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    invoke-direct {v0, v2}, Ljava/lang/Float;-><init>(F)V

    .line 33
    .line 34
    .line 35
    new-instance v2, Ljava/lang/Float;

    .line 36
    .line 37
    const/high16 v3, 0x3f000000    # 0.5f

    .line 38
    .line 39
    invoke-direct {v2, v3}, Ljava/lang/Float;-><init>(F)V

    .line 40
    .line 41
    .line 42
    invoke-static {v1, v2}, Lu/d;->o(ILjava/lang/Object;)Lu/f0;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    iput v1, p0, LE/N;->q:I

    .line 47
    .line 48
    invoke-static {p1, v0, v2, p0}, Lu/d;->h(Lu/l;Ljava/lang/Float;Lu/f0;Ls5/i;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 53
    .line 54
    if-ne p1, v0, :cond_2

    .line 55
    .line 56
    return-object v0

    .line 57
    :cond_2
    :goto_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 58
    .line 59
    return-object p1
.end method
