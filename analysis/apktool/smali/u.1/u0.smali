.class public final Lu/u0;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:F

.field public r:I

.field public synthetic s:Ljava/lang/Object;

.field public final synthetic t:Lu/v0;


# direct methods
.method public constructor <init>(Lu/v0;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu/u0;->t:Lu/v0;

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
    new-instance v0, Lu/u0;

    .line 2
    .line 3
    iget-object v1, p0, Lu/u0;->t:Lu/v0;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lu/u0;-><init>(Lu/v0;Lq5/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lu/u0;->s:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lu/u0;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lu/u0;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lu/u0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v0, p0, Lu/u0;->r:I

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
    iget v0, p0, Lu/u0;->q:F

    .line 9
    .line 10
    iget-object v2, p0, Lu/u0;->s:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, LM5/w;

    .line 13
    .line 14
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1

    .line 26
    :cond_1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lu/u0;->s:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p1, LM5/w;

    .line 32
    .line 33
    invoke-interface {p1}, LM5/w;->d()Lq5/h;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v0}, Lu/d;->m(Lq5/h;)F

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    move-object v2, p1

    .line 42
    :cond_2
    :goto_0
    invoke-static {v2}, LM5/y;->r(LM5/w;)Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_3

    .line 47
    .line 48
    new-instance p1, Lu/t0;

    .line 49
    .line 50
    iget-object v3, p0, Lu/u0;->t:Lu/v0;

    .line 51
    .line 52
    invoke-direct {p1, v3, v0}, Lu/t0;-><init>(Lu/v0;F)V

    .line 53
    .line 54
    .line 55
    iput-object v2, p0, Lu/u0;->s:Ljava/lang/Object;

    .line 56
    .line 57
    iput v0, p0, Lu/u0;->q:F

    .line 58
    .line 59
    iput v1, p0, Lu/u0;->r:I

    .line 60
    .line 61
    invoke-interface {p0}, Lq5/c;->getContext()Lq5/h;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-static {v3}, LP/b;->o(Lq5/h;)LP/T;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-interface {v3, p1, p0}, LP/T;->e(LB5/c;Ls5/c;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    sget-object v3, Lr5/a;->q:Lr5/a;

    .line 74
    .line 75
    if-ne p1, v3, :cond_2

    .line 76
    .line 77
    return-object v3

    .line 78
    :cond_3
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 79
    .line 80
    return-object p1
.end method
