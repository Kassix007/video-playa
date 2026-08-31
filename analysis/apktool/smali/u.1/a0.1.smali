.class public final Lu/a0;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public q:I

.field public final synthetic r:Lu/d0;

.field public final synthetic s:Ljava/lang/Object;

.field public final synthetic t:Lu/v0;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lq5/c;Lu/d0;Lu/v0;)V
    .locals 0

    .line 1
    iput-object p3, p0, Lu/a0;->r:Lu/d0;

    .line 2
    .line 3
    iput-object p1, p0, Lu/a0;->s:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p4, p0, Lu/a0;->t:Lu/v0;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1, p2}, Ls5/i;-><init>(ILq5/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Lq5/c;)Lq5/c;
    .locals 4

    .line 1
    new-instance v0, Lu/a0;

    .line 2
    .line 3
    iget-object v1, p0, Lu/a0;->s:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lu/a0;->t:Lu/v0;

    .line 6
    .line 7
    iget-object v3, p0, Lu/a0;->r:Lu/d0;

    .line 8
    .line 9
    invoke-direct {v0, v1, p1, v3, v2}, Lu/a0;-><init>(Ljava/lang/Object;Lq5/c;Lu/d0;Lu/v0;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Lq5/c;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lu/a0;->create(Lq5/c;)Lq5/c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lu/a0;

    .line 8
    .line 9
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Lu/a0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lu/a0;->q:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, Lu/a0;->t:Lu/v0;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    goto :goto_1

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
    iget-object p1, p0, Lu/a0;->r:Lu/d0;

    .line 26
    .line 27
    invoke-virtual {p1}, Lu/d0;->v()V

    .line 28
    .line 29
    .line 30
    iget-object v0, p1, Lu/d0;->s:LP/f0;

    .line 31
    .line 32
    const-wide/high16 v3, -0x8000000000000000L

    .line 33
    .line 34
    iput-wide v3, p1, Lu/d0;->C:J

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    invoke-virtual {p1, v3}, Lu/d0;->y(F)V

    .line 38
    .line 39
    .line 40
    iget-object v4, p1, Lu/d0;->t:LP/f0;

    .line 41
    .line 42
    invoke-virtual {v4}, LP/f0;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    iget-object v5, p0, Lu/a0;->s:Ljava/lang/Object;

    .line 47
    .line 48
    invoke-virtual {v5, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    const/high16 v6, -0x3fc00000    # -3.0f

    .line 53
    .line 54
    if-eqz v4, :cond_2

    .line 55
    .line 56
    const/high16 v4, -0x3f800000    # -4.0f

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-virtual {v5, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-eqz v4, :cond_3

    .line 68
    .line 69
    const/high16 v4, -0x3f600000    # -5.0f

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    move v4, v6

    .line 73
    :goto_0
    invoke-virtual {v2, v5}, Lu/v0;->p(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    const-wide/16 v7, 0x0

    .line 77
    .line 78
    invoke-virtual {v2, v7, v8}, Lu/v0;->n(J)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v5}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, v3}, Lu/d0;->y(F)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, v5}, Lu/d0;->l(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2, v4}, Lu/v0;->j(F)V

    .line 91
    .line 92
    .line 93
    cmpg-float v0, v4, v6

    .line 94
    .line 95
    if-nez v0, :cond_4

    .line 96
    .line 97
    iput v1, p0, Lu/a0;->q:I

    .line 98
    .line 99
    invoke-static {p1, p0}, Lu/d0;->t(Lu/d0;Ls5/c;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 104
    .line 105
    if-ne p1, v0, :cond_4

    .line 106
    .line 107
    return-object v0

    .line 108
    :cond_4
    :goto_1
    invoke-virtual {v2}, Lu/v0;->i()V

    .line 109
    .line 110
    .line 111
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 112
    .line 113
    return-object p1
.end method
