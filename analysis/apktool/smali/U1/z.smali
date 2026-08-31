.class public final LU1/z;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public final synthetic r:F

.field public final synthetic s:Lu/d0;

.field public final synthetic t:LT1/d;


# direct methods
.method public constructor <init>(FLu/d0;LT1/d;Lq5/c;)V
    .locals 0

    .line 1
    iput p1, p0, LU1/z;->r:F

    .line 2
    .line 3
    iput-object p2, p0, LU1/z;->s:Lu/d0;

    .line 4
    .line 5
    iput-object p3, p0, LU1/z;->t:LT1/d;

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
    new-instance p1, LU1/z;

    .line 2
    .line 3
    iget-object v0, p0, LU1/z;->s:Lu/d0;

    .line 4
    .line 5
    iget-object v1, p0, LU1/z;->t:LT1/d;

    .line 6
    .line 7
    iget v2, p0, LU1/z;->r:F

    .line 8
    .line 9
    invoke-direct {p1, v2, v0, v1, p2}, LU1/z;-><init>(FLu/d0;LT1/d;Lq5/c;)V

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
    invoke-virtual {p0, p1, p2}, LU1/z;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LU1/z;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LU1/z;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v0, p0, LU1/z;->q:I

    .line 2
    .line 3
    sget-object v1, Lm5/y;->a:Lm5/y;

    .line 4
    .line 5
    iget-object v2, p0, LU1/z;->s:Lu/d0;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget v4, p0, LU1/z;->r:F

    .line 9
    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x1

    .line 12
    sget-object v7, Lr5/a;->q:Lr5/a;

    .line 13
    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    if-eq v0, v6, :cond_1

    .line 17
    .line 18
    if-ne v0, v5, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-object v1

    .line 24
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :cond_1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    cmpl-float p1, v4, v3

    .line 40
    .line 41
    if-lez p1, :cond_3

    .line 42
    .line 43
    iput v6, p0, LU1/z;->q:I

    .line 44
    .line 45
    iget-object p1, v2, Lu/d0;->s:LP/f0;

    .line 46
    .line 47
    invoke-virtual {p1}, LP/f0;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {v2, v4, p1, p0}, Lu/d0;->w(FLjava/lang/Object;Ls5/i;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    if-ne p1, v7, :cond_3

    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_3
    :goto_0
    cmpg-float p1, v4, v3

    .line 59
    .line 60
    if-nez p1, :cond_7

    .line 61
    .line 62
    iput v5, p0, LU1/z;->q:I

    .line 63
    .line 64
    iget-object p1, v2, Lu/d0;->v:Lu/v0;

    .line 65
    .line 66
    if-nez p1, :cond_5

    .line 67
    .line 68
    :cond_4
    :goto_1
    move-object p1, v1

    .line 69
    goto :goto_2

    .line 70
    :cond_5
    iget-object v0, v2, Lu/d0;->t:LP/f0;

    .line 71
    .line 72
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    iget-object v3, p0, LU1/z;->t:LT1/d;

    .line 77
    .line 78
    invoke-static {v0, v3}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_6

    .line 83
    .line 84
    iget-object v0, v2, Lu/d0;->s:LP/f0;

    .line 85
    .line 86
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-static {v0, v3}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-eqz v0, :cond_6

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_6
    iget-object v0, v2, Lu/d0;->B:Lu/O;

    .line 98
    .line 99
    new-instance v4, Lu/a0;

    .line 100
    .line 101
    const/4 v5, 0x0

    .line 102
    invoke-direct {v4, v3, v5, v2, p1}, Lu/a0;-><init>(Ljava/lang/Object;Lq5/c;Lu/d0;Lu/v0;)V

    .line 103
    .line 104
    .line 105
    invoke-static {v0, v4, p0}, Lu/O;->a(Lu/O;LB5/c;Lq5/c;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    if-ne p1, v7, :cond_4

    .line 110
    .line 111
    :goto_2
    if-ne p1, v7, :cond_7

    .line 112
    .line 113
    :goto_3
    return-object v7

    .line 114
    :cond_7
    return-object v1
.end method
